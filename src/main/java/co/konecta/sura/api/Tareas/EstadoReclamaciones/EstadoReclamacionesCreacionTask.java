package co.konecta.sura.api.Tareas.EstadoReclamaciones;

import co.konecta.sura.api.Modelos.EstadoReclamaciones.EstadoReclamacionCreacionModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class EstadoReclamacionesCreacionTask implements Task {
    private final TokenModel tokenModel;
    private final EstadoReclamacionCreacionModel model;

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.given()

                .body("{   \"name\" : \"" + model.getName() + "\",\n" +
                        "    \"cedula\" : \"" + model.getCedula() + "\",\n" +
                        "    \"plate\" : \"" + model.getPlate() + "\",\n" +
                        "    \"phone\": \"" + model.getPhone() + "\",\n" +
                        "    \"medium_contact\": \"" + model.getMedium_contact() + "\",\n" +
                        "    \"request_context\": \"" + model.getRequest_context() + "\",\n" +
                        "    \"reiterativity_number\": " + model.getReiterativity_number() + ",\n" +
                        "    \"claim_date_hour\": \"" + model.getClaim_date_hour() + "\",\n" +
                        "    \"token\": \"" + tokenModel.getToken() + "\"}")
                .post("/casesClaimRequest/save")
                .then()
                .body("message", equalTo("Registro guardado correctamente"));
    }

    public static EstadoReclamacionesCreacionTask EscribirDatos(EstadoReclamacionCreacionModel model, TokenModel tokenModel) {
        return new EstadoReclamacionesCreacionTask(tokenModel, model);
    }

}
