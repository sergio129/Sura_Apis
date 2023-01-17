package co.konecta.sura.api.Modelos.Otros;

public class LoginSaraModel {
    private String password;
    private String provider;
    private String survey;
    private String surveyJustification;
    private String username;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getSurvey() {
        return survey;
    }

    public void setSurvey(String survey) {
        this.survey = survey;
    }

    public String getSurveyJustification() {
        return surveyJustification;
    }

    public void setSurveyJustification(String surveyJustification) {
        this.surveyJustification = surveyJustification;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
