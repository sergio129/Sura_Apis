Feature: Parametrizacion de bot de monitoreo

  Background:
    Given  Crear, Editar, inabilitar parametrizacion bot de monitoreo

  @ParametrizacionBotmonitoreo
  Scenario: Creacion Exitosa de Parametrizacion Bot de monitoreo
    When Ingresar datos api login sara contrasena:"Colombia_2026",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And Bot monitoreo Gestion Coordinacion:"1573",Departamentos:"448, 1609, 1629",Lineas:"1578, 1575, 1577", Municipios:"574",Nombre Parametrizacion:"Apis 2", Tipo Servicio:"451, 452, 453",Servicios Especiales:"1584, 1583, 1582", Tareas Monitoreo:"1741, 1745, 1742", Token:"xxx"
    Then Validamos respuesta del servicio 200

