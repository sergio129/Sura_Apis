package co.konecta.sura.api.Modelos.Parametrizaciones.NotificacionesPush;

public class NotificacionesPushModel {

    private String id_line;
    private String id_role;
    private String id_service;
    private String id_status;
    private String time_appointment_one;
    private String time_appointment_two;
    private String time_moment_one;
    private String time_moment_two;
    private String token;

    public String getId_line() {
        return id_line;
    }

    public void setId_line(String id_line) {
        this.id_line = id_line;
    }

    public String getId_role() {
        return id_role;
    }

    public void setId_role(String id_role) {
        this.id_role = id_role;
    }

    public String getId_service() {
        return id_service;
    }

    public void setId_service(String id_service) {
        this.id_service = id_service;
    }

    public String getId_status() {
        return id_status;
    }

    public void setId_status(String id_status) {
        this.id_status = id_status;
    }

    public String getTime_appointment_one() {
        return time_appointment_one;
    }

    public void setTime_appointment_one(String time_appointment_one) {
        this.time_appointment_one = time_appointment_one;
    }

    public String getTime_appointment_two() {
        return time_appointment_two;
    }

    public void setTime_appointment_two(String time_appointment_two) {
        this.time_appointment_two = time_appointment_two;
    }

    public String getTime_moment_one() {
        return time_moment_one;
    }

    public void setTime_moment_one(String time_moment_one) {
        this.time_moment_one = time_moment_one;
    }

    public String getTime_moment_two() {
        return time_moment_two;
    }

    public void setTime_moment_two(String time_moment_two) {
        this.time_moment_two = time_moment_two;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
