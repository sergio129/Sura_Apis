package co.konecta.sura.api.Tareas.Parametrizaciones.DestinatiosAlertas;

import co.konecta.sura.api.Modelos.Parametrizaciones.DestinatariosAlertas.DestinatariosAlertasModel;
import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import io.restassured.RestAssured;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class DestinatariosAlertasTask implements Task {
    private final DestinatariosAlertasModel alertasModel;
    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.given()
                .body("{\"departments\": ["+alertasModel.getDepartments()+"],\n" +
                        "\"emails\": \""+alertasModel.getEmails()+"\",\n" +
                        "\"lines\": ["+alertasModel.getLines()+"],\n" +
                        "\"municipalies\": ["+alertasModel.getMunicipalies()+"],\n" +
                        "\"par_name\": \""+alertasModel.getPar_name()+"\",\n" +
                        "\"services\": ["+alertasModel.getServices()+"],\n" +
                        "\"token\": \""+LoginSaraStepDefinitions.Remplazardatos()+"\"}")
                .post("/alertReceivers/save")
                .then()
                .statusCode(200).body("message", equalTo("Registro guardado correctamente"));

    }
    public static DestinatariosAlertasTask datos(DestinatariosAlertasModel alertasModel){
        return new DestinatariosAlertasTask(alertasModel);
    }
}
