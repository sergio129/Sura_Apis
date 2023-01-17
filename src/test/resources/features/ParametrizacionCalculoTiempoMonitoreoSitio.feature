Feature: Calculo de tiempo monitoreo en sitio

  Background:
    Given Ingresar datos api login sara

  @TestCreacionCalculoTiempoMonitoreoSitio
  Scenario: Creacion Exitosa de parametrizacion calculo de tiempo monitoreo sitio
    When Gestionamos apis de Sara
    And Datos Calculo tiempo monitoreo en sitio, Nombre:"Pruebas Apis", Momento servicio:"33937", Lineas:"1578", TipoServicio:"486", Departamentos:"554", Municipios:"1016", Delta:"652"
    Then Validamos respuesta del servicio 200
