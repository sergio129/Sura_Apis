package co.konecta.sura.api.Tareas.Casos.Casos;

import co.konecta.sura.api.Modelos.Casos.Casos.CreacionCasosModel;
import co.konecta.sura.api.interaccion.Post;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
@AllArgsConstructor
public class CreacionCasoTask implements Task {
    private final CreacionCasosModel Caso;
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Post.to("/case/saveCases")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON)
                        .body(Caso))
        );

    }
    public static CreacionCasoTask Escribir(CreacionCasosModel Caso){
        return new CreacionCasoTask(Caso);
    }
}
