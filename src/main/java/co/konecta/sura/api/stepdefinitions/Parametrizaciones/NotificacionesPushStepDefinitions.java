package co.konecta.sura.api.stepdefinitions.Parametrizaciones;

import co.konecta.sura.api.Modelos.Otros.DatosComunesModel;
import co.konecta.sura.api.Modelos.Parametrizaciones.NotificacionesPush.NotificacionesPushModel;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import co.konecta.sura.api.Tareas.Parametrizaciones.NotificacionesPush.NotificacionesPushEliminarTask;
import co.konecta.sura.api.Tareas.Parametrizaciones.NotificacionesPush.NotificacionesPushTask;
import co.konecta.sura.api.Tareas.Parametrizaciones.NotificacionesPush.NotificacionesPushVisualizarTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.conf.ConfiguracionGeneral.restApiUrlSara;


public class NotificacionesPushStepDefinitions {

    Actor konecta = new Actor("Konecta");
    NotificacionesPushModel pushModel = new NotificacionesPushModel();
    DatosComunesModel comunesModel = new DatosComunesModel();

    @Before
    public void setUp() {
        // conf.Configuracion();
        konecta.whoCan(CallAnApi.at(restApiUrlSara));
    }

    @Given("crear , eliminar parametrizaciones notificaciones puhs")
    public void crear_eliminar_parametrizaciones_notificaciones_puhs() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^Datos parametrizacion notificaciones push(.*),(.*),(,*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void datosParametrizacionNotificacionesPushId_lineId_roleId_serviceId_statusTime_ap_unoTime_ap_dosTime_mo_unoTime_mo_dosToken() {

    }

    @And("^Datos parametrizacion notificaciones push(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void datosParametrizacionNotificacionesPushId_lineId_roleId_serviceId_statusime_ap_unoTime_ap_dosTime_mo_unoTime_mo_dosToken(String id_line, String id_role, String id_service, String id_status, String time_appointment_one, String time_appointment_two, String time_moment_one, String time_moment_two, String token) {
        this.pushModel.setId_line(id_line);
        this.pushModel.setId_role(id_role);
        this.pushModel.setId_service(id_service);
        this.pushModel.setId_status(id_status);
        this.pushModel.setTime_appointment_one(time_appointment_one);
        this.pushModel.setTime_appointment_two(time_appointment_two);
        this.pushModel.setTime_moment_one(time_moment_one);
        this.pushModel.setTime_moment_two(time_moment_two);
        this.pushModel.setToken(LoginSaraTask.Capturartoken());
        konecta.attemptsTo(NotificacionesPushTask.datos(pushModel));
    }

    @And("parametrizacion notificaciones push lineas:{string}Rol:{string}Servicios:{string}Estado:{string}TiempoMoUno:{string}TiempoMoDos:{string}TiempoCitaUno:{string}tiempoCitaDos:{string}Token:{string}")
    public void parametrizacionNotificacionesPushLineasRolServiciosEstadoTiempoMoUnoTiempoMoDosTiempoCitaUnoTiempoCitaDos(String id_line, String id_role, String id_service, String id_status, String time_appointment_one, String time_appointment_two, String time_moment_one, String time_moment_two, String toke) {
        this.pushModel.setId_line(id_line);
        this.pushModel.setId_role(id_role);
        this.pushModel.setId_service(id_service);
        this.pushModel.setId_status(id_status);
        this.pushModel.setTime_appointment_one(time_appointment_one);
        this.pushModel.setTime_appointment_two(time_appointment_two);
        this.pushModel.setTime_moment_one(time_moment_one);
        this.pushModel.setTime_moment_two(time_moment_two);
        this.pushModel.setToken(LoginSaraTask.Capturartoken());
        konecta.attemptsTo(NotificacionesPushTask.datos(pushModel));
    }

    @And("Visualizar parametrizacion notificaciones push Id:{string} Token:{string}")
    public void visualizarParametrizacionNotificacionesPushIdToken(String arg0, String arg1) {
        this.comunesModel.setId(arg0);
        this.comunesModel.setToken(LoginSaraTask.Capturartoken());
        konecta.attemptsTo(NotificacionesPushVisualizarTask.datos(comunesModel));
    }

    @And("Eliminar parametrizacion notificaciones push Id:{string} Token:{string}")
    public void eliminarParametrizacionNotificacionesPushIdToken(String arg0, String arg1) {
        this.comunesModel.setId(arg0);
        this.comunesModel.setToken(LoginSaraTask.Capturartoken());
        konecta.attemptsTo(NotificacionesPushEliminarTask.datos(comunesModel));
    }
}
