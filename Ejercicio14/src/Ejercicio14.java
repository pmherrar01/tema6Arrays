import java.util.Scanner;

public class Ejercicio14 {

	final static int FIL = 4;
	final static int COL = 7;
	final static String []vDias =  {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
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

	 public static void diaCaluroso(int aMes[][]){
	        int i, j, max = aMes[0][0];
	        for(i = 0;i < aMes.length;i++){
	            for(j = 0;j < aMes[0].length;j++){
	                if  (aMes[i][j] > max){
	                    max = aMes[i][j];
	                }
	            }
	        }
	        for(i = 0;i < aMes.length;i++){
	            for(j = 0;j < aMes[0].length;j++){
	                if  (aMes[i][j] == max){
	                    System.out.println("    El "+vDias[j]+" de la semana "+(i+1)+" con "+max+" grados.");
	                }
	            }
	        }
	    }

	public static void menu(int aMes[][]) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("\n" + "Selecciona una opcion");
			System.out.println("1- Rellenar las temperaturas.");	
			System.out.println("2- Mostrar las temperaturas.");
			System.out.println("3- Visualizar la temperatura media del mes.");
			System.out.println("4- Dia o dias mas calurosos.");
			System.out.println("5- Salir del programa.");
			num = entrada.nextInt();
			
			switch(num){
			case 1:
				System.out.println("Has seleccionado la opcion 1");
				rellenarMes(aMes);
				break;
			case 2:
				System.out.println("Has seleccionado la opcion 2");
				mostrarTemperaturas(aMes);
				break;
			case 3:
				System.out.println("Has seleccionado la opcion 3");
				temperaturaMedia(aMes);
				break;
			case 4:
				System.out.println("Has seleccionado la opcion 4");
				diaCaluroso(aMes);
				break;
			case 5:
				System.out.println("Salir del programa");
				break;
			default:
				System.out.println("Opción no válida");
			}
		}while(num != 5);
		
		entrada.close();

	}

	public static void main(String[] args) {
		int [][]aMes = new int [FIL][COL];
		menu(aMes);
	}

}
