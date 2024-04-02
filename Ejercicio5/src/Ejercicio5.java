import java.util.Scanner;

public class Ejercicio5 {

	final static int FIL = 4;
	final static int COL = 2;

	public static int pedirNumeros() {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("introduce un numero: ");	
		num = entrada.nextInt();
		return num;

	}

	public static void rellenarMatric(int aNum[][]) {
		for(int i = 0;i<aNum.length;i++) {
			for(int j = 0; j<aNum[i].length;j++) {
				aNum[i][j]=pedirNumeros();
			}
		}
	}

	public static void mostrarMatric(int aNum[][]) {
		for(int i = 0; i < aNum.length;i++) {
			for(int j = 0; j< aNum[i].length;j++) {
				System.out.println("[" + (i+1) +"]"+ "["+(j+1) + "]-->" + aNum[i][j]);
			}
		}
	}


	public static void main(String[] args) {
		int [][]aNum = new int [FIL][COL];
		rellenarMatric(aNum);
		mostrarMatric(aNum);

	}

}
