Feature: Parametrizacion de destinatarios de alertas

  Background:
    Given Ingresar datos api login sara

  @ParametrizacionDestinatariosAlertas
  Scenario: Creacion Exitosa de Parametrizacion destinatarios de alertas
    When Gestionamos apis de Sara
    And Parametrizacion destinario de alertas, Departamentos:"448, 1609",Email:"konecta@pruebas.com",Lineas:"1578, 1575",Municipios:"1375",NombreParametrizacion:"pruebas10",Servicios:"486,470,500",token:"xxxx"
    Then Validamos respuesta del servicio 200