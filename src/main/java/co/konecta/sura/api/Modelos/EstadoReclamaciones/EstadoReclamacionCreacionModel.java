package co.konecta.sura.api.Modelos.EstadoReclamaciones;

public class EstadoReclamacionCreacionModel {
    private String name;
    private String cedula;
    private String plate;
    private String phone;
    private String medium_contact;
    private String request_context;
    private String reiterativity_number;
    private String claim_date_hour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMedium_contact() {
        return medium_contact;
    }

    public void setMedium_contact(String medium_contact) {
        this.medium_contact = medium_contact;
    }

    public String getRequest_context() {
        return request_context;
    }

    public void setRequest_context(String request_context) {
        this.request_context = request_context;
    }

    public String getReiterativity_number() {
        return reiterativity_number;
    }

    public void setReiterativity_number(String reiterativity_number) {
        this.reiterativity_number = reiterativity_number;
    }

    public String getClaim_date_hour() {
        return claim_date_hour;
    }

    public void setClaim_date_hour(String claim_date_hour) {
        this.claim_date_hour = claim_date_hour;
    }
}
