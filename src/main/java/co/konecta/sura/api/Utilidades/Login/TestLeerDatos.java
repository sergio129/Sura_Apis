package co.konecta.sura.api.Utilidades.Login;

import java.util.ResourceBundle;

public class TestLeerDatos {
    public static ResourceBundle resourceBundle(){
        if (System.getProperty("env")!=null){
            return ResourceBundle.getBundle(System.getProperty("env"));
        }else {
            return ResourceBundle.getBundle("Test");
        }
    }
    public static String getTestLeerDatos(String llave){
        return resourceBundle().getString(llave);
    }
}