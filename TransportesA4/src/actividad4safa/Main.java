package actividad4safa;

public class Main {
    public static void main(String[] args) {
        // Creación de objetos de mercancía
        MercanciasPeligrosas mercancia1 = new MercanciasPeligrosas("Químicos", "España", "Alemania", true);
        MercanciasPeligrosas mercancia2 = new MercanciasPeligrosas("Explosivos", "Francia", "Italia", false);

        // Mostrar información de las mercancías
        impresionInformacion("Información de la primera mercancía:", mercancia1);
        impresionInformacion("\nInformación de la segunda mercancía:", mercancia2);

        // Modificación de la mercancía
        mercancia1.setDestino("Reino Unido");
        mercancia1.setRequiereTransbordo(false);

        System.out.println("\nInformación actualizada de la primera mercancía:");
        mercancia1.mostrarInformacion();
    }

    public static void impresionInformacion(String titulo, MercanciasPeligrosas mercancia) {
        System.out.println(titulo);
        mercancia.mostrarInformacion();
    }
}
