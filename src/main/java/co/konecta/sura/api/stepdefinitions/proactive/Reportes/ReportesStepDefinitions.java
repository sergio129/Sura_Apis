package co.konecta.sura.api.stepdefinitions.proactive.Reportes;

import co.konecta.sura.api.Modelos.Casos.Casos.CreacionCasosModel;
import co.konecta.sura.api.Tareas.Reportes.ResportesTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class ReportesStepDefinitions {
    Actor actor = Actor.named("Sergio");

    @Before
    public void setUp() {
        RestAssured.baseURI = restApiUrlSara;
        actor.whoCan(CallAnApi.at(restApiUrlSara));
    }

    @Given("Poder generar todos los informes por parte de sara")
    public void poder_generar_todos_los_informes_por_parte_de_sara() {

    }


    @And("Ingresamos los datos para exportar el informe Fecha Inicio:{string}, Fecha fin:{string}, tipo de reporte:{string}, token:{string}")
    public void ingresamosLosDatosParaExportarElInformeFechaInicioFechaFinTipoDeReporteToken(String startDate, String endDate, String type_report, String token) {
        actor.attemptsTo(ResportesTask.exportar(endDate, startDate, token, type_report));
    }
}
