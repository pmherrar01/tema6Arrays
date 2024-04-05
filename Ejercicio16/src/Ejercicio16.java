import java. util.Scanner;

public class Ejercicio16 {

	final static int ALUM = 6;
	final static int ASIG = 4;
	final static String []vNombres = {"Pepe" + "Juan"+ "Ana" + "Marta" + "Pedro" + "Maria"};
	final static String []vNombresAsig = {"Lengua" + "Mates" + "Historia" + "Fisica"};

	public static int pedirNota() {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Introduce una nota:");
		num = entrada.nextInt();
		return num;
	}

	public static void rellenarNotas(int aNotas[][]) {
		Scanner entrada = new Scanner(System.in);
		for(int i = 0;i < aNotas.length;i++){
			for(int j = 0;j < aNotas[i].length;j++){    
				int num = pedirNota();
				aNotas[i][j]=num;
			}
		}
	}

	public static void mostrarNotas(int aNotas[][]) {
		Scanner entrada = new Scanner(System.in);
		for(int i = 0;i < aNotas.length;i++){
			System.out.println();
			for(int j = 0;j < aNotas[i].length;j++){
				System.out.print("	["+ aNotas[i][j]+"]");
			}
		}
	}

	public static void menu(int aNotas[][]) {
		Scanner entrada = new Scanner(System.in);
		int num;

		do {
			System.out.println("\n" + "Selecciona una opcion");
			System.out.println("1- Relleanar las notas.");	
			System.out.println("2- Mostrar las notas.");
			System.out.println("3- Alumno con nota media mas alta.");
			System.out.println("4- Alumno con mas suspensos.");
			System.out.println("5- Asignatura mas dificil.");
			System.out.println("6- Salir del programa.");
			num = entrada.nextInt();

			switch(num){
			case 1:
				System.out.println("Has seleccionado la opcion 1");
				rellenarNotas(aNotas);
				break;
			case 2:
				System.out.println("Has seleccionado la opcion 2");
				mostrarNotas(aNotas);
				break;
			case 3:
				System.out.println("Has seleccionado la opcion 3");

				break;
			case 4:
				System.out.println("Has seleccionado la opcion 4");

				break;
			case 5:
				System.out.println("Salir del programa");
				break;
			default:
				System.out.println("Opción no válida");
			}
		}while(num != 6);

		entrada.close();

	}


	public static void main(String[] args) {
		int [][]aNotas = new int [ALUM][ASIG];

		menu(aNotas);

	}

}
