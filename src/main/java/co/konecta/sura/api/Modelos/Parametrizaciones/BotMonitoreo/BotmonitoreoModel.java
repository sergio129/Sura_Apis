package co.konecta.sura.api.Modelos.Parametrizaciones.BotMonitoreo;

public class BotmonitoreoModel {

private String coordination_manager;
    private String departments;
    private String lines;
    private String municipalities;
    private String name;
    private String service_type;
    private String special_services;
    private String task_type;
    private String token;


    public String getCoordination_manager() {
        return coordination_manager;
    }

    public void setCoordination_manager(String coordination_manager) {
        this.coordination_manager = coordination_manager;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public String getLines() {
        return lines;
    }

    public void setLines(String lines) {
        this.lines = lines;
    }

    public String getMunicipalities() {
        return municipalities;
    }

    public void setMunicipalities(String municipalities) {
        this.municipalities = municipalities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getSpecial_services() {
        return special_services;
    }

    public void setSpecial_services(String special_services) {
        this.special_services = special_services;
    }

    public String getTask_type() {
        return task_type;
    }

    public void setTask_type(String task_type) {
        this.task_type = task_type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
