package co.konecta.sura.api.Tareas.Parametrizaciones.BotOfertamiento;

import co.konecta.sura.api.Modelos.Parametrizaciones.BotOfertamiento.BotOfertamientoModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


public class BotOfertamientoTask implements Task {
    private final BotOfertamientoModel ofertamientoModel;

    public BotOfertamientoTask(BotOfertamientoModel ofertamientoModel) {
        this.ofertamientoModel = ofertamientoModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.given()
                .when()
                .body("{\"coordination_manager\": " + ofertamientoModel.getCoordination_manager() + ",\n" +
                        "\"departments\": [" + ofertamientoModel.getDepartments() + "],\n" +
                        "\"lines\": [" + ofertamientoModel.getLines() + "],\n" +
                        "\"municipalities\": [" + ofertamientoModel.getMunicipalities() + "],\n" +
                        "\"name\": \"" + ofertamientoModel.getName() + "\",\n" +
                        "\"offert_type\": " + ofertamientoModel.getOffert_type() + ",\n" +
                        "\"service_type\": [" + ofertamientoModel.getService_type() + "],\n" +
                        "\"time\": " + ofertamientoModel.getTime() + ",\n" +
                        "\"token\": \"" + ofertamientoModel.getToken() + "\"}")
                .post("/offertChattigoParametrization/saveParametrization")
                .then();

    }

    public static BotOfertamientoTask DatosOfertamiento(BotOfertamientoModel ofertamientoModel) {
        return new BotOfertamientoTask(ofertamientoModel);
    }
}
