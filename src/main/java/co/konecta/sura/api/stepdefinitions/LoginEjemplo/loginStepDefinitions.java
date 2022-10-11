package co.konecta.sura.api.stepdefinitions.LoginEjemplo;

import co.konecta.sura.api.Tareas.EjemploTarea;
import co.konecta.sura.api.questions.ResponseCode;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class loginStepDefinitions {
    private static final String restApiUrl = "https://saralabs.grupokonecta.co:8591/api";
    Actor actor = Actor.named("Sergio");
    @Before
    public void setUp(){

              actor.whoCan(CallAnApi.at(restApiUrl));
    }
    @Given("Sergio es usuario de Sara")
    public void sergioEsUsuarioDeSara() {

        // Write code here that turns the phrase above into concrete actions
    }

    @Then("debe ser un usuario valido")
    public void debeSerUnUsuarioValido() {
        actor.should(seeThat("el codigo de respuesta", new ResponseCode(), equalTo(200)));
        // Write code here that turns the phrase above into concrete actions

    }
    @When("^Envia la informacion inicio de sesion$")
    public void enviaLaInformacionInicioDeSesion() {
        String info="{\n" +
                "    \"userName\": \"bot.konecta.sura\",\n" +
                "    \"password\": \"b0tK0n3ct4*\"\n" +
                "}";
        actor.attemptsTo(EjemploTarea.Info(info));
    }


}
