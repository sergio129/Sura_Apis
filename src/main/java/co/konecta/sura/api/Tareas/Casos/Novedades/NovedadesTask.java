package co.konecta.sura.api.Tareas.Casos.Novedades;

import co.konecta.sura.api.Modelos.Casos.Novedades.NovedadesModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class NovedadesTask implements Task {
    private final TokenModel token;
    private final NovedadesModel model;

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.given()
                .body("{\n" +
                        "    \"whoReports\":" + model.getWhoReports() + ",\n" +
                        "    \"causeNovelty\": " + model.getCauseNovelty() + ",\n" +
                        "    \"generateComplaint\": " + model.getGenerateComplaint() + ",\n" +
                        "    \"filedComplaint\": \"" + model.getFiledComplaint() + "\",\n" +
                        "    \"observation\": \"" + model.getObservation() + "\",\n" +
                        "    \"moduleId\": 21,\n" +
                        "    \"action\": \"Guardar\",\n" +
                        "    \"payProvider\": false,\n" +
                        "    \"case_id\": \"" + model.getCase_id() + "\",\n" +
                        "    \"provider_id\": \"326\",\n" +
                        "    \"token\": \"" + token.getToken() + "\"\n" +
                        "}")
                .post("newsManagement/save")
                .then()
                .body("message", equalTo("Registro guardado correctamente"));

    }
    public static NovedadesTask EscribirDatosNovedades(TokenModel token, NovedadesModel model){
        return new NovedadesTask(token,model);
    }
}
