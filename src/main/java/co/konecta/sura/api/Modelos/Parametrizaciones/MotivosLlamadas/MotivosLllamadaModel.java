package co.konecta.sura.api.Modelos.Parametrizaciones.MotivosLlamadas;

public class MotivosLllamadaModel {
    private String name;
    private String type;
    private String options;
    private String state;
    private String catastrophicEvent;
    private String lines;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCatastrophicEvent() {
        return catastrophicEvent;
    }

    public void setCatastrophicEvent(String catastrophicEvent) {
        this.catastrophicEvent = catastrophicEvent;
    }

    public String getLines() {
        return lines;
    }

    public void setLines(String lines) {
        this.lines = lines;
    }
}
