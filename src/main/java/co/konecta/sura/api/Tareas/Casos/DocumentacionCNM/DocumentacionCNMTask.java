package co.konecta.sura.api.Tareas.Casos.DocumentacionCNM;

import co.konecta.sura.api.Modelos.Casos.DocumentacionCNM.DocumentacionCNMModel;
import co.konecta.sura.api.Modelos.Casos.Novedades.NovedadesModel;
import co.konecta.sura.api.Tareas.Casos.Casos.CreacionCasoTask;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class DocumentacionCNMTask implements Task {
private DocumentacionCNMModel model;
    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.given()
                .body("{\n" +
                        "    \"personManagement\": "+model.getPersonManagement()+",\n" +
                        "    \"generateComplaint\": "+model.getGenerateComplaint()+",\n" +
                        "    \"filedComplaint\": \""+model.getFiledComplaint()+"\",\n" +
                        "    \"description\": \""+model.getDescription()+"\",\n" +
                        "    \"recordingTime\": 0,\n" +
                        "    \"moduleId\": 23,\n" +
                        "    \"action\": \"Guardar\",\n" +
                        "    \"case_id\": \""+ CreacionCasoTask.CaseID()+"\",\n" +
                        "    \"countCharacter\": 8,\n" +
                        "    \"startTime\": null,\n" +
                        "    \"endTime\": null,\n" +
                        "    \"token\": \""+ LoginSaraTask.tokenLogin()+"\"\n" +
                        "}")
                .post("cnmDocumentation/save")
                .then()
                .body("message", equalTo("Registro guardado correctamente"));

    }
    public static DocumentacionCNMTask EscribirDatosDocumentacionCNM(DocumentacionCNMModel model){
        return new DocumentacionCNMTask(model);
    }
}
