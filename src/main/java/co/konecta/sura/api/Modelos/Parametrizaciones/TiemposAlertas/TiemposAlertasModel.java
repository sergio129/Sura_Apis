package co.konecta.sura.api.Modelos.Parametrizaciones.TiemposAlertas;

public class TiemposAlertasModel {
    private  String lines;
    private String services;
    private String time;
    private String token;

    public String getLines() {
        return lines;
    }

    public void setLines(String lines) {
        this.lines = lines;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
