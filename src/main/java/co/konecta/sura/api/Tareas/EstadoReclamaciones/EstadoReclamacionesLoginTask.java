package co.konecta.sura.api.Tareas.EstadoReclamaciones;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static org.hamcrest.Matchers.equalTo;

public class EstadoReclamacionesLoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.given()

                .body("{\"userName\":\"claim.status\",\n" +
                        "\"password\":\"St4TuSc14Im\" }")
                .post("/users/voicebot/auth")
                .then()
                .body("message", equalTo("Autenticación exitosa"));
        Serenity.setSessionVariable("token").to(CapturartokenEstadoReclamaciones());
    }

    public static EstadoReclamacionesLoginTask EscribirDatos() {
        return new EstadoReclamacionesLoginTask();
    }

    public static String CapturartokenEstadoReclamaciones() {
        String cadena = (SerenityRest.lastResponse().body().jsonPath().getString("data"));
        return cadena;
    }

    public static String tokenLoginEstadoReclamaciones() {
        return Serenity.sessionVariableCalled("token");
    }
}
