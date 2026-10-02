/*
 * Programadores:
 * Juan Pablo Pasos Silva - 225200994
 */
public class EmpleadoTiempoCompleto extends Empleado implements Bonificable {
    private double bonificacion;

    public EmpleadoTiempoCompleto(int id, String nombre, double salarioBase, double bonificacion) {
        super(id, nombre, salarioBase);
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonificacion;
    }

    @Override
    public double calcularBonificacion() {
        return bonificacion;
    }

    public double getBonificacion() { return bonificacion; }
    public void setBonificacion(double bonificacion) { this.bonificacion = bonificacion; }
}
