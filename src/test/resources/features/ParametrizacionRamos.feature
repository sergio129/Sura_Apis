Feature: Creacion una parametrizacion de ramos

  Background:
    Given Parametrizacion de ramos

  @TestCreacionRamos
  Scenario: Creacion Exitosa de Ramos
    When Ingresar datos api login sara contrasena:"Colombia_2025",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And Ingresamos  Linea "1578" , Nombre"Pruebas Apis3", Token"xxxxxx"
    Then Validamos respuesta del servicio 200


  @TestCreacionRamos2
  Scenario Outline: Creacion Exitosa de Ramos
    When Ingresar datos api login sara contrasena:"Colombia_2025",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And Ingresamos  <line>  <Nombre> <Token>
    Then Validamos respuesta del servicio 200
    Examples:
      | line | Nombre       | Token  |
      | 1578 | pruebas apis | xxxxxx |