package co.konecta.sura.api.Tareas.Parametrizaciones.BotMonitoreo;

import co.konecta.sura.api.Modelos.Parametrizaciones.BotMonitoreo.BotmonitoreoModel;
import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import io.restassured.RestAssured;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalTo;
@AllArgsConstructor
public class BotmonitoreoTask implements Task {


private final BotmonitoreoModel botmodel;


    @Override
    public <T extends Actor> void performAs(T actor) {
        RestAssured.given()
                .body("{\"coordination_manager\":" + botmodel.getCoordination_manager() + " ,\n" +
                        "\"departments\": [" + botmodel.getDepartments() + "],\n" +
                        "\"lines\": [" + botmodel.getLines() + "],\n" +
                        "\"municipalities\": [" + botmodel.getMunicipalities() + "],\n" +
                        "\"name\": \"" + botmodel.getName() + "\",\n" +
                        "\"service_type\": [" + botmodel.getTask_type() + "],\n" +
                        "\"special_services\": [" + botmodel.getSpecial_services() + "],\n" +
                        "\"task_type\": [" + botmodel.getTask_type() + "],\n" +
                        "\"token\": \"" + LoginSaraStepDefinitions.Remplazardatos()  + "\"}")
                .post("/monitoringBotParametrization/saveParametrization")
                .then()
                .statusCode(200).body("message", equalTo("Registro guardado correctamente"));


    }

    public static BotmonitoreoTask DatosBotMonitoreo(BotmonitoreoModel botmodel) {
        return instrumented (BotmonitoreoTask.class, botmodel);
      
    }

}
