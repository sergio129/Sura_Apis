Feature: Parametrizacion de Indicativos de Marcacion

  Background:
    Given  Crear, Editar, Eliminar

  @TestIndicativosMarcacion
  Scenario Outline: Creacion Exitosa de indicativos de Marcacion
    When Ingresar datos api login sara contrasena:"Colombia_2025",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And Ingresamos los datos:  <city> <indicative> <state> <Token>
    Then Validamos respuesta del servicio 200
    Examples:
      | city | indicative | state | Token  |
      | 1578 | 8999       | 448   | xxxxxx |