package co.konecta.sura.api.Utilidades;

import co.konecta.sura.api.Modelos.Casos.SubmoduloGestionProveedores.GestionProveedoresModel;

import java.util.ResourceBundle;

public class Datos_Gestion_Proveedores {

    public static ResourceBundle resourceBundle() {
        if (System.getProperty("env") != null) {
            return ResourceBundle.getBundle(System.getProperty("env"));
        } else {
            return ResourceBundle.getBundle("GestionProveedor");
        }
    }

    public static String getDatos_Gestion_proveedores(String key) {
        return resourceBundle().getString(key);
    }


    public static GestionProveedoresModel proveedoresModel() {
        GestionProveedoresModel model = new GestionProveedoresModel();
        model.setName_provider(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("name_provider"));
        model.setId_provider(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("id_provider"));
        model.setProvider_response(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("provider_response"));
        model.setDate_monitoring_site(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("date_monitoring_site"));
        model.setTime_monitoring_site(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("time_monitoring_site"));
        model.setHour_monitoring_site(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("hour_monitoring_site"));
        model.setDate_monitoring_destination(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("date_monitoring_destination"));
        model.setTime_monitoring_destination(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("time_monitoring_destination"));
        model.setHour_monitoring_destination(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("hour_monitoring_destination"));
        model.setTechnician_phone_number(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("technician_phone_number"));
        model.setCentral_phone_1(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("central_phone_1"));
        model.setCentral_phone_2(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("central_phone_2"));
        model.setObservation(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("observation"));
        model.setAction(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("action"));
        model.setCountCharacter(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("countCharacter"));
        model.setModuleId(Datos_Gestion_Proveedores.getDatos_Gestion_proveedores("moduleId"));
        return model;
    }
}
