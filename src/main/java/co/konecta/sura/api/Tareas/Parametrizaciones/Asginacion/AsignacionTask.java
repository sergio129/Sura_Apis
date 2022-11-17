package co.konecta.sura.api.Tareas.Parametrizaciones.Asginacion;

import co.konecta.sura.api.Modelos.Parametrizaciones.Asignacion.AsignacionModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;


public class AsignacionTask implements Task {
    String Rol = "rol", Gestion_Cordinacion = "coordinationManager", Usuario = "users", Lineas = "lines", Servicios = "services", Departamentos = "departments";
    private final AsignacionModel asignacion;
    private final TokenModel tokenModel;

    public AsignacionTask(AsignacionModel asignacion, TokenModel tokenModel) {
        this.asignacion = asignacion;
        this.tokenModel = tokenModel;
    }

    @Override
    public <T extends Actor> void performAs(T konecta) {
        konecta.attemptsTo(Post.to("/wizard/save")
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON)
                        .body("{\n" +
                                "    \"" + Rol + "\": " + asignacion.getRol() + ",\n" +
                                "    \"" + Usuario + "\": [" + asignacion.getUsers() + "],\n" +
                                "    \"" + Lineas + "\": [" + asignacion.getLines() + "],\n" +
                                "    \"" + Servicios + "\": [" + asignacion.getServices() + "],\n" +
                                "    \"" + Departamentos + "\": [" + asignacion.getDepartments() + " ],\n" +
                                "    \"" + Gestion_Cordinacion + "\": [" + asignacion.getCoordinationManager() + " ],\n" +
                                "    \"token\": \"" + tokenModel.getToken() + "\"\n" +
                                "}"))
        );

    }

    public static AsignacionTask datos(AsignacionModel asignacion, TokenModel tokenModel) {
        return new AsignacionTask(asignacion, tokenModel);
    }
}
