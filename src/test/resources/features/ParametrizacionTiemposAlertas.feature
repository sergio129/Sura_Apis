Feature: Parametrizacion de tiempos de alertas

  Background:
    Given  Crear, Editar, Eliminar Parametrizacion tiempos de alertas

  @Testiemposalertas
  Scenario Outline: Creacion Exitosa tiempos de alertas
    When Ingresar datos api login sara contrasena:"Colombia_2026",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And Ingresamos los datos tiempos de alertas  <lines> <services> <time> <Token>
    Then Validamos respuesta del servicio 200
    Examples:
      | lines | services | time | Token  |
      | 1578  | 451,542  | 448  | xxxxxx |