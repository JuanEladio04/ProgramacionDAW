package Capitulo04.Bloque03;

import utils.Utils;

//2º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Inserción directa", con el objetivo de ordenar el array completamente. Puedes consultar el siguiente enlace http://lwh.free.fr/pages/algo/tri/tri_insertion_es.html

public class Ejercicio02_ArrayOrdenInsercionDirecta {

    public static void main(String[] args) {
        int secuencia[] = Utils.creaArrayNumerosAzar(150, 1000, 0), save;
        boolean ordenado = false;

        System.out.println("La secuencia es: ");
        Utils.mostrarArray(secuencia);
        
        System.out.println("Secuencia ordenada en inserción directa: ");
        
        do {
            ordenado = false;
            for (int i = 1; i < secuencia.length; i++) {
                if (secuencia [i] < secuencia [i - 1]) {
                    for (int j = i; j != 0; j--) {
                        save = secuencia [j - 1];
                        secuencia [j - 1] = secuencia [j];
                        secuencia [j] = save;
                    }
                    ordenado = true;
                }
            }
        }while(ordenado == true);
         
        Utils.mostrarArray(secuencia);
        
    }

}
