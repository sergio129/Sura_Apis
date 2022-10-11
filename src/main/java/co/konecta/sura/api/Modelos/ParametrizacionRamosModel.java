package co.konecta.sura.api.Modelos;

public class ParametrizacionRamosModel {

    private int Linea;
    private String branch;
    private String Token;

    public int getLinea() {
        return Linea;
    }

    public void setLinea(int linea) {
        Linea = linea;
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
