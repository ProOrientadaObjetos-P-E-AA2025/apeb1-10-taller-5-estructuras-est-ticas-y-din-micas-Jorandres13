
import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private String ruc;
    private String direccion;
    private ArrayList<Departamento> departamentos;

    public Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento dpto) {
        departamentos.add(dpto);
    }

    public void mostrarDepartamentos() {
        System.out.println("Empresa: " + nombre);
        System.out.println("RUC: " + ruc);
        System.out.println("Direccion: " + direccion);
        System.out.println("Departamentos:");
        for (Departamento d : departamentos) {
            System.out.println("----------------------------");
            System.out.println(d);
        }
    }
}
