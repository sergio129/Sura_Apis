package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Modelos.EstadoReclamaciones.EstadoReclamacionCreacionModel;
import co.konecta.sura.api.Modelos.Parametrizaciones.CalculoTiempoMonitoreoSitio.CalculoTiempoMonitoreoSitioModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import co.konecta.sura.api.Tareas.Parametrizaciones.CalculoTiempoMonitoreoSitio.CalculoTiempoMonitoreoSitioCreacionTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class CalculoTiempoMonitoreoSitioStepDefinitions {
    Actor konecta = Actor.named("Sergio");
    TokenModel token = new TokenModel();
    CalculoTiempoMonitoreoSitioModel model = new CalculoTiempoMonitoreoSitioModel();

    @Before
    public void setUp() {
        konecta.whoCan(CallAnApi.at(restApiUrlSara));

    }

    @And("Datos Calculo tiempo monitoreo en sitio, Nombre:{string}, Momento servicio:{string}, Lineas:{string}, TipoServicio:{string}, Departamentos:{string}, Municipios:{string}, Delta:{string}")
    public void datos_calculo_tiempo_monitoreo_en_sitio_nombre_momento_servicio_lineas_tipo_servicio_departamentos_municipios_delta(String name, String service_time, String lines, String service_type, String departments, String municipalities, String delta) {
        this.model.setName(name);
        this.model.setService_time(service_time);
        this.model.setLines(lines);
        this.model.setService_type(service_type);
        this.model.setDepartments(departments);
        this.model.setMunicipalities(municipalities);
        this.model.setDelta(delta);
        this.token.setToken(LoginSaraTask.tokenLogin());
        konecta.attemptsTo(CalculoTiempoMonitoreoSitioCreacionTask.EscribirDatos(model, token));
    }

}
