package co.konecta.sura.api.Tareas.Parametrizaciones.NotificacionesPush;

import co.konecta.sura.api.Modelos.Parametrizaciones.NotificacionesPush.NotificacionesPushModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class NotificacionesPushTask implements Task {
    private final NotificacionesPushModel pushModel;

    @Override
    public <T extends Actor> void performAs(T konecta) {
        SerenityRest.given()
                .when()
                .body("{\"id_line\": ["+pushModel.getId_line()+"],\n" +
                        "\"id_role\": "+pushModel.getId_role()+",\n" +
                        "\"id_service\": ["+pushModel.getId_service()+"],\n" +
                        "\"id_status\": "+pushModel.getId_status()+",\n" +
                        "\"time_appointment_one\": \"" + pushModel.getTime_appointment_one() + "\",\n" +
                        "\"time_appointment_two\": \"" + pushModel.getTime_moment_two() + "\",\n" +
                        "\"time_moment_one\": \"" + pushModel.getTime_moment_one() + "\",\n" +
                        "\"time_moment_two\": \"" + pushModel.getTime_moment_two() + "\",\n" +
                        "\"token\": \"" + pushModel.getToken() + "\"}")
                .post("/push/save")
                .then();


    }

    public static NotificacionesPushTask datos(NotificacionesPushModel pushModel) {
        return new NotificacionesPushTask(pushModel);
    }
}
