package co.konecta.sura.api.Modelos.Tareas.Parametrizaciones.IndicativosMarcacion;

import co.konecta.sura.api.Modelos.Parametrizaciones.IndicativosMarcacion.IndicativosMarcacionDeleteModel;
import co.konecta.sura.api.interaccion.Post;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class IndicativoMarcacionDeleteTask implements Task {
    private final IndicativosMarcacionDeleteModel delete;

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Post.to("/paramIndicative/delete")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON).body(delete)));
    }
    public static IndicativoMarcacionDeleteTask inf(IndicativosMarcacionDeleteModel delete){
        return new IndicativoMarcacionDeleteTask(delete);
    }
}


