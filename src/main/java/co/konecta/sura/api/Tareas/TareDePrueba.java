package co.konecta.sura.api.Tareas;

import co.konecta.sura.api.interaccion.Post;
import com.sun.xml.bind.v2.runtime.reflect.opt.Const;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TareDePrueba implements Task {
    private final Object userInfo;

    public TareDePrueba(Object userInfo) {
        this.userInfo = userInfo;
    }

    Integer gestionCNM = 168;
    Integer UnidadControl = 188;
    Integer Backlog = 200;
    Integer RolLider = 242;
    Integer RolCoordinacion = 243;
    Integer RolGerente = 244;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Post.to("/parameterization-uck/save")
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
                                "    \"expirationTime\": {\"" + gestionCNM + "\": 1, \"" + UnidadControl + "\": 2, \"" + Backlog + "\": 3, \"" + RolLider + "\": 4, \"" + RolCoordinacion + "\": 5,\"" + RolCoordinacion + "\": 6},\n" +
                                "    \"token\": \"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2NjgwOTAzMTAsImV4cCI6MTY2ODEyNjMxMCwiZGF0YSI6eyJuYW1lIjoiU2VyZ2lvIEx1aXMgQW5heWEgUm9tZXJvIiwiaWQiOiJiMjg4ZTZlZS05MmU1LTMwNDQtOTYwZC0wNTg3OGViMzEwM2MiLCJuZXdJZCI6MzM1MywiaXNfYWRtaW4iOjAsInN0YXR1cyI6IkFjdGl2ZSIsInJvbGUiOnsicm9sZV9pZCI6ImE3Yzk1ODBkLTZkMTYtMjNiMi0xZWRjLTU3ODQwNzEyYWY2ZiIsInJvbGVfbmFtZSI6IkFkbWluIEJhY2tsb2ciLCJuZXdfcm9sZV9pZCI6MjAwLCJuZXdfcm9sZV9uYW1lIjoiQWRtaW4gQmFja2xvZyJ9LCJpcF9zZXJ2ZXIiOiIxNzIuMjMuMS4xMTUiLCJpcF91c2VyIjoiMTg2LjE0NC4xNjguMjUwIiwibGVnYWxNb2R1bGVBY2Nlc3MiOjB9fQ.6u-_Uu5WAwAz5CCJvarSZEiAq4GElx3uHFAJlDu53bo\"\n" +
                                "}"))
        );


    }

    public static Performable Info(Object UserInfo) {
        return instrumented(TareDePrueba.class, UserInfo);
    }
}
