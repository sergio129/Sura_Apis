package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Modelos.Parametrizaciones.BotMonitoreo.BotmonitoreoModel;
import co.konecta.sura.api.Tareas.Parametrizaciones.BotMonitoreo.BotmonitoreoTask;
import co.konecta.sura.api.conf.ConfiguracionGeneral;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class BotMonitoreoStepDefinitions {
    Actor actor = Actor.named("Sergio");
    BotmonitoreoModel botModel = new BotmonitoreoModel();

    @Before
    public void setUp() {
       // conf.Configuracion();
        actor.whoCan(CallAnApi.at(restApiUrlSara));
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
        actor.attemptsTo(BotmonitoreoTask.DatosBotMonitoreo(botModel));
    }
}
