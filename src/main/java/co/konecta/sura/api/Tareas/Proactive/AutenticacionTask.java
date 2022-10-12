package co.konecta.sura.api.Tareas.Proactive;

import co.konecta.sura.api.stepdefinitions.Modelos.Otros.LoginProactive;
import co.konecta.sura.api.interaccion.Post;

import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class AutenticacionTask implements Task {

    private final LoginProactive datoslogin;


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Post.to("/users/bot/auth")
                        .with(requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(datoslogin)
                        ));

      //  String Respuestas = SerenityRest.lastResponse().body().jsonPath().getString("data");


    }

    public static Performable InfoProactive(LoginProactive datoslogin) {

        return instrumented(AutenticacionTask.class, datoslogin);
    }

}
