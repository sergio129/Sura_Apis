package co.konecta.sura.api.Tareas.Parametrizaciones.DestinatiosAlertas;

import co.konecta.sura.api.Modelos.Parametrizaciones.DestinatariosAlertas.DestinatariosAlertasModel;
import co.konecta.sura.api.stepdefinitions.LoginSara.LoginSaraStepDefinitions;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class DestinatariosAlertasTask2 implements Task {
    private final DestinatariosAlertasModel alertasModel;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to("/alertReceivers/save")
                .with(requestSpecification -> requestSpecification
                        .body("{\"departments\": ["+alertasModel.getDepartments()+"],\n" +
                                "\"emails\": \""+alertasModel.getEmails()+"\",\n" +
                                "\"lines\": ["+alertasModel.getLines()+"],\n" +
                                "\"municipalies\": ["+alertasModel.getMunicipalies()+"],\n" +
                                "\"par_name\": \""+alertasModel.getPar_name()+"\",\n" +
                                "\"services\": [486, 470, 500],\n" +
                                "\"token\": \""+alertasModel.getToken()+"\"}")));

    }
    public static DestinatariosAlertasTask2 datos(DestinatariosAlertasModel alertasModel){
        return new DestinatariosAlertasTask2(alertasModel);
    }
}
