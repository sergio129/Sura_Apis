Feature: inicio de sesion  de usuario
  con tal que puede hacer gestion de la aplicacion Sara
  Background:
    Given Sergio es usuario de Sara
  @Test
  Scenario:Login Exitoso
    When Envia la informacion inicio de sesion
    Then debe ser un usuario valido