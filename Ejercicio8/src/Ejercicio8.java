import java.util.Scanner;

public class Ejercicio8 {
	
	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("introduce um numero de 5 cifras:");
		num = entrada.nextInt();
		return num;
	}

    public static void rellenarVector(int vNum[], int num){
        int i, resto;
        for(i = 0;i < vNum.length;i++){
            resto = num % 10;
            vNum[i] = resto; 
            num = num / 10;
        }
    }
    
    public static void mostrarVector(int vNum[]){
        int i;
        for(i = 0;i < vNum.length;i++){
            System.out.print(vNum[i]);
        }
    }
	
	public static void main(String[] args) {
        int num = pedirNumero();
        int[] vNum = new int [5];
        rellenarVector(vNum, num);
        mostrarVector(vNum);
	}

}
