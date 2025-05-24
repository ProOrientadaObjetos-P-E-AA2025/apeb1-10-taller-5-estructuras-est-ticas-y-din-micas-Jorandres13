
public class Departamento {

    private String nombre;
    private int numeroEmpleados;
    private double produccionAnual;
    private String categoria;

    public Departamento(String nombre, int numeroEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.produccionAnual = produccionAnual;
        this.categoria = determinarCategoria();
    }

    private String determinarCategoria() {
        if (numeroEmpleados > 20 && produccionAnual > 1000000) {
            return "A";
        } else if (numeroEmpleados <= 20 && produccionAnual <= 1000000) {
            return "B";
        } else if (numeroEmpleados <= 10 && produccionAnual <= 500000) {
            return "C";
        } else {
            return "Sin categoria clara";
        }
    }

    public String toString() {
        return "Departamento: " + nombre
                + "\nEmpleados: " + numeroEmpleados
                + "\nProduccion Anual: $" + produccionAnual
                + "\nCategoria: " + categoria;
    }

}
