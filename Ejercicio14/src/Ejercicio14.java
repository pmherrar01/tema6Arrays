import java.util.Scanner;

public class Ejercicio14 {

	final static int FIL = 4;
	final static int COL = 7;

	public static int pedirTemperatura() {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Introduce una temperatura:");
		num = entrada.nextInt();
		return num;
	}

	public static void rellenarMes(int aMes[][]) {
		int temperatura;
		for(int i = 0;i<aMes.length;i++) {
			for(int j = 0; j<aMes[i].length;j++) {
				temperatura = pedirTemperatura();
				aMes[i][j]=temperatura;
			}
		}
	}

	public static void mostrarTemperaturas(int aMes[][]) {
		for (int i = 0; i<aMes.length;i++) {
			System.out.println();
			for(int j = 0;j<aMes[i].length;j++) {
				System.out.print("	{" + aMes[i][j] + "}");
			}
		}
	}

	public static void temperaturaMedia(int aMes[][]) {
		int suma=0;
		float media;
		for(int i = 0; i < aMes.length;i++) {
			for(int j = 0; j< aMes[i].length;j++) {
				suma=suma+aMes[i][j];
			}
		}
		media= (suma/(aMes[0].length*aMes.length));
		System.out.println("\n" + "La media de las temperaturas es de: " + media);
	} 

	public static void diaCaluroso(int aMes[][]) {
		int caluroso=0;
		for (int i = 0; i<aMes.length;i++) {
			System.out.println();
			for(int j = 0;j<aMes[i].length;j++) {
				if(caluroso<=aMes[i][j]) {
					caluroso=aMes[i][j];
				};
			}
		}
		System.out.println("El dia mas caluroso a hecho: " + caluroso);
	}

	public static void menu() {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.print("Rellenar las temperaturas.");	
		System.out.print("Rellenar las temperaturas.");
		System.out.print("Rellenar las temperaturas.");
		System.out.print("Dia o dias mas calurosos.");
		System.out.print("Salir del programa.");
	}

	public static void main(String[] args) {
		int [][]aMes = new int [FIL][COL];
		String []vDias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		rellenarMes(aMes);
		mostrarTemperaturas(aMes);
		temperaturaMedia(aMes);
		diaCaluroso(aMes);
	}

}
