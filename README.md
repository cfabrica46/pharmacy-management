# Farmacy Management

## Arquitectura
Se Propone usar el patron de diseño/arquitectura Modelo Vista Controlador (MVC), esto con el fin de preservar la legibilidad, integridad y escalabilidad de nuestro proyecto
~~~
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
~~~
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

1. En el archivo **Main.java** se encuentra la función principal **main()** que es donde se inicia la aplicación. Desde aquí, se debe instanciar el controlador principal **(ControladorPrincipal)** y mostrar la vista principal **(VentanaPrincipal)**.
~~~
public static void main(String[] args) {
    ControladorPrincipal controlador = new ControladorPrincipal();
    controlador.mostrarVentanaPrincipal();
}
~~~

2. La **VentanaPrincipal** es la vista principal de la aplicación y desde aquí se pueden acceder a las diferentes funcionalidades de la aplicación. Una de ellas podría ser la búsqueda de un cliente por DNI. Desde la **VentanaPrincipal** se debe invocar al controlador correspondiente para esta funcionalidad, que en este caso es el ControladorClientes.
~~~
public void buscarClientePorDni(String dni) {
    ControladorClientes controladorClientes = new ControladorClientes();
    controladorClientes.buscarClientePorDni(dni);
}
~~~

3. El **ControladorClientes** es el encargado de manejar las solicitudes relacionadas con los clientes. En este caso, debe recibir el DNI del cliente a buscar y delegar la tarea al servicio correspondiente **(ServicioClientes)**.
~~~
public void buscarClientePorDni(String dni) {
    ServicioClientes servicioClientes = new ServicioClientes();
    Cliente cliente = servicioClientes.buscarPorDni(dni);
    VentanaClientes ventanaClientes = new VentanaClientes();
    ventanaClientes.mostrarClienteEncontrado(cliente);
}
~~~

4. El **ServicioClientes** es el componente encargado de interactuar con la capa de modelo **(modelo)** para realizar operaciones sobre la entidad **Cliente**. En este caso, debe realizar la búsqueda del cliente por su DNI.
~~~
public Cliente buscarPorDni(String dni) {
    Cliente clienteEncontrado = null;
    for (Cliente cliente : listaClientes) {
        if (cliente.getDni().equals(dni)) {
            clienteEncontrado = cliente;
            break;
        }
    }
    return clienteEncontrado;
}
~~~

5. La capa de modelo **(modelo)** es la encargada de contener las entidades y la lógica de negocio de la aplicación. En este caso, la entidad **Cliente** debe tener los métodos **getDni()** y **setDni()**, así como otros métodos necesarios para interactuar con los datos del cliente. Además, la clase **ServicioClientes** debe tener acceso a los datos de la lista de clientes para poder realizar la búsqueda.

Este sería un ejemplo básico de cómo se puede utilizar el patrón MVC para obtener un cliente por su DNI. Por supuesto, esto puede variar dependiendo de la complejidad de la aplicación y de las funcionalidades que se quieran implementar.