package co.konecta.sura.api.Utilidades.Login;

import co.konecta.sura.api.Modelos.Otros.LoginSaraModel;


public class TestUserCreator {
    public static LoginSaraModel UsuarioValido() {
        LoginSaraModel user = new LoginSaraModel();
        user.setPassword(TestLeerDatos.getTestLeerDatos("valido.user.password"));
        user.setProvider(TestLeerDatos.getTestLeerDatos("valido.user.proveedor"));
        user.setSurvey(TestLeerDatos.getTestLeerDatos("valido.user.estrellas"));
        user.setSurveyJustification(TestLeerDatos.getTestLeerDatos("valido.user.justificacion"));
        user.setUsername(TestLeerDatos.getTestLeerDatos("valido.user.name"));

        return user;
    }

    public static LoginSaraModel getTipoUsuario(String tipo) {
        switch (tipo) {
            case "Usuario Valido":
                return UsuarioValido();
            default:
                throw new RuntimeException("Intente con otro usuario o contraseña: " + tipo);
        }
    }
}
