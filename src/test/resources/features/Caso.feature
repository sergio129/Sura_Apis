Feature: Creacion de Expediente

  Background:
    Given Ingresar datos api login sara

  @TestBuscarExpediente
  Scenario: Creacion Exitosa de Caso
    When Gestionamos apis de Sara
    And Numero de Expediente a Buscar:"H14AAAAAAAA2602"
    Then Validamos respuesta del servicio 200

#Estados
  #530 = programados
  #525 = Aceptado y desplazamiento
  #522 = Concluido
  #521 = Finalizado

  @TestCreacionCasoCompleto
  Scenario: Creacion Exitosa de Caso
    When Gestionamos apis de Sara
    And Llenamos los datos en el archivo CreacionCaso.Properties
    #Cambio de estado, programado
    And Datos para el cambio de estado id_Caso: "XXXX", Estado: "530", Token: "XXXX"
    #Gestion de proveedores
    And Llenamos los datos del proveedor en el archivo GestionProveedor.Properties
    #Modulo de novedades
    # 25700= Abogado Virtual, 25702=Cambios Abogado virtual en sitio, 1829=Si
    And Datos Novedades Reporta novedad:"25700", Cauda novedad:"25702",Genera Radicado:"1829", NRadicado:"Radica2929", Observaciones:"pruebas Apis"
    #Modulo Escalamiento Sura
    And Datos Escalamiento Sura, Tipo Gestion:"1886", Persona Gestion:"33261", Tipo Respuesta:"1917", Genera Queja:"1829",Radicado de la Queja:"R20335" Observaciones:"Pruebas Apis QA"
    #Modulo gestion  CNM
    #1908=CNM, 1829=Si
    And Datos Documentacion CNM Persona gestion:"1908", Genera queja:"1829", Radicado:"Radica2929", Observaciones:"Puebas QA Apis"
    #Cambio de estado,Aceptado y desplazamiento
    And Datos para el cambio de estado id_Caso: "XXXX", Estado: "525", Token: "XXXX"
    #Modulo Finalizacion
    # 1924=Asegurado, 1933=Llamada
    And Datos Modulo Finalizacion, Finalizar con:"1924", Tipo respuesta:"1933", Observaciones: "Pruebas Apis QA"
    #Cambio de estado, concluido
    And Datos para el cambio de estado id_Caso: "XXXX", Estado: "522", Token: "XXXX"
    #Cambio de estado, finalizado
    And Datos para el cambio de estado id_Caso: "XXXX", Estado: "521", Token: "XXXX"
    Then Validamos respuesta del servicio 200



