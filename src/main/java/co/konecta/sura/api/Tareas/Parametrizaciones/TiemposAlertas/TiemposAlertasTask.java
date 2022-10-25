package co.konecta.sura.api.Tareas.Parametrizaciones.TiemposAlertas;

import co.konecta.sura.api.Modelos.Parametrizaciones.TiemposAlertas.TiemposAlertasModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class TiemposAlertasTask implements Task {
    private final TiemposAlertasModel alertasModel;

    @Override
    public <T extends Actor> void performAs(T actor) {


        SerenityRest.given()

                .body("{\"lines\": ["+alertasModel.getLines()+"],\n" +
                        "\"services\": [\""+alertasModel.getServices()+"\"],\n" +
                        "\"time\": \""+alertasModel.getTime()+"\",\n" +
                        "\"token\": \""+alertasModel.getToken()+"\"}")
                .post("/alertParametrization/save")
                .then()
                .body("message", equalTo("Registro guardado correctamente"));
    }

    public static TiemposAlertasTask Datostiempos(TiemposAlertasModel alertasModel) {
        return new TiemposAlertasTask(alertasModel);
    }

}
