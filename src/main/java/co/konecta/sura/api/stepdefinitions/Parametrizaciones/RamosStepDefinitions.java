package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Modelos.ParametrizacionRamosModel;
import co.konecta.sura.api.Tareas.Parametrizaciones.RamosTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;



public class RamosStepDefinitions {
    public static final String restApiUrlSaraExterna = "https://saralabs.grupokonecta.co:8591/api";
    ParametrizacionRamosModel Ramo = new ParametrizacionRamosModel();
    Actor actor = new Actor("Usuario");

    @Before
    public void setUp() {
        Actor actor = Actor.named("Sergio");
        actor.whoCan(CallAnApi.at(restApiUrlSaraExterna));
    }

    @Given("Parametrizacion de ramos")
    public void parametrizacion_de_ramos() {

    }




    @And("Ingreamos  Linea {int}, Nombre{string}, Token{string}")
    public void ingreamosLineaNombreToken(int Linea, String branch, String arg2) {
        this.Ramo.setLinea(Linea);
        this.Ramo.setBranch(branch);
        this.Ramo.setToken(SerenityRest.lastResponse().body().jsonPath().getString("data"));
        actor.attemptsTo(RamosTask.EscribirDatos(Ramo));
    }
}
