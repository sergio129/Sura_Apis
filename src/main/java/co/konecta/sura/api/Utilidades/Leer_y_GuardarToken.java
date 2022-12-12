package co.konecta.sura.api.Utilidades;

import co.konecta.sura.api.Modelos.Token.TokenModel;


import java.io.*;
import java.util.ResourceBundle;

import static co.konecta.sura.api.Tareas.LoginSara.LoginSaraTask.Capturartoken;
import static java.util.ResourceBundle.clearCache;


public class Leer_y_GuardarToken {
    public static ResourceBundle resourceBundle() {




        if (System.getProperty("env") != null) {
            return ResourceBundle.getBundle(System.getProperty("env"));
        } else {

            ClassLoader cl = ClassLoader.getSystemClassLoader();
            ResourceBundle.clearCache(cl);
            System.out.println("Cache Operation Completed.");

            return ResourceBundle.getBundle("Token");
        }
    }

    public static String getLeer_y_GuardarToken(String key) {
        return resourceBundle().getString(key);
    }

    public static TokenModel TokenValido() {
        TokenModel token = new TokenModel();
        token.setToken(Leer_y_GuardarToken.getLeer_y_GuardarToken("valido.token.user"));
        return token;
    }

}
