package co.konecta.sura.api.Tareas.Parametrizaciones.IndicativosMarcacion;

import co.konecta.sura.api.interaccion.Post;
import co.konecta.sura.api.stepdefinitions.Modelos.Parametrizaciones.IndicativosMarcacionModel;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class IndicativosMarcacionCrearTask implements Task {
    private final IndicativosMarcacionModel indicativos;

    public IndicativosMarcacionCrearTask(IndicativosMarcacionModel indicativos) {
        this.indicativos = indicativos;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Post.to("/paramIndicative/save")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON).body(indicativos)));
    }
    public static IndicativosMarcacionCrearTask EscribirDatos(IndicativosMarcacionModel indicativos){
        return new IndicativosMarcacionCrearTask(indicativos);
    }
}
