
public class CasoCorrupcion {

    String nombre;
    int diasDesdeInicio;
    String estado;
    Persona[] personas; 
    int cantidadPersonas;

    public CasoCorrupcion(String nombre, int diasDesdeInicio) {
        this.nombre = nombre;
        this.diasDesdeInicio = diasDesdeInicio;
        this.estado = "Iniciado";
        this.personas = new Persona[10];
        this.cantidadPersonas = 0;
    }

    public void agregarPersona(Persona p) {
        if (cantidadPersonas < 10) {
            personas[cantidadPersonas] = p;
            cantidadPersonas++;
        }
    }

    public void actualizarEstado() {
        if (diasDesdeInicio > 14) {
            estado = "Urgente";
        } else if (diasDesdeInicio > 7) {
            estado = "Alerta";
        }
    }

    public void mostrarPersonas() {
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("- " + personas[i].nombre + " (" + personas[i].rol + ")");
        }
    }
}

