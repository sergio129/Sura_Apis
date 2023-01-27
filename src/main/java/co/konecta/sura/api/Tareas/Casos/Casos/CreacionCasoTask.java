package co.konecta.sura.api.Tareas.Casos.Casos;

import co.konecta.sura.api.Modelos.Casos.Casos.CreacionCasosModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import com.github.javafaker.Faker;

import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class CreacionCasoTask implements Task {
    private final CreacionCasosModel model;
    private final TokenModel tokenModel;


    @Override
    public <T extends Actor> void performAs(T t) {
        String Exp = NumeroExpediente();
        SerenityRest.given()

                .body("{\n" +
                        "    \"allus_linea_c\": \"" + model.getAllus_linea_c() + "\",\n" +
                        "\"case_codigo_sec\": \"" + model.getCase_codigo_sec() + "\",\n" +
                        "\"case_date_appointment\": \"" + model.getCase_date_appointment() + "\",\n" +
                        "\"case_date_request\": \"" + model.getCase_date_request() + "\",\n" +
                        "\"caso_clase_vehiculo\": \"" + model.getCaso_clase_vehiculo() + "\",\n" +
                        "\"caso_depto_servicio\": \"" + model.getCaso_depto_servicio() + "\",\n" +
                        "\"caso_depto_solicita\": \"" + model.getCaso_depto_solicita() + "\",\n" +
                        "\"caso_detalle_direccion\": \"" + model.getCaso_detalle_direccion() + "\",\n" +
                        "\"caso_detalle_direccion_destino\": \"" + model.getCaso_detalle_direccion_destino() + "\",\n" +
                        "\"caso_detalle_servicio\": \"" + model.getCaso_detalle_servicio() + "\",\n" +
                        "\"caso_direccion_destino\": \"" + model.getCaso_direccion_destino() + "\",\n" +
                        "\"caso_direccion_servicio\": \"" + model.getCaso_direccion_destino() + "\",\n" +
                        "\"caso_expediente\":\"" + Exp + model.getCase_codigo_sec() + "\",\n" +
                        "\"caso_id_app_movil\": \"" + model.getCaso_id_app_movil() + "\",\n" +
                        "\"caso_marca_vehiculo\": \"" + model.getCaso_marca_vehiculo() + "\",\n" +
                        "\"caso_municipio_servicio\": \"" + model.getCaso_municipio_servicio() + "\",\n" +
                        "\"caso_municipio_solicita\": \"" + model.getCaso_municipio_solicita() + "\",\n" +
                        "\"caso_nombre_solicita\": \"" + model.getCaso_nombre_solicita() + "\",\n" +
                        "\"caso_placa\": \"" + model.getCaso_placa() + "\",\n" +
                        "\"caso_servicios_especiales\": \"" + model.getCaso_servicios_especiales() + "\",\n" +
                        "\"caso_telefono_1\": \"" + model.getCaso_telefono_1() + "\",\n" +
                        "\"caso_telefono_2\": \"" + model.getCaso_telefono_2() + "\",\n" +
                        "\"caso_tipo_servicio\": \"" + model.getCaso_tipo_servicio() + "\",\n" +
                        "\"caso_ubicacion_servicio\": \"" + model.getCaso_ubicacion_servicio() + "\",\n" +
                        "\"category\": \"" + model.getCategory() + "\",\n" +
                        "\"customer_type\": \"" + model.getCustomer_type() + "\",\n" +
                        "\"description\": \"" + model.getDescription() + "\",\n" +
                        "\"expediente_de_click\": \"" + model.getExpediente_de_click() + "\",\n" +
                        "\"incompleto_clic_c\": null,\n" +
                        "\"name\": \"" + Exp + model.getCase_codigo_sec() + "\",\n" +
                        "\"responsable_c\": \"" + model.getResponsable_c() + "\",\n" +
                        "\"token\": \n" +
                        "\"" + tokenModel.getToken() + "\"}")
                .post("case/saveCases")
                .then()
                .body("message", equalTo("Registro guardado correctamente"));
        Serenity.setSessionVariable("idCase").to(CapturarCaseID());
    }

    public static CreacionCasoTask Escribir(CreacionCasosModel model, TokenModel tokenModel) {
        return new CreacionCasoTask(model, tokenModel);
    }

    public static String CapturarCaseID() {
        String cadena = (SerenityRest.lastResponse().body().jsonPath().getString("data.id"));
        return cadena;
    }

    public static String CaseID() {
        return Serenity.sessionVariableCalled("idCase");
    }

    public static String NumeroExpediente() {
        Faker faker = new Faker();
        String NumeroCaso = faker.random().hex(8);
        return NumeroCaso;
    }


}
