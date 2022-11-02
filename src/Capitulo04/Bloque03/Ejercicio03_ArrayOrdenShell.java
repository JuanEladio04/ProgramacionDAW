package Capitulo04.Bloque03;

import Utils.Utils;

//3º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Shell", con el objetivo de ordenar el array completamente. Puedes consultar el siguiente enlace http://lwh.free.fr/pages/algo/tri/tri_shell_es.html

public class Ejercicio03_ArrayOrdenShell {

    public static void main(String[] args) {
        int vector[] = Utils.creaArrayNumerosAzar(150, 1000, 0), save, secuencia;
        boolean ordenado = false;
                        
        System.out.println("La secuencia es: ");
        Utils.mostrarArray(vector);
        
        System.out.println("Secuencia ordenada en Shell: ");
        
        for (secuencia = vector.length / 2; secuencia != 0; secuencia /= 2) {
            ordenado = true;
            while (ordenado == true) {                                     
                ordenado = false;
                for (int i = secuencia; i < vector.length; i++) {
                    if (vector[i - secuencia] > vector[i]) {     
                        save = vector[i];                  
                        vector[i] = vector[i - secuencia];
                        vector[i - secuencia] = save;
                        ordenado = true;                                             
                    }
                }
            }
        }
         
        Utils.mostrarArray(vector);
        
    }

}
