Feature: feature de prueba


  Background:
    Given Ingresar datos api login sara contrasena:"Colombia_2027",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"


  @TestPrueba
  Scenario: Pruebas
    When Ingresamos los datos de login
    And Informacion de prueba"XXX"
    Then Validamos respuesta del servicio 200

  @TestPruebacierreExpediente
  Scenario: Pruebas
    When Ingresamos los datos de login
    And Informacion de prueba Cierre de expediente"XXX"
    Then Validamos respuesta del servicio 200
