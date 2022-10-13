package co.konecta.sura.api.Modelos.Casos.CambioDeEstados;

public class CambioEstadosModel {
    private String id_case;
    private String id_state;
    private String token;

    public String getId_case() {
        return id_case;
    }

    public void setId_case(String id_case) {
        this.id_case = id_case;
    }

    public String getId_state() {
        return id_state;
    }

    public void setId_state(String id_state) {
        this.id_state = id_state;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
