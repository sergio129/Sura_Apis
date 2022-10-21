package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Tareas.Parametrizaciones.TiemposAlertas.TiemposAlertasTask;
import co.konecta.sura.api.conf.ConfiguracionGeneral;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class TiemposdeAlertasStepDefinitions {
    Actor actor = Actor.named("Sergio");
    ConfiguracionGeneral conf = new ConfiguracionGeneral();

    @Before
    public void setUp() {
        conf.Configuracion();
        actor.whoCan(CallAnApi.at(restApiUrlSara));
    }

    @Given("Crear, Editar, Eliminar Parametrizacion tiempos de alertas")
    public void crear_editar_eliminar_parametrizacion_tiempos_de_alertas() {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^Ingresamos los datos tiempos de alertas  (.*) (.*) (.*) (.*)$")
    public void ingresamos_los_datos_tiempos_de_alertas_xxxxxx(String lines, String services, String time, String token) {
        actor.attemptsTo(TiemposAlertasTask.Datostiempos(lines, services, time, token));
    }
}
