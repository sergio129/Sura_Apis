Feature: Parametrizacion de Indicativos de Marcacion

  Background:
    Given Ingresar datos api login sara
  @TestIndicativosMarcacion
  Scenario Outline: Creacion Exitosa de indicativos de Marcacion
    When Gestionamos apis de Sara
    And Ingresamos los datos:  <city> <indicative> <state> <Token>
    Then Validamos respuesta del servicio 200
    Examples:
      | city | indicative | state | Token  |
      | 1578 | 8999       | 448   | xxxxxx |


  @TestIndicativosMarcacionEliminar
  Scenario Outline: Eliminacion Exitosa de indicativos de Marcacion
    When Gestionamos apis de Sara
    And Ingresamos los datos eliminar: <id> <token>
    Then Validamos respuesta del servicio 200
    Examples:
      | id   | token |
      | 1578 | XXXXX |