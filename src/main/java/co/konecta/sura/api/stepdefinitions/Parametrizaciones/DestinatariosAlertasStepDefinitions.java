package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Modelos.Parametrizaciones.DestinatariosAlertas.DestinatariosAlertasModel;
import co.konecta.sura.api.Tareas.Parametrizaciones.DestinatiosAlertas.DestinatariosAlertasTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class DestinatariosAlertasStepDefinitions {
    Actor konecta = Actor.named("Konecta");
    DestinatariosAlertasModel AlertasModel = new DestinatariosAlertasModel();

    @Before
    public void setUp() {
        // conf.Configuracion();
        konecta.whoCan(CallAnApi.at(restApiUrlSara));
    }

    @Given("Creacion de parametrizacion destinatios de alertas")
    public void creacion_de_parametrizacion_destinatios_de_alertas() {

    }

    @And("Parametrizacion destinario de alertas, Departamentos:{string},Email:{string},Lineas:{string},Municipios:{string},NombreParametrizacion:{string},Servicios:{string},token:{string}")
    public void parametrizacionDestinarioDeAlertasDepartamentosEmailLineasMunicipiosNombreParametrizacionServiciosToken(String departments, String emails, String lines, String municipalies, String par_name, String services, String token) {
        this.AlertasModel.setDepartments(departments);
        this.AlertasModel.setEmails(emails);
        this.AlertasModel.setLines(lines);
        this.AlertasModel.setMunicipalies(municipalies);
        this.AlertasModel.setPar_name(par_name);
        this.AlertasModel.setServices(services);
        konecta.attemptsTo(DestinatariosAlertasTask.datos(AlertasModel));

    }
}
