package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Modelos.Parametrizaciones.BotOfertamiento.BotOfertamientoHabilitarModel;
import co.konecta.sura.api.Modelos.Parametrizaciones.BotOfertamiento.BotOfertamientoModel;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import co.konecta.sura.api.Tareas.Parametrizaciones.BotOfertamiento.BotOfertamientoHabilitarTask;
import co.konecta.sura.api.Tareas.Parametrizaciones.BotOfertamiento.BotOfertamientoTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.conf.ConfiguracionGeneral.restApiUrlSara;

public class BotOfertamientoStepDefinitions {

    Actor konecta = new Actor("Konecta");
    BotOfertamientoModel ofertamientoModel = new BotOfertamientoModel();
    BotOfertamientoHabilitarModel ofertHabilitar = new BotOfertamientoHabilitarModel();

    @Before
    public void setUp() {
        // conf.Configuracion();
        konecta.whoCan(CallAnApi.at(restApiUrlSara));
    }

    @Given("Creacion cambio de estados de parametrizaciones bot de ofertamiento")
    public void creacion_cambio_de_estados_de_parametrizaciones_bot_de_ofertamiento() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("Creacion parametrizacion bot de ofertamien, GestionCoordinacion:{string},Departamentos:{string},Lineas:{string}Municipios:{string}Nombre:{string}TipoOfertamiento:{string}TipoServicio:{string}Tiempo:{string}Token:{string}")
    public void creacionParametrizacionBotDeOfertamienGestionCoordinacionDepartamentosLineasMunicipiosNombreTipoOfertamientoTipoServicioTiempoToken(String coordination_manager, String departments, String lines, String municipalities, String name, String offert_type, String service_type, String time, String token) {
        this.ofertamientoModel.setCoordination_manager(coordination_manager);
        this.ofertamientoModel.setDepartments(departments);
        this.ofertamientoModel.setLines(lines);
        this.ofertamientoModel.setMunicipalities(municipalities);
        this.ofertamientoModel.setName(name);
        this.ofertamientoModel.setOffert_type(offert_type);
        this.ofertamientoModel.setService_type(service_type);
        this.ofertamientoModel.setTime(time);
        this.ofertamientoModel.setToken(LoginSaraTask.Capturartoken());
        konecta.attemptsTo(BotOfertamientoTask.DatosOfertamiento(ofertamientoModel));
    }

    @And("Cambio de estado parametrizacion bot de ofertamiento IdRegistro:{string}, Estado:{string}, Token:{string}")
    public void cambioDeEstadoParametrizacionBotDeOfertamientoIdRegistroEstadoToken(String arg0, String arg1, String arg2) {
        this.ofertHabilitar.setOp_id(arg0);
        this.ofertHabilitar.setStatus(arg1);
        this.ofertHabilitar.setToken(LoginSaraTask.Capturartoken());
        konecta.attemptsTo(BotOfertamientoHabilitarTask.EscribirDatos(ofertHabilitar));
    }
}
