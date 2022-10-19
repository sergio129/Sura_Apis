package co.konecta.sura.api.stepdefinitions.proactive;

import co.konecta.sura.api.Modelos.Otros.LoginProactive;
import co.konecta.sura.api.Modelos.Otros.ProactiveModel;
import co.konecta.sura.api.Modelos.Tareas.Proactive.AutenticacionTask;
import co.konecta.sura.api.Modelos.Tareas.Proactive.CierreTareaProactiveTask;

import co.konecta.sura.api.questions.ResponseCode;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class AutenticacionProactiveStepDefinitions {
    public static final String restApiUrlProactive = "https://saralabs.grupokonecta.co:8591/api";
    Actor actor = new Actor("Usuario");
    private ProactiveModel datos = new ProactiveModel();
    private LoginProactive datoslogin = new LoginProactive();

    @Before
    public void setUp() {
        actor.whoCan(CallAnApi.at(restApiUrlProactive));
    }

    @Given("Cerrar tarea de monitoreo")
    public void cerrar_tarea_de_monitoreo() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("Autenticacion proactive")
    public void autenticacion_proactive(List<Map<String, String>> proactive) {
        //      actor.attemptsTo(AutenticacionTask.InfoProactive(proactive));

    }


//    @And("Ingresamos id del caso y id de la tarea")
//    public void ingresamos_id_del_caso_y_id_de_la_tarea(List<Map<String, String>> Cierre) {
//        String data = "";
//        actor.recall("data");
//        actor.attemptsTo(CierreTareaProactiveTask.Cierrtarea(Cierre));
//    }

//    @And("Ingresamos id del caso y id de la tarea (.*),(.*)")
//    public void ingresamosIdDelCasoYIdDeLaTareaIdCasoIdTarea(String IdCaso, String IdTarea) {
//
//        ProactiveModel datos = new ProactiveModel();
//        datos.setIdCase(IdCaso);
//        datos.setIdTask(IdTarea);
//        actor.attemptsTo(CierreTareaProactiveTask.Cierrtarea(datos));
//
//    }

    @And("Ingresamos token:{string}, idCaso:{string}, idTarea{string}")
    public void ingresamosIdCasoIdTarea( String token, String IdCaso, String IdTarea) {


        this.datos.setToken(SerenityRest.lastResponse().body().jsonPath().getString("data"));
        this.datos.setIdCase(IdCaso);
        this.datos.setIdTask(IdTarea);
        actor.attemptsTo(CierreTareaProactiveTask.Cierrtarea(datos));

    }

    @When("Autenticacion proactive Usuario:{string}Contrasena{string}")
    public void autenticacionProactiveUsuarioContrasena(String userName, String password) {
        this.datoslogin.setPassword(password);
        this.datoslogin.setUserName(userName);
        actor.attemptsTo(AutenticacionTask.InfoProactive(datoslogin));
    }

    @Then("Validamos respuesta del servicio {int}")
    public void validamosRespuestaDelServicio(int arg0) {
        actor.should(seeThat(new ResponseCode(), equalTo(arg0)));


    }
}
