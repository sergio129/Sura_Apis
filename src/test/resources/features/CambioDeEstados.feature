Feature: hacer cambios de estados de los expedientes

  Background:
    Given Ingresar datos api login sara
  @testCambioDeEstado
  Scenario Outline: Cambio de estado Exitoso Con id de expediente
    When Gestionamos apis de Sara
    And Ingresamos los datos para el cambio de estado IdCaso<id_case>, Estado<id_state>, token<token>
    Then Validamos respuesta del servicio 200
    Examples:
      | id_case                              | id_state | token |
      | 82ca457b-90bd-3a84-bfe6-e1a81daa0eba | 530      | xxxxx |

  @tes2
  Scenario: Cambio de estado con expediente creado
    When Gestionamos apis de Sara
    And Datos para el cambio de estado id_Caso: "XXXX", Estado: "523", Token: "XXXX"
    Then Validamos respuesta del servicio 200