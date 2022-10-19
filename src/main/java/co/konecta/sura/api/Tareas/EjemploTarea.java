package co.konecta.sura.api.Tareas;

import co.konecta.sura.api.interaccion.Post;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EjemploTarea implements Task {
    private final Object userInfo;

    public EjemploTarea(Object userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to("/users/bot/auth")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON)
                        .body(userInfo))
        );


    }
    public static Performable Info(Object UserInfo){
        return instrumented(EjemploTarea.class, UserInfo);
    }
}
