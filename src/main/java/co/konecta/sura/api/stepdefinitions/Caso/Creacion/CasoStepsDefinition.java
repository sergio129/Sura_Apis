package co.konecta.sura.api.stepdefinitions.Caso.Creacion;

import co.konecta.sura.api.Modelos.Casos.Casos.CreacionCasosModel;
import co.konecta.sura.api.Tareas.Casos.Casos.CreacionCasoTask;
import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class CasoStepsDefinition {

    Actor actor = Actor.named("Sergio");
    CreacionCasosModel casos = new CreacionCasosModel();

    @Before
    public void setUp() {

        actor.whoCan(CallAnApi.at(restApiUrlSara));
    }

    @Given("Creacion de Casos")
    public void creacion_de_casos() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^Ingresamos los datos del casos:(.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void ingresamosLosDatosDelCasos(String linea, String codigoSeg, String FechaC, String FechaS, String ClaseV, String DepartS, String DepartSol, String DetalleDireccion, String DetalleDireccionD, String DetalleS, String Ddestino, String Dservicio, String expediente, String Amovil, String Mvehiculo, String municipio_servicio, String municipio_solicita, String nombre_solicita, String placa, String S_especiales, String TelefonoUno, String TelefonoDos, String Tservicio, String Uservicio, String categoria, String Tcliente, String description, String GestionC, String name, String responsable, String token) {


        this.casos.setName(name);


    }

    @And("Ingresamos los datos del casos:(.*)a(.*)a(.*)a(.*)a(.*)a(.*)a(.*)a(.*)a(.*)a(.*)a(.*)a(.*)")
    public void ingresamosLosDatosDelCasosLineaC() {
    }

    @And("llenamos los datos Linea: {string}")
    public void llenamosLosDatosLinea(String linea) {
        this.casos.setAllus_linea_c(linea);
    }

    @And("Codigo de Seguridad: {string}")
    public void codigoDeSeguridad(String codigoSeg) {
        this.casos.setCase_codigo_sec(codigoSeg);
    }

    @And("Creamos el caso")
    public void creamosElCaso() {
        actor.attemptsTo(CreacionCasoTask.Escribir(casos));
    }

    @And("Fecha de Cita: {string}")
    public void fechaDeCita(String FechaC) {
        this.casos.setCase_date_appointment(FechaC);
    }

    @And("Fecha de Solicitud: {string}")
    public void fechaDeSolicitud(String FechaS) {
        this.casos.setCase_date_request(FechaS);
    }

    @And("Clase de vehiculo: {string}")
    public void claseDeVehiculo(String ClaseV) {
        this.casos.setCaso_clase_vehiculo(ClaseV);
    }

    @And("Departamento de servicio: {string}")
    public void departamentoDeServicio(String DepartS) {
        this.casos.setCaso_depto_servicio(DepartS);
    }

    @And("Departamento Solicita: {string}")
    public void departamentoSolicita(String DepartSol) {
        this.casos.setCaso_depto_solicita(DepartSol);
    }

    @And("Detalle de la direccion: {string}")
    public void detalleDeLaDireccion(String DetalleDireccion) {
        this.casos.setCaso_detalle_direccion(DetalleDireccion);
    }

    @And("Token: {string}")
    public void token(String arg0) {
        this.casos.setToken(LoginSaraStepDefinitions.Remplazardatos());
    }

    @And("Detalle direccion destino: {string}")
    public void detalleDireccionDestino(String DetalleDireccionD) {
        this.casos.setCaso_detalle_direccion_destino(DetalleDireccionD);
    }

    @And("Detalle del servicio: {string}")
    public void detalleDelServicio(String DetalleS) {
        this.casos.setCaso_detalle_servicio(DetalleS);

    }

    @And("Direccion de destino: {string}")
    public void direccionDeDestino(String Ddestino) {
        this.casos.setCaso_direccion_destino(Ddestino);

    }

    @And("Direccion de Servicio: {string}")
    public void direccionDeServicio(String Dservicio) {
        this.casos.setCaso_direccion_servicio(Dservicio);
    }

    @And("Numero de Expediente: {string}")
    public void numeroDeExpediente(String expediente) {
        this.casos.setCaso_expediente(expediente);

    }

    @And("Marca del Vehiculo: {string}")
    public void marcaDelVehiculo(String Amovil) {
        this.casos.setCaso_id_app_movil(Amovil);
    }

    @And("Id app movil: {string}")
    public void idAppMovil(String Mvehiculo) {
        this.casos.setCaso_marca_vehiculo(Mvehiculo);
    }

    @And("Municipio de servicio: {string}")
    public void municipioDeServicio(String municipio_servicio) {
        this.casos.setCaso_municipio_servicio(municipio_servicio);
    }

    @And("Municipio solicita: {string}")
    public void municipioSolicita(String municipio_solicita) {
        this.casos.setCaso_municipio_solicita(municipio_solicita);
    }

    @And("Nombre del solicitante: {string}")
    public void nombreDelSolicitante(String nombre_solicita) {
        this.casos.setCaso_nombre_solicita(nombre_solicita);

    }

    @And("Placa: {string}")
    public void placa(String placa) {
        this.casos.setCaso_placa(placa);
    }

    @And("Servicio especial: {string}")
    public void servicioEspecial(String S_especiales) {
        this.casos.setCaso_servicios_especiales(S_especiales);
    }

    @And("Telefono uno: {string}")
    public void telefonoUno(String TelefonoUno) {
        this.casos.setCaso_telefono_1(TelefonoUno);
    }

    @And("Telefono Dos: {string}")
    public void telefonoDos(String TelefonoDos) {
        this.casos.setCaso_telefono_2(TelefonoDos);
    }

    @And("Tipo de servicio: {string}")
    public void tipoDeServicio(String Tservicio) {
        this.casos.setCaso_tipo_servicio(Tservicio);
    }

    @And("Ubicacion del servicio: {string}")
    public void ubicacionDelServicio(String Uservicio) {
        this.casos.setCaso_ubicacion_servicio(Uservicio);
    }

    @And("Categoria: {string}")
    public void categoria(String categoria) {
        this.casos.setCategory(categoria);
    }

    @And("Tipo de cliente: {string}")
    public void tipoDeCliente(String Tcliente) {
        this.casos.setCustomer_type(Tcliente);
    }

    @And("Descripcion: {string}")
    public void descripcion(String description) {
        this.casos.setDescription(description);
    }

    @And("Gestion Coordinacion: {string}")
    public void gestionCoordinacion(String GestionC) {
        this.casos.setExpediente_de_click(GestionC);
    }

    @And("Responsable: {string}")
    public void responsable(String responsable) {
        this.casos.setResponsable_c(responsable);
    }
}
