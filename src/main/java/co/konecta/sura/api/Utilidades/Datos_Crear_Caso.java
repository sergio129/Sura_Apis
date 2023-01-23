package co.konecta.sura.api.Utilidades;

import co.konecta.sura.api.Modelos.Casos.Casos.CreacionCasosModel;
import co.konecta.sura.api.Modelos.Token.TokenModel;
import co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask;

import java.util.ResourceBundle;

public class Datos_Crear_Caso {

    public static ResourceBundle resourceBundle(){
        if (System.getProperty("env")!=null){
            return ResourceBundle.getBundle(System.getProperty("env"));
        }else {
            return ResourceBundle.getBundle("CreacionCaso");
        }
    }

    public static String getDatos_Crear_Caso(String key) {
        return resourceBundle().getString(key);
    }

    public static CreacionCasosModel casosModel() {
        CreacionCasosModel casosModel = new CreacionCasosModel();
        casosModel.setAllus_linea_c(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.allus_linea_c"));
        casosModel.setCase_codigo_sec(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.case_codigo_sec"));
        casosModel.setCase_date_appointment(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.case_date_appointment"));
        casosModel.setCase_date_request(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.case_date_request"));
        casosModel.setCaso_clase_vehiculo(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_clase_vehiculo"));
        casosModel.setCaso_depto_servicio(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_depto_servicio"));
        return casosModel;
    }

}


