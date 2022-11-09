Feature: Parametrizacion de destinatarios de alertas

  Background:
    Given Ingresar datos api login sara contrasena:"Colombia_2026",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"

  @ParametrizacionDestinatariosAlertas
  Scenario: Creacion Exitosa de Parametrizacion destinatarios de alertas
    When Ingresamos los datos de login
    And Parametrizacion destinario de alertas, Departamentos:"448, 1609",Email:"konecta@pruebas.com",Lineas:"1578, 1575",Municipios:"1375",NombreParametrizacion:"pruebas10",Servicios:"486,470,500",token:"xxxx"
    Then Validamos respuesta del servicio 200