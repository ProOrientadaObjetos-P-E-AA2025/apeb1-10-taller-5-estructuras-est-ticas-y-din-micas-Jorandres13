
public class Materia {

    private String nombre;
    private double acd; 
    private double ape; 
    private double aa;  

    public Materia(String nombre, double acd, double ape, double aa) {
        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public double obtenerPuntajeTotal() {
        return acd + ape + aa;
    }

    public double calcularPorcentaje() {
        return (obtenerPuntajeTotal() / 10.0) * 100.0;
    }

    public String getNombre() {
        return nombre;
    }

    public double get60Porciento() {
        return obtenerPuntajeTotal();
    }
}
