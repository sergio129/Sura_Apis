package co.konecta.sura.api.Tareas.Parametrizaciones.BotOfertamiento;

import co.konecta.sura.api.Modelos.Parametrizaciones.BotMonitoreo.BotMonitoreoHabilitarModel;
import co.konecta.sura.api.Modelos.Parametrizaciones.BotOfertamiento.BotOfertamientoHabilitarModel;
import co.konecta.sura.api.Tareas.Parametrizaciones.BotMonitoreo.BotMonitoreoHabilitarTask;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class BotOfertamientoHabilitarTask implements Task {
    private final BotOfertamientoHabilitarModel habilitarModel;

    @Override
    public <T extends Actor> void performAs(T actor) {

        SerenityRest.given()
                .when()
                .body("{\"op_id\": " + habilitarModel.getOp_id() + ",\n" +
                        "\"status\": " + habilitarModel.getStatus() + ",\n" +
                        "\"token\": \"" + habilitarModel.getToken() + "\"}")

                .post("/offertChattigoParametrization/changeStatusParametrization")
                .then()
                .body("message", equalTo("Parametrización habilitada/deshabilitada con éxito"));

        System.out.println("Token: "+habilitarModel.getToken());

    }

    public static BotOfertamientoHabilitarTask EscribirDatos(BotOfertamientoHabilitarModel habilitarModel) {
        return new BotOfertamientoHabilitarTask(habilitarModel);
    }
}
