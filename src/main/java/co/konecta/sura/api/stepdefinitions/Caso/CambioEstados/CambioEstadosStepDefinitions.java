package co.konecta.sura.api.stepdefinitions.Caso.CambioEstados;

import co.konecta.sura.api.Modelos.Casos.CambioDeEstados.CambioEstadosModel;
import co.konecta.sura.api.Tareas.Casos.CambioEstados.CambioEstadosTask;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import co.konecta.sura.api.stepdefinitions.Caso.Creacion.CasoStepsDefinition;
import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;



public class CambioEstadosStepDefinitions {
    Actor actor = new Actor("Sergio");
    public static final String restApiUrlSara = "https://saralabs.grupokonecta.co:8591/api";
    CambioEstadosModel estados = new CambioEstadosModel();

    @Before
    public void setUp() {
        actor.whoCan(CallAnApi.at(restApiUrlSara));
    }



    @And("^Ingresamos los datos para el cambio de estado IdCaso(.*), Estado(.*), (.*)$")
    public void ingresamos_los_datos_para_el_cambio_de_estado(String IdCaso, String estado, String token) {
        this.estados.setId_case(IdCaso);
        this.estados.setId_state(estado);
        this.estados.setToken(LoginSaraTask.tokenLogin());
        actor.attemptsTo(CambioEstadosTask.CambiarEstado(estados));
    }


    @And("Datos para el cambio de estado id_Caso: {string}, Estado: {string}, Token: {string}")
    public void datosParaElCambioDeEstadoId_CasoEstadoToken(String arg0, String arg1, String arg2) {

        this.estados.setId_case(CasoStepsDefinition.CapturaDatosCasos());
        this.estados.setId_state(arg1);
        this.estados.setToken(LoginSaraTask.tokenLogin());
        actor.attemptsTo(CambioEstadosTask.CambiarEstado(estados));

    }

}
