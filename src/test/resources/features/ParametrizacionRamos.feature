Feature: Creacion una parametrizacion de ramos

  Background:
    Given Ingresar datos api login sara contrasena:"Colombia_2026",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"

  @TestCreacionRamos
  Scenario: Creacion Exitosa de Ramos
    When Ingresamos los datos de login
    And Ingresamos  Linea "1578" , Nombre"Pruebas Apis3", Token"xxxxxx"
    Then Validamos respuesta del servicio 200


  @TestCreacionRamos2
  Scenario Outline: Creacion Exitosa de Ramos
    When Ingresar datos api login sara contrasena:"Colombia_2025",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And Ingresamos  <linea>  <Nombre> <Token>
    Then Validamos respuesta del servicio 200
    Examples:
      | linea | Nombre        | Token  |
      | 1578  | pruebas apis9 | xxxxxx |