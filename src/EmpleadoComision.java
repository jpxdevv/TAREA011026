public class EmpleadoComision extends Empleado implements Bonificable {
    private double ventas;
    private double porcentajeComision;

    public EmpleadoComision(int id, String nombre, double salarioBase, double ventas, double porcentajeComision) {
        super(id, nombre, salarioBase);
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + calcularBonificacion();
    }

    @Override
    public double calcularBonificacion() {
        return ventas * porcentajeComision;
    }

    public double getVentas() { return ventas; }
    public void setVentas(double ventas) { this.ventas = ventas; }

    public double getPorcentajeComision() { return porcentajeComision; }
    public void setPorcentajeComision(double porcentajeComision) { this.porcentajeComision = porcentajeComision; }
}
