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
    Then Validamos respuesta del servicio 200
