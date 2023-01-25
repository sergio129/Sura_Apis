Feature: Creacion de Expediente

  Background:
    Given Ingresar datos api login sara

  @TestCreacionCaso
  Scenario: Creacion Exitosa de Caso
    When Gestionamos apis de Sara
    And Datos para el cambio de estado id_Caso: "XXXX", Estado: "530", Token: "XXXX"
    Then Validamos respuesta del servicio 200


  @TestCreacionCasoCompleto
  Scenario: Creacion Exitosa de Caso
    When Gestionamos apis de Sara
    And Llenamos los datos en el archivo CreacionCaso.Properties
    And Datos para el cambio de estado id_Caso: "XXXX", Estado: "530", Token: "XXXX"
    And Llenamos los datos del proveedor en el archivo GestionProveedor.Properties
    And Datos Novedades Reporta novedad:"25700", Cauda novedad:"25702",Genera Radicado:"1829", NRadicado:"Radica2929", Observaciones:"pruebas Apis"
    And Datos Documentacion CNM Persona gestion:"1908", Genera queja:"1829", Radicado:"Radica2929", Observaciones:"Puebas QA Apis"
    And Datos para el cambio de estado id_Caso: "XXXX", Estado: "525", Token: "XXXX"
    And Datos para el cambio de estado id_Caso: "XXXX", Estado: "522", Token: "XXXX"
    And Datos para el cambio de estado id_Caso: "XXXX", Estado: "521", Token: "XXXX"
    Then Validamos respuesta del servicio 200



