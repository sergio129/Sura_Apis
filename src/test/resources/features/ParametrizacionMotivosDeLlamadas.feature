Feature: Parametrizacion Motivos de llamadas

  #Estados 1: Habilitado, 0: Inhabilitado
  # Evento Catastrofico true: chek Habiltiado, false Check Desablitilado
  Background:
    Given Ingresar datos api login sara contrasena:"Colombia_2027",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
  @TestMotivoDeLlamada
  Scenario: Creacion Exitosa de Motivo de llamada
    When Ingresamos los datos de login
    And Informacion Basica Motivos de llamada, Nombre:"Pruebas Apis 2",Tipo:"27282", Opcion:"Pruebas Apis", Estado:"1", Evento Catastrofico:"true", Lineas:"1578, 1575,1577, 1576",Token:""
    Then Validamos respuesta del servicio 200
