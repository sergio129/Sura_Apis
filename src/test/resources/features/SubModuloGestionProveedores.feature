Feature: Poder gestionar los roveedores en los expedientes

  Background:
    Given Gestion de proveedores



  @TestAsignaciondeProveedores
  Scenario:Gestion Exitosa Proveedores
    When Ingresar datos api login sara contrasena:"Colombia_2026",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And Hacemos la gestion del proveedor Parte uno, Accion:"Guardar",IdCaso:"2eccc3c4-c824-38e4-a43d-380c58f2a815",TelefonoCentralUno:"1111111111", TelefonoCentralDos:"2222222222",countCharacter:"7",FechaMoniDestino:"2022-10-19"
    And Hacemos La gestion del proveedor Parte Dos, FechaMoniSitio:"2022-10-19",HoraMoniDestino:"03:00:00 ",HoraMonitSitio:"03:00:00",IdProveedor:"227",Moduloid:"33" NombreProveedor:"PROVEEDOR PRUEBA",RespuestaProveedor:"Toma_Servicio"
    And Hacemos la gestion del proveedor parte tres, Observaciones:"Pruebas Apis",recordingTime:"0", TelTecnico:"3103666665", TMonitDestino: "30" TMonitSitio: "20", token:"xxxxxxx"
    Then Validamos respuesta del servicio 200
