Feature: Poder hacer buqueda de casos avanzado

  Background:
    Given Ingresar datos api login sara

  @TesBusquedaAvanzada
  Scenario: Login Exitoso
    When Gestionamos apis de Sara
  And Hacemos la busqueda de casos
    Then Validamos respuesta del servicio 200