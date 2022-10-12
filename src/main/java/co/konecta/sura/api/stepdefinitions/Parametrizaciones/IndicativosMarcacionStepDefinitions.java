package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import co.konecta.sura.api.Tareas.Parametrizaciones.IndicativosMarcacionTask;
import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import co.konecta.sura.api.stepdefinitions.Modelos.Parametrizaciones.IndicativosMarcacionModel;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class IndicativosMarcacionStepDefinitions {
    Actor actor = Actor.named("Sergio");
    IndicativosMarcacionModel indicativos = new IndicativosMarcacionModel();

    @Before
    public void setUp() {

        actor.whoCan(CallAnApi.at(restApiUrlSara));
    }

    @Given("Crear, Editar, Eliminar")
    public void crear_editar_eliminar() {
    }

    @And("^Ingresamos los datos:  (.*) (.*) (.*) (.*)$")
    public void ingresamosLosDatosCityIndicativeStateToken(int city, String indicative, int state, String Token) {
        this.indicativos.setCity(city);
        this.indicativos.setIndicative(indicative);
        this.indicativos.setState(state);
        this.indicativos.setToken(LoginSaraStepDefinitions.Remplazardatos());
        actor.attemptsTo(IndicativosMarcacionTask.EscribirDatos(indicativos));
    }
}
