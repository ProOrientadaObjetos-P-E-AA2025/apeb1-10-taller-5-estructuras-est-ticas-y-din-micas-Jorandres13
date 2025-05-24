
public class Problema5_ONU {
    public static void main(String[] args) {
        ConflictoInternacional conflicto = new ConflictoInternacional("Conflicto X", "2023-05-01");

        conflicto.agregarPais("País A");
        conflicto.agregarPais("País B");
        conflicto.agregarPais("País C");

        EventoConflicto evento1 = new EventoConflicto("Batalla Central", "2023-06-01", "Zona A", "batalla", "Batalla importante", 60);
        EventoConflicto evento2 = new EventoConflicto("Tratado de Paz", "2023-07-10", "Capital B", "tratado", "Tratado firmado", 0);

        conflicto.agregarEvento(evento1);
        conflicto.agregarEvento(evento2);

        conflicto.evaluarConflicto();
        conflicto.mostrarResumen();
    }
}
    

