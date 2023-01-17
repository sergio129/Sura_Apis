Feature: feature de parametrizacion cierre de expediente


  Background:
    Given Ingresar datos api login sara


  @TestParametrizacionCierreExpediente
  Scenario: Creacion Exitosa de Campos Cierre Expediente
    When Gestionamos apis de Sara
    And Datos Parametrizacion cierre expediente Linea:"32891", Servicio:"32892", Campo:"224"
    Then Validamos respuesta del servicio 200