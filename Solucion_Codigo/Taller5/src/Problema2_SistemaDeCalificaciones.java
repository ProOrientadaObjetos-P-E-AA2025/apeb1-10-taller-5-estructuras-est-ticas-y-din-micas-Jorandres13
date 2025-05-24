
import java.util.ArrayList;
import java.util.Scanner;

public class Problema2_SistemaDeCalificaciones {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        // Datos del estudiante
        System.out.print("Nombre del estudiante: ");
        String nombreEst = tcl.nextLine();

        System.out.print("Edad del estudiante: ");
        int edad = tcl.nextInt();
        tcl.nextLine();

        Estudiante estudiante = new Estudiante(nombreEst, edad);

        System.out.print("Nombre de la materia: ");
        String nombreMateria = tcl.nextLine();

        System.out.print("Calificacion ACD (max 3.5): ");
        double acd = tcl.nextDouble();

        System.out.print("Calificacion APE (max 3.5): ");
        double ape = tcl.nextDouble();

        System.out.print("Calificacion AA (max 3.0): ");
        double aa = tcl.nextDouble();

        Materia materia = new Materia(nombreMateria, acd, ape, aa);
        estudiante.asignarMateria(materia);

        estudiante.verificarAprobacion();
    }
}
