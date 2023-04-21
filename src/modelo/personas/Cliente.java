package modelo.personas;

public class Cliente extends Persona {
    private String telefono;

    public Cliente(String nombre, String dni, String telefono) {
        super(nombre,dni);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }   
}
