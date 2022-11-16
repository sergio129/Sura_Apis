package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Modelos.Parametrizaciones.CierreExpediente.CierreExpedienteModel;
import co.konecta.sura.api.Modelos.Parametrizaciones.MotivosLlamadas.MotivosLllamadaModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import co.konecta.sura.api.Tareas.Parametrizaciones.CierreExpediente.CierreExpedienteTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class CierreExpedienteStepDefinitions {
    Actor konecta = Actor.named("Sergio");
    TokenModel tokens = new TokenModel();
    CierreExpedienteModel cierre = new CierreExpedienteModel();

    @Before
    public void setUp() {
        konecta.whoCan(CallAnApi.at(restApiUrlSara));
    }

    @And("Datos Parametrizacion cierre expediente Linea:{string}, Servicio:{string}, Campo:{string}")
    public void datos_parametrizacion_cierre_expediente_linea_servicio_campo(String line, String service, String field) {
        this.cierre.setLine(line);
        this.cierre.setService(service);
        this.cierre.setField(field);
        this.tokens.setToken(LoginSaraTask.Capturartoken());
        konecta.attemptsTo(CierreExpedienteTask.datos(cierre,tokens));

    }
}
