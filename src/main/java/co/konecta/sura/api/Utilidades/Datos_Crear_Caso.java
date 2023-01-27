package co.konecta.sura.api.Utilidades;

import co.konecta.sura.api.Modelos.Casos.Casos.CreacionCasosModel;


import java.util.ResourceBundle;

public class Datos_Crear_Caso {

    public static ResourceBundle resourceBundle() {
        if (System.getProperty("env") != null) {
            return ResourceBundle.getBundle(System.getProperty("env"));
        } else {
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
        casosModel.setCaso_depto_solicita(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_depto_solicita"));
        casosModel.setCaso_detalle_direccion(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_detalle_direccion"));
        casosModel.setCaso_detalle_direccion_destino(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_detalle_direccion_destino"));
        casosModel.setCaso_detalle_servicio(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_detalle_servicio"));
        casosModel.setCaso_direccion_destino(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_direccion_destino"));
        casosModel.setCaso_direccion_servicio(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_direccion_servicio"));
        casosModel.setCaso_expediente(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_expediente"));
        casosModel.setCaso_id_app_movil(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_id_app_movil"));
        casosModel.setCaso_marca_vehiculo(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_marca_vehiculo"));
        casosModel.setCaso_municipio_servicio(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_municipio_servicio"));
        casosModel.setCaso_municipio_solicita(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_municipio_solicita"));
        casosModel.setCaso_nombre_solicita(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_nombre_solicita"));
        casosModel.setCaso_placa(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_placa"));
        casosModel.setCaso_servicios_especiales(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_servicios_especiales"));
        casosModel.setCaso_telefono_1(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_telefono_1"));
        casosModel.setCaso_telefono_2(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_telefono_2"));
        casosModel.setCaso_tipo_servicio(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_tipo_servicio"));
        casosModel.setCaso_ubicacion_servicio(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.caso_ubicacion_servicio"));
        casosModel.setCategory(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.category"));
        casosModel.setCustomer_type(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.customer_type"));
        casosModel.setDescription(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.description"));
        casosModel.setExpediente_de_click(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.expediente_de_click"));
        casosModel.setName(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.name"));
        casosModel.setResponsable_c(Datos_Crear_Caso.getDatos_Crear_Caso("Caso.responsable_c"));
        return casosModel;
    }
}


