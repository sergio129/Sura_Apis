package co.konecta.sura.api.Modelos.Parametrizaciones.Asignacion;

public class AsignacionModel {
    private String rol;
    private String users;
    private String lines;
    private String services;
    private String departments;
    private String coordinationManager;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

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

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public String getCoordinationManager() {
        return coordinationManager;
    }

    public void setCoordinationManager(String coordinationManager) {
        this.coordinationManager = coordinationManager;
    }
}
