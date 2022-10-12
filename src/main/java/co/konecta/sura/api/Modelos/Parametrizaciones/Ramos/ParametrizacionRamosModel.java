package co.konecta.sura.api.Modelos.Parametrizaciones.Ramos;

public class ParametrizacionRamosModel {

    private String Line;
    private String branch;
    private String Token;


    public String getLine() {
        return Line;
    }

    public void setLine(String line) {
        Line = line;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}
