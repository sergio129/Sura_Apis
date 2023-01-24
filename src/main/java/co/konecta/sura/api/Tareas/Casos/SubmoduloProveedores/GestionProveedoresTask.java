package co.konecta.sura.api.Tareas.Casos.SubmoduloProveedores;

import co.konecta.sura.api.Modelos.Casos.Casos.CreacionCasosModel;
import co.konecta.sura.api.Modelos.Casos.SubmoduloGestionProveedores.GestionProveedoresModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class GestionProveedoresTask implements Task {



private final GestionProveedoresModel proveedor;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to("/providersManagement/save")
                        .with(requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(proveedor)));
    }

    public static GestionProveedoresTask InfoProveedor(GestionProveedoresModel proveedor) {
        return new GestionProveedoresTask(proveedor);
    }
}
