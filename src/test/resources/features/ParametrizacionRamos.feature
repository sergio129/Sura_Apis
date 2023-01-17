Feature: Creacion una parametrizacion de ramos

  Background:
    Given Ingresar datos api login sara

  @TestCreacionRamos
  Scenario: Creacion Exitosa de Ramos
    When Gestionamos apis de Sara
    And Ingresamos  Linea "1578" , Nombre"Pruebas Apis3", Token"xxxxxx"
    Then Validamos respuesta del servicio 200


  @TestCreacionRamos2
  Scenario Outline: Creacion Exitosa de Ramos
    When Gestionamos apis de Sara
    And Ingresamos  <linea>  <Nombre> <Token>
    Then Validamos respuesta del servicio 200
    Examples:
      | linea | Nombre        | Token  |
      | 1578  | pruebas apis9 | xxxxxx |