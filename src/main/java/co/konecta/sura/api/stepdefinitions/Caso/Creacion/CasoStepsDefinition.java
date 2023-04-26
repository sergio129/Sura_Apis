package co.konecta.sura.api.stepdefinitions.Caso.Creacion;

import co.konecta.sura.api.Modelos.Casos.Casos.CreacionCasosModel;
import co.konecta.sura.api.Modelos.Casos.DocumentacionCNM.DocumentacionCNMModel;
import co.konecta.sura.api.Modelos.Casos.EscalamientoSura.EscalamientoSuraModel;
import co.konecta.sura.api.Modelos.Casos.Novedades.NovedadesModel;
import co.konecta.sura.api.Modelos.Casos.SubmoduloGestionProveedores.GestionProveedoresModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import co.konecta.sura.api.Tareas.Casos.CambioEstados.CambioEstadosTask;
import co.konecta.sura.api.Tareas.Casos.Casos.BuscarCasoTask;
import co.konecta.sura.api.Tareas.Casos.Casos.CreacionCasoTask;
import co.konecta.sura.api.Tareas.Casos.DocumentacionCNM.DocumentacionCNMTask;
import co.konecta.sura.api.Tareas.Casos.EscalamientoSura.EscalamientoSuraTask;
import co.konecta.sura.api.Tareas.Casos.Finalizacion.FinalizacionTask;
import co.konecta.sura.api.Tareas.Casos.Novedades.NovedadesTask;
import co.konecta.sura.api.Tareas.Casos.SubmoduloProveedores.GestionProveedoresTask;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import co.konecta.sura.api.Utilidades.Datos_Crear_Caso;
import co.konecta.sura.api.Utilidades.Datos_Gestion_Proveedores;
import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class CasoStepsDefinition {

    Actor actor = Actor.named("Sergio");
    NovedadesModel model = new NovedadesModel();
    DocumentacionCNMModel cnmModel = new DocumentacionCNMModel();
    EscalamientoSuraModel suraModel = new EscalamientoSuraModel();
    TokenModel token = new TokenModel();

    @Before
    public void setUp() {

        actor.whoCan(CallAnApi.at(restApiUrlSara));
    }

    @Given("Creacion de Casos")
    public void creacion_de_casos() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("Llenamos los datos en el archivo CreacionCaso.Properties")
    public void llenamosLosDatosEnElArchivoCreacionCasoProperties() throws InterruptedException {
        CreacionCasosModel model = Datos_Crear_Caso.casosModel();
        this.token.setToken(LoginSaraTask.tokenLogin());
        for (int i = 0; i <= 1000;
             i++) {
            actor.attemptsTo(CreacionCasoTask.Escribir(model, token));
        }
    }

    @And("Datos Novedades Reporta novedad:{string}, Cauda novedad:{string},Genera Radicado:{string}, NRadicado:{string}, Observaciones:{string}")
    public void datosNovedadesReportaNovedadCaudaNovedadGeneraRadicadoNRadicadoObservaciones(String whoReports, String causeNovelty, String generateComplaint, String filedComplaint, String observation) {
        this.model.setWhoReports(whoReports);
        this.model.setCauseNovelty(causeNovelty);
        this.model.setGenerateComplaint(generateComplaint);
        this.model.setFiledComplaint(filedComplaint);
        this.model.setObservation(observation);
        this.model.setCase_id(CreacionCasoTask.CaseID());
        this.token.setToken(LoginSaraTask.tokenLogin());
        actor.attemptsTo(NovedadesTask.EscribirDatosNovedades(token, model));
    }

    @And("Datos Documentacion CNM Persona gestion:{string}, Genera queja:{string}, Radicado:{string}, Observaciones:{string}")
    public void datosDocumentacionCNMPersonaGestionGeneraQuejaRadicadoObservaciones(String personManagement, String generateComplaint, String filedComplaint, String description) {
        cnmModel.setPersonManagement(personManagement);
        cnmModel.setGenerateComplaint(generateComplaint);
        cnmModel.setFiledComplaint(filedComplaint);
        cnmModel.setDescription(description);
        actor.attemptsTo(DocumentacionCNMTask.EscribirDatosDocumentacionCNM(cnmModel));
    }

    @And("Numero de Expediente a Buscar:{string}")
    public void numeroDeExpedienteABuscar(String arg0) {
        token.setToken(LoginSaraTask.tokenLogin());
        for (int i = 0; i <= 1000;
             i++) {
            actor.attemptsTo(BuscarCasoTask.NumeroExpediente(token, arg0));
        }
    }

    @And("Datos Modulo Finalizacion, Finalizar con:{string}, Tipo respuesta:{string}, Observaciones: {string}")
    public void datosModuloFinalizacionFinalizarConTipoRespuestaObservaciones(String endingWith, String typeResponse, String description) {
        actor.attemptsTo(FinalizacionTask.EscribirDatosFinzalizacion(endingWith, typeResponse, description));
    }


    @And("Datos Escalamiento Sura, Tipo Gestion:{string}, Persona Gestion:{string}, Tipo Respuesta:{string}, Genera Queja:{string},Radicado de la Queja:{string} Observaciones:{string}")
    public void datosEscalamientoSuraTipoGestionPersonaGestionTipoRespuestaGeneraQuejaRadicadoDeLaQuejaObservaciones(String typeManagement, String personManagement, String typeReply, String generateComplaint, String filedComplaint, String observation) {
        suraModel.setTypeManagement(typeManagement);
        suraModel.setPersonManagement(personManagement);
        suraModel.setTypeReply(typeReply);
        suraModel.setGenerateComplaint(generateComplaint);
        suraModel.setFiledComplaint(filedComplaint);
        suraModel.setObservation(observation);
        actor.attemptsTo(EscalamientoSuraTask.EscribirDatos(suraModel));
    }

    @And("Uso de ciclo")
    public void usoDeCiclo() {
        CreacionCasosModel model = Datos_Crear_Caso.casosModel();
        GestionProveedoresModel proveedoresModel = Datos_Gestion_Proveedores.proveedoresModel();
        proveedoresModel.setCase_id(CreacionCasoTask.CaseID());
        proveedoresModel.setToken(LoginSaraTask.tokenLogin());
        this.token.setToken(LoginSaraTask.tokenLogin());
        for (int i = 0; i <= 5;
             i++) {
            actor.attemptsTo(CreacionCasoTask.Escribir(model, token));
            actor.attemptsTo(GestionProveedoresTask.InfoProveedor(proveedoresModel));
        }
    }
}
