/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4.tp.pkg3;
/**
 *
 * @author Emanuel
 */
public class ListaReproduccion {

    private int x = 0, cant = 1;
    private Cancion[] listaR;

    public ListaReproduccion() {
        this.listaR = new Cancion[this.cant];

    }

    public void insertar(Cancion nuevaCancion) {
        if (this.x == 0) {
            this.listaR[this.x] = nuevaCancion;
        } else {
            Cancion[] aux = new Cancion[this.cant];
            System.arraycopy(this.listaR, 0, aux, 0, this.x);
            aux[this.cant - 1] = nuevaCancion;
            this.listaR = aux;
        }
        this.cant++;
        this.x++;
    }

    public Cancion getCancion(int indice) {
        if (indice >= 0 && indice < this.x) {
            return this.listaR[indice];
        } else {
            return null;
        }
    }

    public void reemplazarCancion(Cancion nuevaCancion, int indice) {

        if (indice >= 0 && indice < this.x) {
            this.listaR[indice] = nuevaCancion;
        } else {
            System.out.println("Error!!! El indice no existe");
        }
    }

    public int getCantidadCanciones() {
        return this.listaR.length;
    }

    public void removerEn(int indice) {
        if (indice >= 0 && indice < this.x) {
            Cancion[] aux = new Cancion[this.cant - 2];
            this.x--;
            this.cant--;
            System.arraycopy(this.listaR, 0, aux, 0, indice);
            System.arraycopy(this.listaR, indice + 1, aux, indice, (this.x - indice));
            this.listaR = aux;
        }
    }

    public void insertarEn(Cancion nuevaCancion, int indice) {
        Cancion[] aux = new Cancion[this.cant];
        if (indice >= 0 && indice < this.x) {
            System.arraycopy(this.listaR, 0, aux, 0, indice);
            aux[indice] = nuevaCancion;
            System.arraycopy(this.listaR, indice, aux, indice + 1, (this.x - indice));
            this.listaR = aux;
        } else {
            System.arraycopy(this.listaR, 0, aux, 0, this.x);
            aux[this.x] = nuevaCancion;
            this.listaR = aux;
        }
        this.cant++;
        this.x++;
    }

    public int encontrarIndice(Cancion cancionRequerida) {
        int i = 0;
        while ((i < this.x) && (this.listaR[i] != cancionRequerida)) {
            i++;
        }
        if ((i < this.x)) {
            return i;
        } else {
            return -1;
        }
    }

    public boolean contiene(Cancion cancionRequerida) {
        boolean k = false;
            final Cancion other = (Cancion) cancionRequerida;
            for (int i = 0; i < this.x; i++) {
                if (this.listaR[i].equals(other)) {
                    k = true;
                }
            }
        return k;
    }

    @Override
    public String toString() {
        String lista = "";
        for (int i = 0; i < this.x; i++) {
            lista = lista + " [" + this.listaR[i].toString() + "]";
        }
        return lista;
    }

}
