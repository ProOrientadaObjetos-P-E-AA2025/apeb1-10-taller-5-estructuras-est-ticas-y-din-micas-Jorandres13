
import java.util.Scanner;

public class Problema3_SistemaDepartamentos {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Ingrese los datos de la empresa:");
        System.out.print("Nombre: ");
        String nombre = tcl.nextLine();

        System.out.print("RUC: ");
        String ruc = tcl.nextLine();

        System.out.print("Direccion: ");
        String direccion = tcl.nextLine();

        Empresa empresa = new Empresa(nombre, ruc, direccion);

        System.out.print("Cuantos departamentos desea registrar? ");
        int cantidad = tcl.nextInt();
        tcl.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nDepartamento #" + (i + 1));
            System.out.print("Nombre: ");
            String nombreDpto = tcl.nextLine();

            System.out.print("Numero de empleados: ");
            int empleados = tcl.nextInt();

            System.out.print("Produccion anual: ");
            double produccion = tcl.nextDouble();
            tcl.nextLine();

            Departamento dpto = new Departamento(nombreDpto, empleados, produccion);
            empresa.agregarDepartamento(dpto);
        }

        System.out.println("\n--- RESULTADO ---");
        empresa.mostrarDepartamentos();
    }
}
