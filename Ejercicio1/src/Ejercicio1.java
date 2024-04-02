import java.util.Scanner;

public class Ejercicio1 {

	public static void pedirNumero(int vNum[]) {
		Scanner entrada = new Scanner(System.in);
		int num=0;
        for (int i = 0;i < vNum.length;i++){
            System.out.print("Posición "+i+": ");
            vNum[i] = entrada.nextInt();
        }
	}
	
	public static void mostrarPares(int vNum[]) {
		for(int i = 0; i<vNum.length; i++) {
			if  ((vNum[i] % 2) == 0){
                System.out.println("["+vNum[i]+"]");
            }
		}
	}
	
	public static void main(String[] args) {
		int[] vNum = new int [10];
		pedirNumero(vNum);
		mostrarPares(vNum);

	}

}
