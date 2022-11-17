Feature: Parametrizacion de asignacion

  Background:
    Given Ingresar datos api login sara contrasena:"Colombia_2027",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"

  @ParametrizacionAginacion
  Scenario: Creacion Exitosa de Parametrizacion Asignacion
    When Ingresamos los datos de login
    And Crear Parametrizacion Asginacion, Rol:"212", Usuarios:"2518", Lineas:"32880", Servicios:"32883", Departamentos:"545", Gestion coordinacion:"1573"
    Then Validamos respuesta del servicio 200