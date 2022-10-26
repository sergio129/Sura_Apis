package co.konecta.sura.api.conf;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;


public class ConfiguracionGeneral {
    public static final String restApiUrlSara = "https://saralabs.grupokonecta.co:8591/api";
    public void Configuracion() {


        RestAssured.baseURI = restApiUrlSara;
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .build();
    }
}
