package co.konecta.sura.api.Tareas.Parametrizaciones;

import co.konecta.sura.api.Modelos.ParametrizacionRamosModel;

import co.konecta.sura.api.interaccion.Post;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;


import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class RamosTask implements Task {
    private final ParametrizacionRamosModel Ramos;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Post.to("/branchs/save")
                .with(CreacionRamos -> CreacionRamos
                        .contentType(ContentType.JSON)
                        .body(Ramos))
        );


    }

    public static RamosTask EscribirDatos(ParametrizacionRamosModel datos) {
        return instrumented(RamosTask.class, datos);
    }

}

