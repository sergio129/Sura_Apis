package co.konecta.sura.api.Tareas.Proactive;

import co.konecta.sura.api.Modelos.Otros.ProactiveModel;
import co.konecta.sura.api.interaccion.Post;

import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class CierreTareaProactiveTask implements Task {


    private final ProactiveModel datos;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Post.to("/monitoringTasks/closeTask")
                .with(requestCierre -> requestCierre
                        .contentType(ContentType.JSON)
                        .body(datos))
                );



    }


    public static Performable Cierrtarea(ProactiveModel datos) {

        return instrumented(CierreTareaProactiveTask.class, datos);
    }



}
