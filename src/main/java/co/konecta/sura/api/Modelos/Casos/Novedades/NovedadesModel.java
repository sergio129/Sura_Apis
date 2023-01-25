package co.konecta.sura.api.Modelos.Casos.Novedades;

public class NovedadesModel {
    private String whoReports;
    private String causeNovelty;
    private String generateComplaint;
    private String filedComplaint;
    private String observation;
    private String case_id ;

    public String getWhoReports() {
        return whoReports;
    }

    public void setWhoReports(String whoReports) {
        this.whoReports = whoReports;
    }

    public String getCauseNovelty() {
        return causeNovelty;
    }

    public void setCauseNovelty(String causeNovelty) {
        this.causeNovelty = causeNovelty;
    }

    public String getGenerateComplaint() {
        return generateComplaint;
    }

    public void setGenerateComplaint(String generateComplaint) {
        this.generateComplaint = generateComplaint;
    }

    public String getFiledComplaint() {
        return filedComplaint;
    }

    public void setFiledComplaint(String filedComplaint) {
        this.filedComplaint = filedComplaint;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getCase_id() {
        return case_id;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }
}
