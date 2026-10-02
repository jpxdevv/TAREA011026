public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa(5);

        Empleado empleado1 =
                new EmpleadoTiempoCompleto(
                        101,
                        "Ana",
                        15000,
                        2000
                );

        Empleado empleado2 =
                new EmpleadoPorHoras(
                        102,
                        "Carlos",
                        0,
                        80,
                        150
                );

        Empleado empleado3 =
                new EmpleadoComision(
                        103,
                        "Laura",
                        10000,
                        50000,
                        0.05
                );

        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);

        System.out.println("=== EMPLEADOS ===");

        empresa.mostrarEmpleados();

        System.out.println();
        System.out.println("=== NOMINA ===");

        double nomina = empresa.calcularNomina();

        System.out.println("Nomina total: $" + nomina);

        System.out.println();
        System.out.println("=== BUSQUEDA ===");

        Empleado encontrado = empresa.buscarEmpleado(102);

        if (encontrado != null) {
            encontrado.mostrarInformacion();
        }
        else {
            System.out.println("Empleado no encontrado.");
        }

        System.out.println();
        System.out.println("=== BONIFICABLES ===");

        int cantidad = empresa.contarBonificables();

        System.out.println(
                "Cantidad de empleados bonificables: "
                        + cantidad
        );
    }
}