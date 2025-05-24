
public class Problema4_Fiscalia {

    public static void main(String[] args) {
        CasoCorrupcion caso = new CasoCorrupcion("Caso Soborno", 10);

        Persona p1 = new Persona("Carlos", 50, "Funcionario", "acusado", true);
        Persona p2 = new Persona("Lucía", 35, "Secretaria", "testigo", false);

        caso.agregarPersona(p1);
        caso.agregarPersona(p2);

        caso.actualizarEstado();

        System.out.println("Nombre del caso: " + caso.nombre);
        System.out.println("Estado del caso: " + caso.estado);
        System.out.println("Personas involucradas:");
        caso.mostrarPersonas();
    }
}

    

