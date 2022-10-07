package co.konecta.sura.api.Modelos;

public class LoginSaraModel {
    private String password;
    private Integer provider;
    private Integer survey;
    private String surveyJustification;
    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getProvider() {
        return provider;
    }

    public void setProvider(Integer provider) {
        this.provider = provider;
    }

    public Integer getSurvey() {
        return survey;
    }

    public void setSurvey(Integer survey) {
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
