package co.konecta.sura.api.Tareas.LoginSara;

import co.konecta.sura.api.Modelos.LoginSaraModel;
import co.konecta.sura.api.interaccion.Post;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginSaraTask implements Task {
    private final LoginSaraModel login;

    public LoginSaraTask(LoginSaraModel login) {
        this.login = login;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to("/auth/login")
                .with(requestLogin -> requestLogin
                        .contentType(ContentType.JSON)
                        .body(login))
        );

    }
    public static LoginSaraTask EscribirDatoLogin(LoginSaraModel login){
        return instrumented( LoginSaraTask.class,login);
    }
}
