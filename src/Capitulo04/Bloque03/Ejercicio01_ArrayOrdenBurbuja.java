package Capitulo04.Bloque03;


//1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Burbuja", con el objetivo de ordenar el array completamente. Puedes consultar el siguiente enlace http://lwh.free.fr/pages/algo/tri/tri_bulle_es.html

public class Ejercicio01_ArrayOrdenBurbuja {

    public static void main(String[] args) {
       int secuencia[] = Utils.creaArrayNumerosAzar(150, 1000, 0), save;
       boolean ordenado = false;
       
       System.out.println("La secuencia es: ");
       Utils.mostrarArray(secuencia);
       
       System.out.println("Secuencia ordenada en Burbuja: ");
       
       do {
           ordenado = false;
           for (int i = 0; i < secuencia.length - 1; i++) {
               if (secuencia [i + 1] < secuencia [i]) {
                   save = secuencia [i];
                   secuencia [i] = secuencia [i + 1];
                   secuencia [i + 1] = save;
                   ordenado = true;
               }
           }
       } while (ordenado == true);
        
       Utils.mostrarArray(secuencia);
    }

}
