package co.konecta.sura.api.stepdefinitions.LoginSara;

import co.konecta.sura.api.Modelos.Otros.LoginSaraModel;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.io.*;

import static co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask.Capturartoken2;

public class LoginSaraStepDefinitions {

    public static final String restApiUrlSara = "https://saralabs.grupokonecta.co:8591/api";
    Actor actor = Actor.named("Sergio");
    private LoginSaraModel datos = new LoginSaraModel();

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
        File f;
        f = new File("Token.properties");
        try {

            FileWriter w = new FileWriter(f);

            BufferedWriter bw = new BufferedWriter(w);

            PrintWriter wr = new PrintWriter(bw);

            wr.write("valido.token.user=" + Capturartoken2());//escribimos en el archivo
            wr.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String Remplazardatos() {
        String cadena = (SerenityRest.lastResponse().body().jsonPath().getString("data"));
        String cadena1;
        String cadena2;
        cadena1 = cadena.replace("[", "");
        cadena2 = cadena1.replace("]", "");
        return cadena2;
    }

    @When("Ingresamos los datos de login")
    public void ingresamosLosDatosDeLogin() {

    }
}

