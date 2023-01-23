package co.konecta.sura.api.Tareas.Casos.Casos;

import co.konecta.sura.api.Modelos.Casos.Casos.CreacionCasosModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class CreacionCasoTask implements Task {
    private final CreacionCasosModel model;
    private final TokenModel tokenModel;


    @Override
    public <T extends Actor> void performAs(T t) {
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
                        "\"caso_expediente\":\"" + model.getCaso_expediente() + "\",\n" +
                        "\"caso_id_app_movil\": \"" + model.getCaso_id_app_movil() + "\",\n" +
                        "\"caso_marca_vehiculo\": \"" + model.getCaso_marca_vehiculo() + "\",\n" +
                        "\"caso_municipio_servicio\": \"" + model.getCaso_municipio_servicio() + "\",\n" +
                        "\"caso_municipio_solicita\": \"" + model.getCaso_municipio_solicita() + "\",\n" +
                        "\"caso_nombre_solicita\": \"puebas\",\n" +
                        "\"caso_placa\": \"SVG85R\",\n" +
                        "\"caso_servicios_especiales\": \"Soat_y_Guardaines\",\n" +
                        "\"caso_telefono_1\": \"1010101010\",\n" +
                        "\"caso_telefono_2\": \"1111111111\",\n" +
                        "\"caso_tipo_servicio\": \"Abogado_En_Sitio\",\n" +
                        "\"caso_ubicacion_servicio\": \"Laboratorio\",\n" +
                        "\"category\": \"Amarillo\",\n" +
                        "\"customer_type\": \"Intermedio\",\n" +
                        "\"description\": \"Pruebas Apis\",\n" +
                        "\"expediente_de_click\": \"No\",\n" +
                        "\"incompleto_clic_c\": null,\n" +
                        "\"name\": \"ZAAAAAAAAAA2602\",\n" +
                        "\"responsable_c\": \"Sergio Luis Anaya Romero\",\n" +
                        "\"token\": \n" +
                        "\"" + tokenModel.getToken() + "\"}")
                .post("casesClaimRequest/save")
                .then()
                .body("message", equalTo("Registro guardado correctamente"));
    }

    public static CreacionCasoTask Escribir(CreacionCasosModel model, TokenModel tokenModel) {
        return new CreacionCasoTask(model, tokenModel);
    }
}
