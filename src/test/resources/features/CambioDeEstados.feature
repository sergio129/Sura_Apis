Feature: hacer cambios de estados de los expedientes

  Background:
    Given Ingresar datos api login sara contrasena:"Colombia_2026",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
  @testCambioDeEstado
  Scenario Outline: Cambio de estado Exitoso Con id de expediente
    When Ingresamos los datos de login
    And Ingresamos los datos para el cambio de estado IdCaso<id_case>, Estado<id_state>, token<token>
    Then Validamos respuesta del servicio 200
    Examples:
      | id_case                              | id_state | token |
      | 82ca457b-90bd-3a84-bfe6-e1a81daa0eba | 530      | xxxxx |

  @tes2
  Scenario: Cambio de estado con expediente creado
    When Ingresar datos api login sara contrasena:"Colombia_2025",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And Datos para el cambio de estado id_Caso: "XXXX", Estado: "523", Token: "XXXX"
    Then Validamos respuesta del servicio 200