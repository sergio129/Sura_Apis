package co.konecta.sura.api.Tareas.Parametrizaciones.MotivosLlamada;

import co.konecta.sura.api.Modelos.Parametrizaciones.MotivosLlamadas.MotivosLllamadaModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

@AllArgsConstructor
public class MotivosLlamadaTask implements Task {
    private final MotivosLllamadaModel motivos;
    private final TokenModel token;

    @Override
    public <T extends Actor> void performAs(T konecta) {
        konecta.attemptsTo(Post.to("/callReason/save")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON).body("{\n" +
                                "    \"name\": \"" + motivos.getName() + "\",\n" +
                                "    \"type\": " + motivos.getType() + ",\n" +
                                "    \"options\": [\"" + motivos.getOptions() + "\"],\n" +
                                "    \"state\": " + motivos.getState() + ",\n" +
                                "    \"catastrophicEvent\": " + motivos.getCatastrophicEvent() + ",\n" +
                                "    \"lines\": [ " + motivos.getLines() + " ],\n" +
                                "    \"token\": \"" + token.getToken() + "\"\n" +
                                "}")));
    }

    public static MotivosLlamadaTask DatosMotivos(MotivosLllamadaModel motivos, TokenModel token) {
        return new MotivosLlamadaTask(motivos, token);
    }
}
