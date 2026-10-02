public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double pagoPorHora;
    public EmpleadoPorHoras(int id, String nombre, double salarioBase, double horasTrabajadas, double pagoPorHora) {
        super(id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }
    @Override
    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;}

    public double getHorasTrabajadas (){ return horasTrabajadas;}
    public void setHorasTrabajadas(double horasTrabajadas){this.horasTrabajadas = horasTrabajadas;}
    public double getPagoPorHora(){return pagoPorHora;}
    public void setPagoPorHora (double pagoPorHora){this.pagoPorHora = pagoPorHora;}



}
