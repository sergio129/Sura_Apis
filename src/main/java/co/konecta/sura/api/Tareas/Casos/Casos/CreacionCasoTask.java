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
                        "    \"allus_linea_c\": \"Autos\",\n" +
                        "\"case_codigo_sec\": \"AAA2602\",\n" +
                        "\"case_date_appointment\": \"2022-10-12 3:0:00\",\n" +
                        "\"case_date_request\": \"2022-10-12 10:58\",\n" +
                        "\"caso_clase_vehiculo\": \"Pripio\",\n" +
                        "\"caso_depto_servicio\": \"05\",\n" +
                        "\"caso_depto_solicita\": \"05\",\n" +
                        "\"caso_detalle_direccion\": \"Calle 26S#85-10\",\n" +
                        "\"caso_detalle_direccion_destino\": \"Calle 100\",\n" +
                        "\"caso_detalle_servicio\": \"asdasd\",\n" +
                        "\"caso_direccion_destino\": \"Calle 50\",\n" +
                        "\"caso_direccion_servicio\": \"Calle 26S#85-10\",\n" +
                        "\"caso_expediente\":\"ZAAAAAAAAAA2602\",\n" +
                        "\"caso_id_app_movil\": \"id5454\",\n" +
                        "\"caso_marca_vehiculo\": \"Chevrole\",\n" +
                        "\"caso_municipio_servicio\": \"Llano_Grande\",\n" +
                        "\"caso_municipio_solicita\": \"Llano_Grande\",\n" +
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
                        "\""+tokenModel.getToken()+"\"}")
                .post("casesClaimRequest/save")
                .then()
                .body("message", equalTo("Registro guardado correctamente"));
    }
    public static CreacionCasoTask Escribir(CreacionCasosModel model,  TokenModel tokenModel){
        return new CreacionCasoTask(model,tokenModel);
    }
}
