package co.konecta.sura.api.Tareas.Parametrizaciones.CalculoTiempoMonitoreoSitio;

import co.konecta.sura.api.Modelos.Parametrizaciones.CalculoTiempoMonitoreoSitio.CalculoTiempoMonitoreoSitioModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import io.restassured.RestAssured;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class CalculoTiempoMonitoreoSitioCreacionTask implements Task {
    private final CalculoTiempoMonitoreoSitioModel model;
    private final TokenModel token;

    @Override
    public <T extends Actor> void performAs(T actor) {

        SerenityRest.given()
                .body("{ \"name\": \"" + model.getName() + "\",\n" +
                        "    \"service_time\": " + model.getService_time() + ",\n" +
                        "    \"lines\": [" + model.getLines() + "],\n" +
                        "    \"service_type\": [" + model.getService_type() + "],\n" +
                        "    \"departments\": [" + model.getDepartments() + "],\n" +
                        "    \"municipalities\": [" + model.getMunicipalities() + "],\n" +
                        "    \"delta\": 999,\n" +
                        "    \"token\": \"" + token.getToken() + "\"}")
                .post("/monitorTimesDestinyParametrization/saveParametrization")
                .then()
                .statusCode(200).body("message", equalTo("Registro guardado correctamente"));

    }

    public static CalculoTiempoMonitoreoSitioCreacionTask EscribirDatos(CalculoTiempoMonitoreoSitioModel model, TokenModel token) {
        return new CalculoTiempoMonitoreoSitioCreacionTask(model, token);
    }
}
