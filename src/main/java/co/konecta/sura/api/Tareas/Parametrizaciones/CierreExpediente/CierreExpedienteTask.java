package co.konecta.sura.api.Tareas.Parametrizaciones.CierreExpediente;

import co.konecta.sura.api.Modelos.Parametrizaciones.CierreExpediente.CierreExpedienteModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

@AllArgsConstructor
public class CierreExpedienteTask implements Task {
    private final CierreExpedienteModel cierre;
    private final TokenModel tokenModel;


    @Override
    public <T extends Actor> void performAs(T konecta) {
        konecta.attemptsTo(Post.to("/paramClosingCases/save")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON)
                        .body("{\n" +
                                "    \"line\": [" + cierre.getLine() + "],\n" +
                                "    \"service\": [" + cierre.getService() + "],\n" +
                                "    \"field\": \"" + cierre.getField() + "\",\n" +
                                "    \"token\": \"" + tokenModel.getToken() + "\"\n" +
                                "}"))
        );
    }

    public static CierreExpedienteTask datos(CierreExpedienteModel cierre, TokenModel tokenModel) {
        return new CierreExpedienteTask(cierre, tokenModel);
    }
}
