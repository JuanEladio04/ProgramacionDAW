package Utils;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Utils {

    public static void main(String[] args) {

    }

    //CosasVarias-------------------------------------------------------------------------------------------------

    
/**
 * 
 * @return
 */
    public static int obtenerNumeroAzar () {
        return (int) Math.round(Math.random() * 100);
   }
    
/**
 * 
 * @param max
 * @param min
 * @return
 */
    
    public static int obtenerNumeroAzar (int max, int min) {
        return (int) Math.round(Math.random() * (max - min) + min);
   }

    //jOptionPane-------------------------------------------------------------------------------------------------

    
/**
 *     
 * @return
 */
    public static int pideNumeroJOptionPane () {
        String str = JOptionPane.showInputDialog("Introduce un número");
        return  Integer.parseInt(str);
    }
    
/**
 *     
 * @param mensaje
 * @return
 */
    public static int pideNumeroJOptionPane (String mensaje) {
        String str = JOptionPane.showInputDialog(mensaje);
        return  Integer.parseInt(str);
    }
    
    /**
     * 
     * @param limSup
     * @param limInf
     */
    
    public static void mensajeUsuarioLimites(int limSup, int limInf) {
    	System.out.println("Introduce un numero entre " + limSup + " y " + limInf);
	}
    
    /**
     * 
     * @param limSup
     * @param limInf
     * @return
     */
    
    public static int pedirNumeroEntreLimites(int limSup, int limInf, String mensaje) {	
    	boolean dentroLimites;	
    	int valor = 0;
    	do {
    		try {
    			dentroLimites = true;
    			valor = Utils.pideNumeroJOptionPane(mensaje);
    			
    			if (valor > limSup || valor < limInf) {
    				dentroLimites = false;
        			  Utils.mensajeUsuarioLimites(limSup, limInf);
    			}
    		}
    		  catch (Exception e) {
    			  Utils.mensajeUsuarioLimites(limSup, limInf);
    			  dentroLimites = false;
    		  }
		}while (!dentroLimites);
    	
    	return valor;
    }

			
			

   
    //Scanner-------------------------------------------------------------------------------------------------
    
/**
 *     
 * @return
 */
  public static int pideNumeroScanner () {
      System.out.println("Introduce un número");
      Scanner sc = new Scanner (System.in);
      return sc.nextInt();
  }
  
/**
 *   
 * @param mensaje
 * @return
 */
  public static int pideNumeroScanner (String mensaje) {
      System.out.println(mensaje);
      Scanner sc = new Scanner (System.in);
      return sc.nextInt();
  }
  
  //Arrays-------------------------------------------------------------------------------------------------

/**
 * 
 * @param longitud
 * @param limInf
 * @param limSup
 * @return
 */
	public static int[] creaArrayNumerosAzar (int longitud, int limInf, int limSup) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limInf, limSup);
		}
		return array;
	}
  
  /**
   * 
   * @param longitud
   * @param max
   * @param min
   * @return
   */
  public static float[] getArrayWithDecimals (int longitud, int max, int min) {
      float array[] = new float[longitud];
      for (int i = 0; i < array.length; i++) {
          array[i] = (float) Math.random();
      }
      return array;
  } 
  
  /**
   * 
   * @param array
   */
  
  public static void mostrarArray (int[] array) {
      for (int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");
      }
      System.out.println();
  }
  
  /**
   * 
   * @param array
   */
	public static void showArrayWithDecimals(float array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
  
  /**
   * 
   * @param array
   * @return
   */
  
  public static int sumaArray (int array[]) {
      int suma = 0;
      for (int i = 0; i < array.length; i++) {
        suma += array[i];
    }
      return suma;
  }
  
  /**
   * 
   * @param array
   * @return
   */
  
  public static float mediaArray (int array[]) {
      return sumaArray (array) / (float) array.length;
  }
  
  /**
   * 
   * @param array
   * @return
   */
  
  public static int mayorArray (int array[]) {
      int mayor = array[0];
      for (int i = 0; i < array.length; i++) {
        if (array[i] > mayor) {
            mayor = array[i];
        }
    }
    return mayor;
  }
  
  /**
   * 
   * @param array
   * @return
   */
  
  public static int menorArray (int array[]) {
      int menor = array[0];
      for (int i = 0; i < array.length; i++) {
        if (array[i] < menor) {
            menor = array[i];
        }
    }
    return menor;
  }
  


}
