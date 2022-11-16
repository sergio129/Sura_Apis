Feature: feature de parametrizacion cierre de expediente


  Background:
    Given Ingresar datos api login sara contrasena:"Colombia_2027",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"


  @TestParametrizacionCierreExpediente
  Scenario: Creacion Exitosa de Campos Cierre Expediente
    When Ingresamos los datos de login
    And Datos Parametrizacion cierre expediente Linea:"32891", Servicio:"32892", Campo:"224"
    Then Validamos respuesta del servicio 200