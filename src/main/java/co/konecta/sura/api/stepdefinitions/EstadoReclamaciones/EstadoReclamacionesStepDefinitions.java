package co.konecta.sura.api.stepdefinitions.EstadoReclamaciones;

import co.konecta.sura.api.Modelos.EstadoReclamaciones.EstadoReclamacionCreacionModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import co.konecta.sura.api.Tareas.EstadoReclamaciones.EstadoReclamacionesCreacionTask;
import co.konecta.sura.api.Tareas.EstadoReclamaciones.EstadoReclamacionesLoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class EstadoReclamacionesStepDefinitions {
    Actor konecta = Actor.named("Sergio");
    EstadoReclamacionCreacionModel model=new EstadoReclamacionCreacionModel();
    TokenModel token=new TokenModel();

    @Before
    public void setUp() {
        konecta.whoCan(CallAnApi.at(restApiUrlSara));

    }
    @Given("logueamos en api de modulo estado de reclamaciones")
    public void logueamos_en_api_de_modulo_estado_de_reclamaciones() {
       konecta.attemptsTo(EstadoReclamacionesLoginTask.EscribirDatos());
    }

    @And("Datos Creacion de Caso estado Reclamaciones Nombre:{string},Cedula{string},Placa:{string},Telefono:{string},Medio de Contacto:{string},Contexto Solicitud:{string}, Reiteratividad:{string}, Hora:{string}")
    public void datosCreacionDeCasoEstadoReclamacionesNombreCedulaPlacaTelefonoMedioDeContactoContextoSolicitudReiteratividadHora(String name, String cedula, String plate, String phone, String medium_contact, String request_context, String reiterativity_number, String claim_date_hour) {
        this.model.setName(name);
        this.model.setCedula(cedula);
        this.model.setPlate(plate);
        this.model.setPhone(phone);
        this.model.setMedium_contact(medium_contact);
        this.model.setRequest_context(request_context);
        this.model.setReiterativity_number(reiterativity_number);
        this.model.setClaim_date_hour(claim_date_hour);
        this.token.setToken(EstadoReclamacionesLoginTask.tokenLoginEstadoReclamaciones());
        konecta.attemptsTo(EstadoReclamacionesCreacionTask.EscribirDatos(model,token));

    }
}
