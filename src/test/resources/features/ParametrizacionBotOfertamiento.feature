Feature: Parametrizacion Bot de ofertamiento Creacion y edicion

  Background:
    Given Ingresar datos api login sara

  @TestBotOfertamiento
  Scenario: Creacion Exitosa de Parametrizacion bot de ofertamiento
    When Gestionamos apis de Sara
    And Creacion parametrizacion bot de ofertamien, GestionCoordinacion:"1573",Departamentos:"448, 545",Lineas:"1578, 1577"Municipios:"574, 576"Nombre:"Pruebas Apis"TipoOfertamiento:"33259"TipoServicio:"452"Tiempo:"65"Token:"XXXX"
    Then Validamos respuesta del servicio 200


  @TestBotOfertamientoHabilitar
  Scenario: Creacion Exitosa de Parametrizacion bot de ofertamiento
    When Gestionamos apis de Sara
    And Cambio de estado parametrizacion bot de ofertamiento IdRegistro:"36", Estado:"1", Token:"xxxxx"
    Then Validamos respuesta del servicio 200