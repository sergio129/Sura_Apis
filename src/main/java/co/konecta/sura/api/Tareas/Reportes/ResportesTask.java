package co.konecta.sura.api.Tareas.Reportes;

import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class ResportesTask implements Task {
    private String endDate;
    private String startDate;

    private String token;
    private String type_report;

    @Override
    public <T extends Actor> void performAs(T actor) {
        RestAssured.given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\"endDate\": \"" + endDate + "\",\n" +
                        "\"startDate\": \"" + startDate + "\",\n" +
                        "\"token\": \"" + LoginSaraStepDefinitions.Remplazardatos() + "\",\n" +
                        "\"type_report\": \"" + type_report + "\"}")
                .post("/reports/export")
                .then()
                .log().all();

    }

    public static ResportesTask exportar(String endDate, String startDate, String token, String type_report) {
        return new ResportesTask(endDate, startDate, token, type_report);
    }
}
