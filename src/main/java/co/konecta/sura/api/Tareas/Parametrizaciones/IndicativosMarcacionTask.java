package co.konecta.sura.api.Tareas.Parametrizaciones;

import co.konecta.sura.api.interaccion.Post;
import co.konecta.sura.api.stepdefinitions.Modelos.Parametrizaciones.IndicativosMarcacionModel;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class IndicativosMarcacionTask implements Task {
    private final IndicativosMarcacionModel indicativos;

    public IndicativosMarcacionTask(IndicativosMarcacionModel indicativos) {
        this.indicativos = indicativos;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Post.to("/paramIndicative/save")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON).body(indicativos)));
    }
    public static IndicativosMarcacionTask EscribirDatos(IndicativosMarcacionModel indicativos){
        return new IndicativosMarcacionTask(indicativos);
    }
}
