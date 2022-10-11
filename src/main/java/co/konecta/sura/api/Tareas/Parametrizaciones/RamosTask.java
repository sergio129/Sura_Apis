package co.konecta.sura.api.Tareas.Parametrizaciones;

import co.konecta.sura.api.Modelos.ParametrizacionRamosModel;

import co.konecta.sura.api.interaccion.Post;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;



import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class RamosTask implements Task {
    private final ParametrizacionRamosModel Ramos;

    @Override
    public <T extends Actor> void performAs(T sergio) {
        sergio.attemptsTo(Post.to("/branchs/save")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON).body(Ramos)));


    }

    public static RamosTask EscribirDatos(ParametrizacionRamosModel Ramos) {
        return instrumented(RamosTask.class, Ramos);
    }

}

