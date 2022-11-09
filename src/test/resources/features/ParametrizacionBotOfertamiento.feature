Feature: Parametrizacion Bot de ofertamiento Creacion y edicion

  Background:
    Given Ingresar datos api login sara contrasena:"Colombia_2026",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"

  @TestBotOfertamiento
  Scenario: Creacion Exitosa de Parametrizacion bot de ofertamiento
    When Ingresamos los datos de login
    And Creacion parametrizacion bot de ofertamien, GestionCoordinacion:"1573",Departamentos:"448, 545",Lineas:"1578, 1577"Municipios:"574, 576"Nombre:"Pruebas Apis"TipoOfertamiento:"33259"TipoServicio:"452"Tiempo:"65"Token:"XXXX"
    Then Validamos respuesta del servicio 200


  @TestBotOfertamientoHabilitar
  Scenario: Creacion Exitosa de Parametrizacion bot de ofertamiento
    When Ingresamos los datos de login
    And Cambio de estado parametrizacion bot de ofertamiento IdRegistro:"36", Estado:"1", Token:"xxxxx"
    Then Validamos respuesta del servicio 200