package co.konecta.sura.api.Modelos.Parametrizaciones.BotMonitoreo;

public class BotMonitoreoHabilitarModel {
    private String pm_id;
    private String status;
    private String token;

    public String getPm_id() {
        return pm_id;
    }

    public void setPm_id(String pm_id) {
        this.pm_id = pm_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
