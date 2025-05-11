package actividad4safa;

/**
 * Clase que representa una mercancía peligrosa transportada internacionalmente.
 */
public class MercanciasPeligrosas {
    private String tipo;
    private String origen;
    private String destino;
    private boolean requiereTransbordo;

    public MercanciasPeligrosas(String tipo, String origen, String destino, boolean requiereTransbordo) {
        this.tipo = tipo;
        this.origen = origen;
        this.destino = destino;
        this.requiereTransbordo = requiereTransbordo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public boolean isRequiereTransbordo() {
        return requiereTransbordo;
    }

    public void setRequiereTransbordo(boolean requiereTransbordo) {
        this.requiereTransbordo = requiereTransbordo;
    }

    /**
     * Muestra la información de la mercancía.
     */
    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Requiere Transbordo: " + (requiereTransbordo ? "Sí" : "No"));
    }
}
