package co.konecta.sura.api.Tareas.Parametrizaciones.BotMonitoreo;

import co.konecta.sura.api.Modelos.Parametrizaciones.BotMonitoreo.BotMonitoreoHabilitarModel;
import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import io.restassured.RestAssured;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class BotMonitoreoHabilitarTask implements Task {
    private final BotMonitoreoHabilitarModel habilitar;
    @Override
    public <T extends Actor> void performAs(T actor) {

        RestAssured.given()
                .body("{\"pm_id\": "+habilitar.getPm_id()+",\n" +
                        "\"status\": "+habilitar.getStatus()+",\n" +
                        "\"token\": \n" +
                        "\""+LoginSaraStepDefinitions.Remplazardatos()+"\"}")
                .post("/monitoringBotParametrization/changeStatusParametrization")
                .then()
                .statusCode(200).body("message", equalTo("Parametrización habilitada/deshabilitada con éxito"));
    }
    public static BotMonitoreoHabilitarTask Datos(BotMonitoreoHabilitarModel habilitar){
        return new BotMonitoreoHabilitarTask(habilitar);
    }
}
