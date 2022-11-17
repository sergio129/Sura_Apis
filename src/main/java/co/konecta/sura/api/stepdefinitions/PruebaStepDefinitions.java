package co.konecta.sura.api.stepdefinitions;

import co.konecta.sura.api.Modelos.Parametrizaciones.MotivosLlamadas.MotivosLllamadaModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions.restApiUrlSara;

public class PruebaStepDefinitions {

    Actor konecta = Actor.named("Sergio");
    TokenModel tokenModel = new TokenModel();

    @Before
    public void setUp() {
        konecta.whoCan(CallAnApi.at(restApiUrlSara));

    }

    @And("Informacion de prueba{string}")
    public void infomacionPruebas(String token) {
        this.tokenModel.setToken(LoginSaraTask.Capturartoken());
        Integer gestionCNM = 168;
        Integer UnidadControl = 188;
        Integer Backlog = 200;
        Integer RolLider = 242;
        Integer RolCoordinacion = 243;
        Integer RolGerente = 244;
        konecta.attemptsTo(Post.to("/parameterization-uck/save")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON)
                        .body("{\n" +
                                "    \"lines\": [ 1575, 1578 ],\n" +
                                "    \"services\": [451,  452],\n" +
                                "    \"guard\": [   1579],\n" +
                                "    \"specialServices\": [1582,1580],\n" +
                                "    \"statusService\": [ 522],\n" +
                                "    \"monitoringType\": [1741,1742],\n" +
                                "     \"manager\": [ 1574, 1573],\n" +
                                "    \"name\": \"pruebas Apis2\",\n" +
                                "    \"estCieExpediente\": [1585,1587],\n" +
                                "    \"supplier\": [ 608, 618],\n" +
                                "    \"taskStatus\": [1732, 1755,226 ],\n" +
                                "    \"expirationTime\": {\"" + gestionCNM + "\": 1, \"" + UnidadControl + "\": 2, \"" + Backlog + "\": 3, \"" + RolLider + "\": 4, \"" + RolCoordinacion + "\": 5,\"" + RolGerente + "\": 6},\n" +
                                "    \"token\": \"" + tokenModel.getToken() + "\"\n" +
                                "}"))
        );
    }

    @And("Informacion de prueba Cierre de expediente{string}")
    public void informacionDePruebaCierreDeExpediente(String arg0) {
        this.tokenModel.setToken(LoginSaraTask.Capturartoken());
        konecta.attemptsTo(Post.to("/paramClosingCases/save")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON)
                        .body("{\n" +
                                "    \"line\": [32891],\n" +
                                "    \"service\": [32892],\n" +
                                "    \"field\": \"224\",\n" +
                                "    \"token\": \"" + tokenModel.getToken() + "\"\n" +
                                "}"))
        );
    }

    @And("Informacion de prueba Asignacion")
    public void informacionDePruebaAsignacion() {
        String Selecionar_Rol = "rol",Gestion_Cordinacion = "coordinationManager";

        this.tokenModel.setToken(LoginSaraTask.Capturartoken());
        konecta.attemptsTo(Post.to("/wizard/save")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON)
                        .body("{\n" +
                                "    \"" + Selecionar_Rol + "\": 212,\n" +
                                "    \"users\": [2518],\n" +
                                "    \"lines\": [32880],\n" +
                                "    \"services\": [32883],\n" +
                                "    \"departments\": [545 ],\n" +
                                "    \""+Gestion_Cordinacion+"\": [1573 ],\n" +
                                "    \"token\": \"" + tokenModel.getToken() + "\"\n" +
                                "}"))
        );


    }
}
