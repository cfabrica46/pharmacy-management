package modelo.personas;

public class Empleado extends Persona {
    private double salario;
    private String cargo;

    public Empleado(String nombre, String dni, double salario, String cargo) {
        super(nombre, dni);
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
