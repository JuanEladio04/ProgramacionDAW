package Utils;

public class UtilsMatrices {

	public static void main(String[] args) {

	}
	
/**
 * 	
 * @param filas
 * @param columnas
 * @param valorInicial
 * @return
 */
	public static int [][] CreaMatriz(int filas, int columnas, int valorInicial) {
		int matriz [] [] = new int[filas] [columnas];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz [i][j] = valorInicial;
			}
		} 
		return matriz;
	}
	
	/**
	 * 
	 * @param matriz
	 */
	
	public static void muestraMatriz(int matriz [][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
