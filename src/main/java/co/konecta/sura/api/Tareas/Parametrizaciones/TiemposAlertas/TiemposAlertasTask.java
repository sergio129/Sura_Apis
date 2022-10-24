package co.konecta.sura.api.Tareas.Parametrizaciones.TiemposAlertas;

import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class TiemposAlertasTask implements Task {
    private String lines, services, time, token;

    @Override
    public <T extends Actor> void performAs(T actor) {

        given()
                .body("{" +
                        "\"lines\": [\"" + lines + "\"],\n" +
                        "\"services\": [\"" + services + "\"],\n" +
                        "\"time\": \"" + time + "\",\n" +
                        "\"token\": \"" + LoginSaraStepDefinitions.Remplazardatos() + "\"}")
                .post("/alertParametrization/save")
                .then()
                .body("message", equalTo("Registro guardado correctamente"));
    }

    public static TiemposAlertasTask Datostiempos(String lines, String services, String time, String token) {
        return new TiemposAlertasTask(lines, services, time, token);
    }

}
