Feature: Poder loguarse en sara y generar el token

  Background:
    Given Ingresar datos api login sara

  @TesLoginSara
  Scenario: Login Exitoso
    When Gestionamos apis de Sara
  #  When Ingresar datos api login sara contrasena:"Colombia_2027",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    Then Validamos respuesta del servicio 200
