package co.konecta.sura.api.Tareas.Casos.Finalizacion;

import co.konecta.sura.api.Tareas.Casos.Casos.CreacionCasoTask;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class FinalizacionTask implements Task {
    private String endingWith, typeResponse, description;

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.given()
                .body("{\n" +
                        "    \"endingWith\": " + endingWith + ",\n" +
                        "    \"typeResponse\": " + typeResponse + ",\n" +
                        "    \"description\": \"" + description + "\",\n" +
                        "    \"id\": \"\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"date_modified\": \"\",\n" +
                        "    \"recordingTime\": 0,\n" +
                        "    \"moduleId\": 24,\n" +
                        "    \"action\": \"Guardar\",\n" +
                        "    \"case_id\": \"" + CreacionCasoTask.CaseID() + "\",\n" +
                        "    \"countCharacter\": 7,\n" +
                        "    \"startTime\": null,\n" +
                        "    \"endTime\": null,\n" +
                        "    \"token\": \"" + LoginSaraTask.tokenLogin() + "\"\n" +
                        "}")
                .post("ending/save")
                .then()
                .body("message", equalTo("Registro guardado correctamente"));
    }

    public static FinalizacionTask EscribirDatosFinzalizacion(String endingWith, String typeResponse, String description) {
        return new FinalizacionTask(endingWith, typeResponse, description);
    }
}
