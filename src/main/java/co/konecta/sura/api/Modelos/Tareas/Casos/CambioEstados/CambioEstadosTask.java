package co.konecta.sura.api.Modelos.Tareas.Casos.CambioEstados;

import co.konecta.sura.api.Modelos.Casos.CambioDeEstados.CambioEstadosModel;
import co.konecta.sura.api.interaccion.Post;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class CambioEstadosTask implements Task {
    private final CambioEstadosModel estados;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to("/stateManagement/save")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON)
                        .body(estados))
        );

    }
    public static CambioEstadosTask CambiarEstado(CambioEstadosModel estados){
        return new CambioEstadosTask(estados);
    }
}
