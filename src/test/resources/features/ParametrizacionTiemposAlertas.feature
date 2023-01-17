Feature: Parametrizacion de tiempos de alertas

  Background:
    Given Ingresar datos api login sara

  @Testiemposalertas
  Scenario Outline: Creacion Exitosa tiempos de alertas
    When Gestionamos apis de Sara
    And Ingresamos los datos tiempos de alertas  <lines> <services> <time> <Token>
    Then Validamos respuesta del servicio 200
    Examples:
      | lines | services | time | Token  |
      | 1578  | 451,542  | 448  | xxxxxx |