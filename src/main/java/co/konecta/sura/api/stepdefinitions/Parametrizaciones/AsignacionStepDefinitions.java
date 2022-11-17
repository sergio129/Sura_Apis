package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Modelos.Parametrizaciones.Asignacion.AsignacionModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import co.konecta.sura.api.Tareas.Parametrizaciones.Asginacion.AsignacionTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class AsignacionStepDefinitions {

    Actor konecta = Actor.named("Sergio");
    TokenModel tokenModel = new TokenModel();
    AsignacionModel asignacionModel = new AsignacionModel();

    @Before
    public void setUp() {
        konecta.whoCan(CallAnApi.at(restApiUrlSara));

    }

    @When("Crear Parametrizacion Asginacion, Rol:{string}, Usuarios:{string}, Lineas:{string}, Servicios:{string}, Departamentos:{string}, Gestion coordinacion:{string}")
    public void crear_parametrizacion_asginacion_rol_usuarios_lineas_servicios_departamentos_gestion_coordinacion(String rol, String users, String lines, String services, String departments, String coordinationManager) {
        this.asignacionModel.setRol(rol);
        this.asignacionModel.setUsers(users);
        this.asignacionModel.setLines(lines);
        this.asignacionModel.setServices(services);
        this.asignacionModel.setDepartments(departments);
        this.asignacionModel.setCoordinationManager(coordinationManager);
        this.tokenModel.setToken(LoginSaraTask.Capturartoken());
        konecta.attemptsTo(AsignacionTask.datos(asignacionModel, tokenModel));

    }
}
