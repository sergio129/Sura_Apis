package co.konecta.sura.api.Tareas.LoginSara;

import co.konecta.sura.api.Modelos.Otros.LoginSaraModel;
import io.restassured.http.ContentType;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.io.*;

import static co.konecta.sura.api.VariablesSesion.VaraiblesSesion.GUARDARTOKEN;
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
                        .body(login)));
      Serenity.setSessionVariable("token").to(Capturartoken());
    }

    public static LoginSaraTask EscribirDatoLogin(LoginSaraModel login) {
        return instrumented(LoginSaraTask.class, login);
    }



    public static String Capturartoken() {
        String cadena = (SerenityRest.lastResponse().body().jsonPath().getString("data"));
        String cadena1;
        String cadena2;
        String cadena3;
        cadena1 = cadena.replace("[", "");
        cadena2 = cadena1.replace("]", "");
        return cadena2;
    }

public static String tokenLogin(){
        return Serenity.sessionVariableCalled("token");
}


}
