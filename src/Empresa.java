/*
 * Programadores:
 * Juan Pablo Pasos Silva - 225200994
 */
public class Empresa {
    private Empleado[] empleados;

    public Empresa(int capacidad) {
        this.empleados = new Empleado[capacidad];
    }
    public boolean agregarEmpleado(Empleado empleado) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] == null) {
                empleados[i] = empleado;
                return true;
            }
        }
        return false;
    }


    public void mostrarEmpleados() {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {
                empleados[i].mostrarInformacion();
                System.out.println("Tipo: " + empleados[i].getTipoEmpleado());
                System.out.println("Salario calculado: $" + empleados[i].calcularSalario());
                System.out.println("-----------------------------------");
            }
        }
    }

    public double calcularNomina() {
        double nominaTotal = 0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {
                nominaTotal += empleados[i].calcularSalario();
            }
        }
        return nominaTotal;
    }

    public Empleado buscarEmpleado(int id) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null && empleados[i].getId() == id) {
                return empleados[i];
            }
        }
        return null;
    }
    public int contarBonificables() {
        int contador = 0;
        for (Empleado empleado : empleados) {
            if (empleado instanceof Bonificable) {
                contador++;
            }
        }
        return contador;
    }
}
