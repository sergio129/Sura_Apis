Feature: Poder loguarse en sara y generar el token

  Background:
    Given Ingresar datos api login sara contrasena:"Colombia_2026",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"

  @TesGenerarReporte
 Scenario: Reporte
    When Ingresamos los datos de login
    And Ingresamos los datos para exportar el informe Fecha Inicio:"2022-10-21", Fecha fin:"2022-10-21", tipo de reporte:"monitoring_time", token:"XXXX"

    Then Validamos respuesta del servicio 200

