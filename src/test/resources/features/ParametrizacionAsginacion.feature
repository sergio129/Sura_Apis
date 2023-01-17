Feature: Parametrizacion de asignacion

  Background:
    Given ingresar por la api de login de Sara

  @ParametrizacionAginacion
  Scenario: Creacion Exitosa de Parametrizacion Asignacion
    When Gestionamos apis de Sara
    And Crear Parametrizacion Asginacion, Rol:"212", Usuarios:"2518", Lineas:"32880", Servicios:"32883", Departamentos:"545", Gestion coordinacion:"1573"
    Then Validamos respuesta del servicio 200