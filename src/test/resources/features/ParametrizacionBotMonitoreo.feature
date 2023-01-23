Feature: Parametrizacion de bot de monitoreo

  Background:
    Given Ingresar datos api login sara contrasena:"Colombia_2026",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"

  @ParametrizacionBotmonitoreo
  Scenario: Creacion Exitosa de Parametrizacion Bot de monitoreo
    When Gestionamos apis de Sara
    And Bot monitoreo Gestion Coordinacion:"1573",Departamentos:"448, 1609, 1629",Lineas:"1578, 1575, 1577", Municipios:"574",Nombre Parametrizacion:"Apis 4", Tipo Servicio:"451, 452, 453",Servicios Especiales:"1584, 1583, 1582", Tareas Monitoreo:"1741, 1745, 1742", Token:"xxx"
    Then Validamos respuesta del servicio 200


  @ParametrizacionBotmonitoreoEdliminar
  Scenario: Eliminacion Exitosa de Parametrizacion Bot de monitoreo
    When Gestionamos apis de Sara
    And Bot monitoreo eliminar Registros, Id Registro: "1", Estado: "0", Token: "XXXXX"
    Then Validamos respuesta del servicio 200


