
public class ConflictoInternacional {
    String nombre;
    String fechaInicio;
    String estado;
    String[] paises;
    EventoConflicto[] eventos; 
    int cantidadPaises;
    int cantidadEventos;

    public ConflictoInternacional(String nombre, String fechaInicio) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.estado = "Activo";
        this.paises = new String[10];
        this.eventos = new EventoConflicto[10];
        this.cantidadPaises = 0;
        this.cantidadEventos = 0;
    }

    public void agregarPais(String pais) {
        if (cantidadPaises < 10) {
            paises[cantidadPaises++] = pais;
        }
    }

    public void agregarEvento(EventoConflicto evento) {
        if (cantidadEventos < 10) {
            eventos[cantidadEventos++] = evento;
        }
    }

    public void evaluarConflicto() {
        int batallas = 0;
        int bajasAltas = 0;
        for (int i = 0; i < cantidadEventos; i++) {
            EventoConflicto e = eventos[i];
            if (e.tipo.equals("batalla")) {
                batallas++;
            }
            if (e.bajas >= 50) {
                bajasAltas++;
            }
        }

        if (batallas > (cantidadPaises / 2)) {
            estado = "Guerra Mundial";
        } else if (bajasAltas > 0) {
            estado = "Urgente";
        }
    }

    public void mostrarResumen() {
        System.out.println("Conflicto: " + nombre);
        System.out.println("Estado: " + estado);
        System.out.println("Paises involucrados:");
        for (int i = 0; i < cantidadPaises; i++) {
            System.out.println("- " + paises[i]);
        }

        System.out.println("Eventos:");
        for (int i = 0; i < cantidadEventos; i++) {
            System.out.println("- " + eventos[i].nombre + " (" + eventos[i].tipo + ")");
        }
    }
}

