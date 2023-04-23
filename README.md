# Farmacy Management

## Arquitectura
Se Propone usar el patron de diseño/arquitectura Modelo Vista Controlador (MVC), esto con el fin de preservar la legibilidad, integridad y escalabilidad de nuestro proyecto

  - main
    - Main.java
  - vista
    - VentanaPrincipal.java
    - VentanaClientes.java
    - VentanaEmpleados.java
    - VentanaProductos.java
    - VentanaVentas.java
    - VentanaInventario.java
  - controlador
    - ControladorPrincipal.java
    - ControladorClientes.java
    - ControladorEmpleados.java
    - ControladorProductos.java
    - ControladorVentas.java
    - ControladorInventario.java
  - modelo
    - Farmacia.java
    - Cliente.java
    - Empleado.java
    - Producto.java
    - Inventario.java
    - Venta.java
  - servicios
    - ServicioClientes.java
    - ServicioEmpleados.java
    - ServicioProductos.java
    - ServicioVentas.java
    - ServicioInventario.java

### Modelo
Principalmente contendra las clases que utilizara nuestro proyecto a si mismo como los metodos que nos permiten acceder y modificr sus atributos. Cada vista debería tener su propio controlador correspondiente.

### Vista
Contendra la interfaz de ususario, en donde utilizaremos la libreria JFrame para poder crear ventanas que el usuario usara para poder interactuar con nuestro programa. Es común tener una vista para cada clase del modelo, ya que cada una representa una entidad con su propia funcionalidad. En nuestro caso, las vistas podrían ser: VentanaClientes, VentanaEmpleados, VentanaProductos, VentanaVentas y VentanaInventario.

### Controlador
Este paquete actuara como el intermediario entre el paquete Modelo y vista, contendra todas las funciones que interactuen con el paquete model para asi actualizar la vista. El ControladorVentas debería manejar las acciones de la VentanaVentas y actualizar el modelo Venta.

### Servicio
Este paquete implementara la logica de negocio de la aplicacion. Los controladores podrían entonces utilizar estos métodos para realizar las operaciones correspondientes en la vista y el modelo.

### Ejemplo

Este seria un ejemplo del flujo end to end:

1. En el archivo Main.java se encuentra la función principal main() que es donde se inicia la aplicación. Desde aquí, se debe instanciar el controlador principal (ControladorPrincipal) y mostrar la vista principal (VentanaPrincipal).
~~~
public static void main(String[] args) {
    ControladorPrincipal controlador = new ControladorPrincipal();
    controlador.mostrarVentanaPrincipal();
}
~~~