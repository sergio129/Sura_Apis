package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Modelos.Parametrizaciones.BotMonitoreo.BotMonitoreoHabilitarModel;
import co.konecta.sura.api.Modelos.Parametrizaciones.BotMonitoreo.BotmonitoreoModel;
import co.konecta.sura.api.Modelos.Parametrizaciones.MotivosLlamadas.MotivosLllamadaModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import co.konecta.sura.api.Tareas.Parametrizaciones.MotivosLlamada.MotivosLlamadaTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class MotivosDeLlamadaStepDefinitions {
    Actor konecta = Actor.named("Sergio");
    TokenModel tokens = new TokenModel();
    MotivosLllamadaModel motivos = new MotivosLllamadaModel();

    @Before
    public void setUp() {
        konecta.whoCan(CallAnApi.at(restApiUrlSara));
    }

    @And("Informacion Basica Motivos de llamada, Nombre:{string},Tipo:{string}, Opcion:{string}, Estado:{string}, Evento Catastrofico:{string}, Lineas:{string},Token:{string}")
    public void informacion_basica_motivos_de_llamada_nombre_tipo_opcion_estado_evento_catastrofico_lineas_token(String name, String type, String options, String state, String catastrophicEvent, String lines, String token) {
        this.motivos.setName(name);
        this.motivos.setType(type);
        this.motivos.setOptions(options);
        this.motivos.setState(state);
        this.motivos.setCatastrophicEvent(catastrophicEvent);
        this.motivos.setLines(lines);
        this.tokens.setToken(LoginSaraTask.Capturartoken());
        konecta.attemptsTo(MotivosLlamadaTask.DatosMotivos(motivos, tokens));

    }


}
