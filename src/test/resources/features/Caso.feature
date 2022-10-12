Feature: Creacion de Expediente

  Background:
    Given Creacion de Casos


  @TestCreacionCaso
  Scenario Outline: Creacion Exitosa de indicativos de Marcacion
    When Ingresar datos api login sara contrasena:"Colombia_2025",proveedores 0, Estrellas 5, Justifi:"", Usuario:"sergio.anaya"
    And llenamos los datos Linea: "Autos"
    And Codigo de Seguridad: "AAA2559"
    And Fecha de Cita: "2022-10-12 3:0:00"
    And Fecha de Solicitud: "2022-10-12 10:58"
    And Clase de vehiculo: "Pripio"
    And Departamento de servicio: "05"
    And Departamento Solicita: "05"
    And Detalle de la direccion: "Calle 26S#85-10"
    And Detalle direccion destino: "Calle 27S#85-10"
    And Detalle del servicio: "Calle 28S#85-10"
    And Direccion de destino: "Calle 29S#85-10"
    And Direccion de Servicio: " Calle 26S"
    And Numero de Expediente: "ZAAAAAAAAAA2560"
    And Id app movil: "id15411"
    And Marca del Vehiculo: "Toyota"
    And Municipio de servicio: "Llano_Grande"
    And Municipio solicita: "Llano_Grande"
    And Nombre del solicitante: "Pepito Perez"
    And Placa: "SVG85R"
    And Servicio especial: "No"
    And Telefono uno: "3103904286"
    And Telefono Dos: "3133904286"
    And Tipo de servicio: "Abogado_En_Sitio"
    And Ubicacion del servicio: "Laboratorio"
    And Categoria: "Verde"
    And Tipo de cliente: "Intermedio"
    And Descripcion: "kkkkkkkkkkkkkkkk"
    And Gestion Coordinacion: "No"
   # And Nombre:"ZAAAAAAAAAA2560"
    And Responsable: "Sergio Luis Anaya Romero"
   # And Ingresamos los datos del casos:<linea> <codigoSeg> <FechaC> <FechaS> <ClaseV> <DepartS> <DepartSol> <DetalleDireccion> <DetalleDireccionD> <DetalleS> <Ddestino> <Dservicio> <expediente> <Amovil> <Mvehiculo> <municipio_servicio> <municipio_solicita> <nombre_solicita> <placa> <S_especiales> <TelefonoUno> <TelefonoDos> <Tservicio> <Uservicio> <categoria> <Tcliente> <description> <GestionC> <name> <responsable> <token>
  #  And Ingresamos los datos del casos:<S_especiales>a<TelefonoUno>a<TelefonoDos>a<Tservicio>a<Uservicio>a<categoria>a<Tcliente>a<description>a<GestionC>a<name>a<responsable>a<token>
    And Token: "XXXX"
    And Creamos el caso
    Then Validamos respuesta del servicio 200
    Examples:
      | S_especiales | TelefonoUno | TelefonoDos | Tservicio        | Uservicio   | categoria | Tcliente   | description | GestionC | name            | responsable              | token |
      | No           | 1010101010  | 1010101010  | Abogado_En_Sitio | Laboratorio | Verde     | Intermedio | QA          | No       | ZAAAAAAAAAA2560 | Sergio Luis Anaya Romero | XXXX  |

      #  "allus_linea_c": "Linea"
#  "case_codigo_sec": "Codigo de seguridad"
#  "case_date_appointment": "Fecha de cita"
#  "case_date_request": "Fecha de Solicitud"
#  "caso_clase_vehiculo": "Clase de Vehiculo"
#  "caso_depto_servicio": "Departamento de servicio"
#  "caso_depto_solicita": "Departamento Solicita"
#  "caso_detalle_direccion": Detalle de la direccion"
#  "caso_detalle_direccion_destino": "Detalle direccion destino"
#  "caso_detalle_servicio": "Detalle del servicio"
#  "caso_direccion_destino": "Direccion de destino"
#  "caso_direccion_servicio": "Direccion de Servicio"
#  "caso_expediente":"Numero de Expedeinte",
#  "caso_id_app_movil": "Id app movil"
#  "caso_marca_vehiculo": "Marca del Vehiculo"
#  "caso_municipio_servicio": "Municipio de servicio"
#  "caso_municipio_solicita": "Municipio solicita"
#  "caso_nombre_solicita": "Nombre del solicitante"
#  "caso_placa": "placa"
#  "caso_servicios_especiales": "Servicio especial"
#  "caso_telefono_1": "Telefono1"
#  "caso_telefono_2": "Telefono2"
#  "caso_tipo_servicio": "Tipo de servicio"
#  "caso_ubicacion_servicio": "Ubicacion del servicio"
#  "category": "categoria"
#  "customer_type": "Tipo de cliente"
#  "description": "Pruebas Apis"
#  "expediente_de_click": "Gestion Coordinacion"
#  "incompleto_clic_c": null
#  "name": "ZAAAAAAAAAA2559"
#  "responsable_c": "Sergio Luis Anaya Romero"
#  "token":