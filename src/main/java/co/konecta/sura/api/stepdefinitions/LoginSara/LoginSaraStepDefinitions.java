package co.konecta.sura.api.stepdefinitions.LoginSara;

import co.konecta.sura.api.Modelos.LoginSaraModel;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class LoginSaraStepDefinitions {

    private static final String restApiUrlSara = "https://saralabs.grupokonecta.co:8591/api";
    Actor actor = Actor.named("Sergio");
    private  LoginSaraModel datos = new LoginSaraModel();

    @Before
    public void setUp() {

        actor.whoCan(CallAnApi.at(restApiUrlSara));
    }

    @Given("ingresar por la api de login de Sara")
    public void ingresar_por_la_api_de_login_de_Sara() {

    }


    @When("Ingresar datos api login sara contrasena:{string},proveedores {int}, Estrellas {int}, Justifi:{string}, Usuario:{string}")
    public void ingresarDatosApiLoginSaraContrasenaProveedoresEstrellasJustifiUsuario(String password, int provider, int survey, String surveyJustification, String username) {
        this.datos.setPassword(password);
        this.datos.setProvider(provider);
        this.datos.setSurvey(survey);
        this.datos.setSurveyJustification(surveyJustification);
        this.datos.setUsername(username);
        actor.attemptsTo(LoginSaraTask.EscribirDatoLogin(datos));


    }
}

