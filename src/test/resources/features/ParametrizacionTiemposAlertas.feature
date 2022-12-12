Feature: Parametrizacion de tiempos de alertas

  Background:
    Given Ingresar datos api login sara contrasena:"Colombia_2027",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"

  @Testiemposalertas
  Scenario Outline: Creacion Exitosa tiempos de alertas
    When Ingresamos los datos de login
    And Ingresamos los datos tiempos de alertas  <lines> <services> <time> <Token>
    Then Validamos respuesta del servicio 200
    Examples:
      | lines | services | time | Token  |
      | 1578  | 451,542  | 448  | xxxxxx |