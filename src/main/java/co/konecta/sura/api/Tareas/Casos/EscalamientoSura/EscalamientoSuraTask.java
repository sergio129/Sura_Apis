package co.konecta.sura.api.Tareas.Casos.EscalamientoSura;

import co.konecta.sura.api.Modelos.Casos.EscalamientoSura.EscalamientoSuraModel;
import co.konecta.sura.api.Tareas.Casos.Casos.CreacionCasoTask;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class EscalamientoSuraTask implements Task {
    private final EscalamientoSuraModel suraModel;

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.given()
                .body("{\n" +
                        "    \"typeManagement\": " + suraModel.getTypeManagement() + ",\n" +
                        "    \"personManagement\": " + suraModel.getPersonManagement() + ",\n" +
                        "    \"typeReply\": " + suraModel.getTypeReply() + ",\n" +
                        "    \"generateComplaint\": " + suraModel.getGenerateComplaint() + ",\n" +
                        "    \"filedComplaint\": \"" + suraModel.getFiledComplaint() + "\",\n" +
                        "    \"observation\": \"" + suraModel.getObservation() + "\",\n" +
                        "    \"recordingTime\": 0,\n" +
                        "    \"moduleId\": 20,\n" +
                        "    \"action\": \"Guardar\",\n" +
                        "    \"case_id\": \"" + CreacionCasoTask.CaseID() + "\",\n" +
                        "    \"ss_id\": \"\",\n" +
                        "    \"countCharacter\": 10,\n" +
                        "    \"startTime\": null,\n" +
                        "    \"endTime\": null,\n" +
                        "    \"token\": \"" + LoginSaraTask.tokenLogin() + "\"\n" +
                        "}")
                .post("suraScalings/save")
                .then()
                .body("message", equalTo("Registro guardado correctamente"));
    }

    public static EscalamientoSuraTask EscribirDatos(EscalamientoSuraModel suraModel) {
        return new EscalamientoSuraTask(suraModel);
    }

}
