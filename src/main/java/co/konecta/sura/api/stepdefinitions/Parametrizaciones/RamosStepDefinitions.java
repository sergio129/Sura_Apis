package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Modelos.ParametrizacionRamosModel;
import co.konecta.sura.api.Tareas.Parametrizaciones.RamosTask;
import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;


public class RamosStepDefinitions {
    public static final String restApiUrlSaraExterna = "https://saralabs.grupokonecta.co:8591/api";
    private ParametrizacionRamosModel ramosModel = new ParametrizacionRamosModel();
    Actor actor = new Actor("Usuario");

    @Before
    public void setUp() {
        actor.whoCan(CallAnApi.at(restApiUrlSaraExterna));
    }

    @Given("Parametrizacion de ramos")
    public void parametrizacion_de_ramos() {

    }



    @And("Ingresamos  Linea {string} , Nombre{string}, Token{string}")
    public void ingresamosLineaNombreToken(String Linea, String branch, String arg2) {

        this.ramosModel.setBranch(branch);
        this.ramosModel.setLinea(Linea);
        this.ramosModel.setToken(LoginSaraStepDefinitions.Remplazardatos());
        actor.attemptsTo(RamosTask.EscribirDatos(ramosModel));
    }
}