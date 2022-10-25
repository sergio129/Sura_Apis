package co.konecta.sura.api.Tareas.Parametrizaciones.NotificacionesPush;

import co.konecta.sura.api.Modelos.Otros.DatosComunesModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class NotificacionesPushEliminarTask implements Task {
    private final DatosComunesModel comunesModel;

    @Override
    public <T extends Actor> void performAs(T konecta) {
        SerenityRest.given()
                .when()
                .body("{\"id\":" + comunesModel.getId() + ",\n" +
                        "\"token\": \"" + comunesModel.getToken() + "\"}")
                .post("/push/delete")
                .then();

    }

    public static NotificacionesPushEliminarTask datos(DatosComunesModel comunesModel) {
        return new NotificacionesPushEliminarTask(comunesModel);
    }
}
