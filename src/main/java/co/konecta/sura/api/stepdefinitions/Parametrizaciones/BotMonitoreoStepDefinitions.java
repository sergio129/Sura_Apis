package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Modelos.Parametrizaciones.BotMonitoreo.BotMonitoreoHabilitarModel;
import co.konecta.sura.api.Modelos.Parametrizaciones.BotMonitoreo.BotmonitoreoModel;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import co.konecta.sura.api.Tareas.Parametrizaciones.BotMonitoreo.BotMonitoreoHabilitarTask;
import co.konecta.sura.api.Tareas.Parametrizaciones.BotMonitoreo.BotmonitoreoTask;
import co.konecta.sura.api.conf.ConfiguracionGeneral;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class BotMonitoreoStepDefinitions {
    Actor konecta = Actor.named("Sergio");
    BotmonitoreoModel botModel = new BotmonitoreoModel();
    BotMonitoreoHabilitarModel habilitar = new BotMonitoreoHabilitarModel();

    @Before
    public void setUp() {
        // conf.Configuracion();
        konecta.whoCan(CallAnApi.at(restApiUrlSara));
    }

    @Given("Crear, Editar, inabilitar parametrizacion bot de monitoreo")
    public void crear_editar_inabilitar_parametrizacion_bot_de_monitoreo() {

    }


    @And("Bot monitoreo Gestion Coordinacion:{string},Departamentos:{string},Lineas:{string}, Municipios:{string},Nombre Parametrizacion:{string}, Tipo Servicio:{string},Servicios Especiales:{string}, Tareas Monitoreo:{string}, Token:{string}")
    public void botMonitoreoGestionCoordinacionDepartamentosLineasMunicipiosNombreParametrizacionTipoServicioServiciosEspecialesTareasMonitoreoToken(String coordination_manager, String departments, String lines, String municipalities, String name, String service_type, String special_services, String task_type, String token) {
        botModel.setCoordination_manager(coordination_manager);
        botModel.setDepartments(departments);
        botModel.setLines(lines);
        botModel.setMunicipalities(municipalities);
        botModel.setName(name);
        botModel.setService_type(service_type);
        botModel.setSpecial_services(special_services);
        botModel.setTask_type(task_type);
        botModel.setToken(LoginSaraTask.Capturartoken());
        konecta.attemptsTo(BotmonitoreoTask.DatosBotMonitoreo(botModel));
    }

    @And("Bot monitoreo eliminar Registros, Id Registro: {string}, Estado: {string}, Token: {string}")
    public void botMonitoreoEliminarRegistrosIdRegistroEstadoToken(String arg0, String arg1, String arg2) {
        habilitar.setPm_id(arg0);
        habilitar.setStatus(arg1);
        konecta.attemptsTo(BotMonitoreoHabilitarTask.Datos(habilitar));


    }
}
