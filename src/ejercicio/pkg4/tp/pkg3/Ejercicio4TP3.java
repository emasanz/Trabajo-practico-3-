
package ejercicio.pkg4.tp.pkg3;

/**
 *
 * @author Emanuel
 */
public class Ejercicio4TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaReproduccion lista = new ListaReproduccion();

// Creamos 10 canciones en la lista
        Cancion cancion1 = new Cancion("Cancion 1", "Autor 1");
        Cancion cancion2 = new Cancion("Cancion 2", "Autor 2");
        Cancion cancion3 = new Cancion("Cancion 3", "Autor 3");
        Cancion cancion4 = new Cancion("Cancion 4", "Autor 4");
        Cancion cancion5 = new Cancion("Cancion 5", "Autor 5");
        Cancion cancion6 = new Cancion("Cancion 6", "Autor 6");
        Cancion cancion7 = new Cancion("Cancion 7", "Autor 7");
        Cancion cancion8 = new Cancion("Cancion 8", "Autor 8");
        Cancion cancion9 = new Cancion("Cancion 9", "Autor 9");
        Cancion cancion10 = new Cancion("Cancion 10", "Autor 10");

        System.out.println("Insertando canciones...");
        lista.insertar(cancion1);
        lista.insertar(cancion2);
        lista.insertar(cancion3);
        lista.insertar(cancion4);
        lista.insertar(cancion5);
        lista.insertar(cancion6);
        System.out.println(lista);

        System.out.println("La primer canción es " + lista.getCancion(0));
        System.out.println("La canción en el índice -1 es " + lista.getCancion(-1));
        System.out.println("La canción en el índice 6 es " + lista.getCancion(6));

        // Imprimir la última cancion sin usar un literal entero
        System.out.println("La última canción es " + lista.getCancion(lista.getCantidadCanciones() - 1));
        System.out.println();

        System.out.println("Reemplazar la canción en el índice 2 por " + cancion7);
        lista.reemplazarCancion(cancion7, 2);
        System.out.println(lista);

        System.out.println("Reemplazar la canción en el índice -1 por " + cancion3);
        lista.reemplazarCancion(cancion3, -1);
        System.out.println(lista);

        System.out.println("Reemplazar la canción en el índice 5 por " + cancion3);
        lista.reemplazarCancion(cancion3, 5);
        System.out.println(lista);

        System.out.println("Reemplazar la canción en el índice 6 por " + cancion3);
        lista.reemplazarCancion(cancion3, 6);
        System.out.println(lista);

        System.out.println("Insertar en el índice 6 " + cancion6);
        lista.insertarEn(cancion6, 6);
        System.out.println(lista);

        System.out.println("Insertar en el índice 2 " + cancion8);
        lista.insertarEn(cancion8, 2);
        System.out.println(lista);

        System.out.println("Insertar en el índice -1 " + cancion7);
        lista.insertarEn(cancion7, -1);
        System.out.println(lista);

        System.out.println("Insertar en el índice 0 " + cancion7);
        lista.insertarEn(cancion7, 0);
        System.out.println(lista);

        System.out.println("Insertar en el índice 12 " + cancion9);
        lista.insertarEn(cancion9, 12);
        System.out.println(lista);

        System.out.println("Insertar en el índice 0 " + cancion10);
        lista.insertarEn(cancion10, 0);
        System.out.println(lista);

        System.out.println("Remover la última canción");
        lista.removerEn(lista.getCantidadCanciones() - 1);
        System.out.println(lista);

        System.out.println("Remover en el índice 3");
        lista.removerEn(3);
        System.out.println(lista);

        System.out.println("Remover la primer canción");
        lista.removerEn(0);
        System.out.println(lista);

        System.out.println("Remover " + cancion3);
        int indice = lista.encontrarIndice(cancion3);
        if (indice > 0) {
            lista.removerEn(indice);
        }
        System.out.println(lista);

        System.out.println("Remover " + cancion2);
        indice = lista.encontrarIndice(cancion2);
        if (indice > 0) {
            lista.removerEn(indice);
        }
        System.out.println(lista);

        System.out.println("Remover " + cancion2);
        indice = lista.encontrarIndice(cancion2);
        lista.removerEn(indice);
        System.out.println(lista);

        if (lista.contiene(cancion7)) {
            System.out.println("Remover " + cancion7);
            lista.removerEn(lista.encontrarIndice(cancion7));
            System.out.println(lista);
        }

        if (lista.contiene(cancion7)) {
            System.out.println("Remover " + cancion7);
            lista.removerEn(lista.encontrarIndice(cancion7));
            System.out.println(lista);
        }

        if (lista.contiene(cancion3)) {
            System.out.println("Remover " + cancion3);
            lista.removerEn(lista.encontrarIndice(cancion3));
            System.out.println(lista);
        }
    }
}