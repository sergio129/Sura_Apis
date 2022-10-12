package co.konecta.sura.api.Tareas.Parametrizaciones.Ramos;

import co.konecta.sura.api.Modelos.Parametrizaciones.Ramos.ParametrizacionRamosModel;

import co.konecta.sura.api.interaccion.Post;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class RamosTask implements Task {
    private final ParametrizacionRamosModel ramosModel;

    @Override
    public <T extends Actor> void performAs(T sergio) {
        sergio.attemptsTo(Post.to("/branchs/save")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON).body(ramosModel)));


    }

    public static RamosTask EscribirDatos(ParametrizacionRamosModel ramosModel) {
        return new RamosTask(ramosModel);

    }

}

