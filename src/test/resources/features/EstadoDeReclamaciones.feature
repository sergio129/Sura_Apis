Feature: Modulo de estado de reclamaciones

  Background:
    Given logueamos en api de modulo estado de reclamaciones

    @TestLoginEstadoReclamaciones
  Scenario: Login Exitoso
    When Gestionamos apis de Sara
    Then Validamos respuesta del servicio 200

  @TestCreacionCasoEstadoReclamciones
  Scenario: Login Exitoso
    When Gestionamos apis de Sara
    And Datos Creacion de Caso estado Reclamaciones Nombre:"Pepo",Cedula"101541162",Placa:"SVB95F",Telefono:"310360428",Medio de Contacto:"Llamada",Contexto Solicitud:"Pruebas QA", Reiteratividad:"0", Hora:"2022-12-21 03:00:00"
    Then Validamos respuesta del servicio 200
