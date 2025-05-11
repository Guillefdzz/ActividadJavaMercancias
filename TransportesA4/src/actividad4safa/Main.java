package actividad4safa;

public class Main {
    public static void main(String[] args) {
        // Creación de objetos de mercancía
        MercanciasPeligrosas mercancia1 = new MercanciasPeligrosas("Químicos", "España", "Alemania", true);
        MercanciasPeligrosas mercancia2 = new MercanciasPeligrosas("Explosivos", "Francia", "Italia", false);
        MercanciasPeligrosas mercancia3 = new MercanciasPeligrosas("Gases", "España", "España", true);

        // Mostrar información de las mercancías
        impresionInformacion("Información de la primera mercancía:", mercancia1);
        impresionInformacion("\nInformación de la segunda mercancía:", mercancia2);
        impresionInformacion("\nInformación de la tercera mercancía:", mercancia3);

        // Modificación de la mercancía
        mercancia1.setDestino("Reino Unido");
        mercancia1.setRequiereTransbordo(false);

        System.out.println("\nInformación actualizada de la primera mercancía:");
        mercancia1.mostrarInformacion();
        System.out.println("¿Es un envío nacional? " + (mercancia1.esNacional() ? "Sí" : "No"));
    }

    /**
     * Método que imprime el título y la información de una mercancía.
     *
     * @param titulo Texto descriptivo que se muestra antes de los datos
     * @param mercancia Objeto de tipo MercanciasPeligrosas
     */
    public static void impresionInformacion(String titulo, MercanciasPeligrosas mercancia) {
        System.out.println(titulo);
        mercancia.mostrarInformacion();
        System.out.println("¿Es un envío nacional? " + (mercancia.esNacional() ? "Sí" : "No"));
    }
}
