package co.konecta.sura.api.Tareas.Casos.Casos;

import co.konecta.sura.api.Modelos.Token.TokenModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class BuscarCasoTask implements Task {
    private final TokenModel token;
    private String caseNumber;

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.given()
                .body("{\n" +
                        "    \"caseNumber\": \""+caseNumber+"\",\n" +
                        "    \"page\": 1,\n" +
                        "    \"token\": \""+token.getToken()+"\"\n" +
                        "}")
                .post("cases/list")
                .then()
                .body("message", equalTo("Registros listados correctamente"));

    }
    public static BuscarCasoTask NumeroExpediente(TokenModel token,String caseNumber){
        return new BuscarCasoTask(token,caseNumber);
    }
}

