Feature: Creacion una parametrizacion de ramos

  Background:
    Given Parametrizacion de ramos

  @TestCreacionRamos
  Scenario: Creacion Exitosa de Ramos
    When Ingresar datos api login sara contrasena:"Colombia_2025",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And Ingreamos  Linea 1578, Nombre"Pruebas Apis3", Token"xxxxxx"
    Then Validamos respuesta del servicio 200


