package co.konecta.sura.api.interaccion;

import co.konecta.sura.api.Modelos.Token.TokenModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static org.hamcrest.Matchers.equalTo;
@AllArgsConstructor
public class BusquedaCasoAvanzadoInteraction implements Interaction {
    private final TokenModel token;
    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.given()
                .body("{\"department\":[\"448\",\"545\"],\"municipality\":[\"725\",\"576\"],\"caseLine\":[\"1578\",\"1575\"],\"caseStatus\":[\"534\",\"533\",\"535\",\"536\"],\"serviceStatus\":[\"526\",\"525\",\"522\"],\"page\":1,\"token\":\""+token.getToken()+"\"}")
                .post("cases/list")
                .then()
                .body("message", equalTo("Registros listados correctamente"));

    }
    public static BusquedaCasoAvanzadoInteraction datos(TokenModel token){
        return new BusquedaCasoAvanzadoInteraction(token);
    }

}
