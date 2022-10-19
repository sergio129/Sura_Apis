package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Modelos.Parametrizaciones.IndicativosMarcacion.IndicativosMarcacionDeleteModel;
import co.konecta.sura.api.Modelos.Tareas.Parametrizaciones.IndicativosMarcacion.IndicativoMarcacionDeleteTask;
import co.konecta.sura.api.Modelos.Tareas.Parametrizaciones.IndicativosMarcacion.IndicativosMarcacionCrearTask;
import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import co.konecta.sura.api.Modelos.Parametrizaciones.IndicativosMarcacion.IndicativosMarcacionModel;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class IndicativosMarcacionStepDefinitions {
    Actor actor = Actor.named("Sergio");
    IndicativosMarcacionModel indicativos = new IndicativosMarcacionModel();
    IndicativosMarcacionDeleteModel delete = new IndicativosMarcacionDeleteModel();

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
        actor.attemptsTo(IndicativosMarcacionCrearTask.EscribirDatos(indicativos));
    }

    @And("^Ingresamos los datos eliminar: (.*) (.*)$")
    public void ingresamosLosDatosIdToken(int id, String token) {
        this.delete.setId(id);
        this.delete.setToken(LoginSaraStepDefinitions.Remplazardatos());
        actor.attemptsTo(IndicativoMarcacionDeleteTask.inf(delete));

    }
}
