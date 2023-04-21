package modelo;

import modelo.personas.Cliente;
import modelo.personas.Empleado;
import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    private String nombre;
    private String direccion;
    private String telefono;
    private final List<Empleado> empleados;
    private final List<Producto> productos;
    private final List<Cliente> clientes;

    public Farmacia(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.empleados = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void realizarVenta(Cliente cliente, List<Producto> productos) {
        /*double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        Venta venta = new Venta(cliente, productos, total);
        // Aquí se podría guardar la venta en algún tipo de registro o histórico.
        */
    }
}
