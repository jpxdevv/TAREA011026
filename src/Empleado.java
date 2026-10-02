public abstract class Empleado {
    private int id;
    private String nombre;
    private double salarioBase;

    public Empleado(int id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }


    public abstract double calcularSalario();

    public void mostrarInformacion() {
        System.out.println("ID: " + id + " Nombre: " + nombre + " Salario base: $" + salarioBase);
    }

    public String getTipoEmpleado() {
        return this.getClass().getSimpleName();
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
}
