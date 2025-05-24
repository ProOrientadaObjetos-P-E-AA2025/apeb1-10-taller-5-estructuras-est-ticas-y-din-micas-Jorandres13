
import java.util.Scanner;


public class Estudiante {
    Scanner tcl = new Scanner (System.in);

    private String nombre;
    private int edad;
    private Materia materia;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void asignarMateria(Materia materia) {
        this.materia = materia;
    }

    public void verificarAprobacion() {
        if (materia == null) {
            System.out.println("El estudiante no tiene una materia asignada.");
            return;
        }

        double porcentaje = materia.calcularPorcentaje();
        System.out.println("Evaluando al estudiante: " + nombre);
        System.out.println("Materia: " + materia.getNombre());
        System.out.printf("Puntaje total: %.2f (%.2f%%)%n", materia.obtenerPuntajeTotal(), porcentaje);

        if (porcentaje >= 70.0) {
            System.out.println("Resultado: Aprobado ");
        } else {
            System.out.println("Resultado: Reprobado ");
            System.out.println("Debe rendir un examen de recuperacion (3.5 pts).");
            System.out.print("Ingrese la calificacion del examen de recuperacion: ");
            double recuperacion = tcl.nextDouble();
            double nuevaNota = materia.get60Porciento() + recuperacion;
            double nuevoPorcentaje = (nuevaNota / 10.0) * 100.0;

            System.out.printf("Nuevo total: %.2f (%.2f%%)%n", nuevaNota, nuevoPorcentaje);
            if (nuevoPorcentaje >= 70.0) {
                System.out.println("Aprobado despues de recuperacion ");
            } else {
                System.out.println("Reprobado incluso con recuperación ");
            }
        }
    }
}
