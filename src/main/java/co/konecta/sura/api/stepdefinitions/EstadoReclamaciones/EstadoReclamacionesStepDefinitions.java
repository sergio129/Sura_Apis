package co.konecta.sura.api.stepdefinitions.EstadoReclamaciones;

import co.konecta.sura.api.Tareas.EstadoReclamaciones.EstadoReclamacionesLoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class EstadoReclamacionesStepDefinitions {
    Actor konecta = Actor.named("Sergio");

    @Before
    public void setUp() {
        konecta.whoCan(CallAnApi.at(restApiUrlSara));

    }
    @Given("logueamos en api de modulo estado de reclamaciones")
    public void logueamos_en_api_de_modulo_estado_de_reclamaciones() {
       konecta.attemptsTo(EstadoReclamacionesLoginTask.EscribirDatos());
    }
}
