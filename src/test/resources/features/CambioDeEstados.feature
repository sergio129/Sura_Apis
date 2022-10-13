Feature: hacer cambios de estados de los expedientes

  Background:
    Given poder hacer cambios de estados de los expedientes

  @testCambioDeEstado
  Scenario Outline: Cambio de estado Exitoso Con id de expediente
    When Ingresar datos api login sara contrasena:"Colombia_2025",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And Ingresamos los datos para el cambio de estado IdCaso<id_case>, Estado<id_state>, token<token>
    Then Validamos respuesta del servicio 200
    Examples:
      | id_case                              | id_state | token |
      | 86e59931-1655-3d77-8232-e45265c54347 | 523      | xxxxx |




  Scenario: Cambio de estado con expediente creado
    When Ingresar datos api login sara contrasena:"Colombia_2025",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And Datos para el cambio de estado id_Caso: "XXXX", Estado: "523", Token: "XXXX"
    Then Validamos respuesta del servicio 200