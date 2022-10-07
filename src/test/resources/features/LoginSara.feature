Feature: Poder loguarse en sara y generar el token

  Background:
    Given ingresar por la api de login de Sara
@TesLoginSara
  Scenario: Login Exitoso
    When Ingresar datos api login sara contrasena:"Colombia_2025",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    Then Validamos respuesta del servicio 200
