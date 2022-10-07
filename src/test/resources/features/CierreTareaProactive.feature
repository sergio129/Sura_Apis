Feature: poder hacer cierre de tareas de monitoreo

  Background:
    Given Cerrar tarea de monitoreo

  @TestCierreTareasPoractive
  Scenario Outline: Cierre de tarea monitoreo proacti
    When Autenticacion proactive Usuario:"bot.konecta.sura"Contrasena"b0tK0n3ct4*"
    And Ingresamos token:"", idCaso:"1a5162f7-26a9-301b-914c-d03951979fe1", idTarea"6e41cce8-181f-11ed-83d5-0050569f2da3 "
    Then Validamos respuesta del servicio 200
    Examples:
      | userName         | password    |
      | bot.konecta.sura | b0tK0n3ct4* |



