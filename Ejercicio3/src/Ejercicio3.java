import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {

	public static int pedirLongitud() {
		Scanner entrada = new Scanner(System.in);
		int num=0;
		do {
			try {
				System.out.println("Introduce la longitud del vector:");
				num=entrada.nextInt();

				if((num<1)||(num>10)) {
					System.out.println("Error el numero tiene que estar entre 1 y el 10");
				}
			}catch(InputMismatchException e){
				System.out.println("Error: Debes introducir un número entero válido no una letra.");
				entrada.nextLine();
			}
		}while((num<1)||(num>10));
		System.out.println("El vector tiene una longitud de: " + num);
		return num;
	}
	
	public static void rellenarVector(int vNum[]) {
		Random random = new Random();
		for(int i = 0; i<vNum.length;i++) {
			vNum[i]=random.nextInt(6) + 1;
		}
	}
	
	public static void mostrarVector(int vNum[]) {
		for(int i = 0; i<vNum.length;i++) {
			System.out.println("El valor guardado en la posicion " + i + " es de: "+ vNum[i]);
		}
	}

	public static void main(String[] args) {
		int []vNum = new int[pedirLongitud()];
		rellenarVector(vNum);
		mostrarVector(vNum);

	}

}
