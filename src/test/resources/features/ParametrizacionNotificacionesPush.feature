Feature: Parametrizacion notificaciones push

  Background:
    Given crear , eliminar parametrizaciones notificaciones puhs

  @TestCracionNotificacionPush
  Scenario Outline: Creacion Exitosa de Parametrizacion notificacion Push
    When Ingresar datos api login sara contrasena:"Colombia_2026",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And Datos parametrizacion notificaciones push<id_line>,<id_role>,<id_service>,<id_status>,<time_ap_uno>,<time_ap_dos>,<time_mo_uno>,<time_mo_dos>,<token>
    Then Validamos respuesta del servicio 200
    Examples:
      | id_line    | id_role | id_service | id_status | time_ap_uno | time_ap_dos | time_mo_uno | time_mo_dos | token |
      | 1575, 1578 | 1       | 451        | 531       | 1           | 3           | 5           | 6           | 2     |

  @TestCracionNotificacionPush2
  Scenario: Creacion Exitosa de Parametrizacion notificacion Push
    When Ingresar datos api login sara contrasena:"Colombia_2026",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And parametrizacion notificaciones push lineas:"1575, 1578"Rol:"1"Servicios:"451, 452"Estado:"531"TiempoMoUno:"5"TiempoMoDos:"3"TiempoCitaUno:"3"tiempoCitaDos:"3"Token:"XXXXX"
    Then Validamos respuesta del servicio 200