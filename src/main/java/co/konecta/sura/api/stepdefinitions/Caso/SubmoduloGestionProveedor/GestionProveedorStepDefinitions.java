package co.konecta.sura.api.stepdefinitions.Caso.SubmoduloGestionProveedor;

import co.konecta.sura.api.Modelos.Casos.Casos.CreacionCasosModel;
import co.konecta.sura.api.Modelos.Casos.SubmoduloGestionProveedores.GestionProveedoresModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import co.konecta.sura.api.Tareas.Casos.SubmoduloProveedores.GestionProveedoresTask;
import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class GestionProveedorStepDefinitions {
    Actor actor = Actor.named("Sergio");

    TokenModel token = new TokenModel();
    GestionProveedoresModel proveedor = new GestionProveedoresModel();

    @Before
    public void setUp() {

        actor.whoCan(CallAnApi.at(restApiUrlSara));
    }


    @Given("Gestion de proveedores")
    public void gestion_de_proveedores() {
        // Write code here that turns the phrase above into concrete actions

    }
//    @And("Hacemos la gestion del proveedor")
//    public void hacemos_la_gestion_del_proveedor(List<Map<String, String>> proveedor, CreacionCasosModel Caso) {
//        this.casos.setToken(LoginSaraStepDefinitions.Remplazardatos());
//        actor.attemptsTo(GestionProveedoresTask.InfoProveedor(proveedor, Caso));
//    }

    @And("Hacemos la gestion del proveedor")
    public void hacemosLaGestionDelProveedor(GestionProveedoresModel proveedor) {
        this.proveedor.setToken(LoginSaraStepDefinitions.Remplazardatos());
        actor.attemptsTo(GestionProveedoresTask.InfoProveedor(proveedor));

    }

    @And("Hacemos la gestion del proveedor Parte uno, Accion:{string},IdCaso:{string},TelefonoCentralUno:{string}, TelefonoCentralDos:{string},countCharacter:{string},FechaMoniDestino:{string}")
    public void hacemosLaGestionDelProveedorParteUnoAccionIdCasoTelefonoCentralUnoTelefonoCentralDosCountCharacterFechaMoniDestino(String action, String case_id, String central_phone_1, String central_phone_2, String countCharacter, String date_monitoring_destination) {
        this.proveedor.setAction(action);
        this.proveedor.setCase_id(case_id);
        this.proveedor.setCentral_phone_1(central_phone_1);
        this.proveedor.setCentral_phone_2(central_phone_2);
        this.proveedor.setCountCharacter(countCharacter);
        this.proveedor.setDate_monitoring_destination(date_monitoring_destination);

    }

    @And("Hacemos La gestion del proveedor Parte Dos, FechaMoniSitio:{string},HoraMoniDestino:{string},HoraMonitSitio:{string},IdProveedor:{string},Moduloid:{string} NombreProveedor:{string},RespuestaProveedor:{string}")
    public void hacemosLaGestionDelProveedorParteDosFechaMoniSitioHoraMoniDestinoHoraMonitSitioIdProveedorNombreProveedorRespuestaProveedor(String date_monitoring_site, String hour_monitoring_destination, String hour_monitoring_site, String id_provider, String moduleId, String name_provider, String provider_response) {
        this.proveedor.setDate_monitoring_site(date_monitoring_site);
        this.proveedor.setHour_monitoring_destination(hour_monitoring_destination);
        this.proveedor.setHour_monitoring_site(hour_monitoring_site);
        this.proveedor.setId_provider(id_provider);
        this.proveedor.setModuleId(moduleId);
        this.proveedor.setName_provider(name_provider);
        this.proveedor.setProvider_response(provider_response);
    }

    @And("Hacemos la gestion del proveedor parte tres, Observaciones:{string},recordingTime:{string}, TelTecnico:{string}, TMonitDestino: {string} TMonitSitio: {string}, token:{string}")
    public void hacemosLaGestionDelProveedorParteTresObservacionesRecordingTimeTelTecnicoTMonitDestinoTMonitSitioToken(String observation, String recordingTime, String technician_phone_number, String time_monitoring_destination, String time_monitoring_site, String arg5) {
        this.proveedor.setObservation(observation);
        this.proveedor.setRecordingTime(recordingTime);
        this.proveedor.setTechnician_phone_number(technician_phone_number);
        this.proveedor.setTime_monitoring_destination(time_monitoring_destination);
        this.proveedor.setTime_monitoring_site(time_monitoring_site);
        this.proveedor.setToken(LoginSaraStepDefinitions.Remplazardatos());
        actor.attemptsTo(GestionProveedoresTask.InfoProveedor(proveedor));
    }
}
