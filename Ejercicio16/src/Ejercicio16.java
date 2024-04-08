import java. util.Scanner;

public class Ejercicio16 {

	final static int MAX_ALUM = 6;
	final static int MAX_ASIG = 4;

	 public static void rellenarNotas(int[][] vNotas, String[] vAlumno, String[] vAsignaturas){
	        Scanner teclado = new Scanner(System.in);
	        int i, j;
	        for(i = 0;i < MAX_ALUM;i++){
	            System.out.println("NOTAS "+vAlumno[i]);
	            System.out.println("-------------");
	            for(j = 0;j < MAX_ASIG;j++){
	                System.out.print(vAsignaturas[j]+": ");
	                vNotas[i][j] = teclado.nextInt();
	            }
	        }
	    }

	public static void mostrarNotas(int aNotas[][],String[] vAlumnos,String[] vAsignaturas) {
		int i, j;
        for(i = 0;i < MAX_ALUM;i++){
            System.out.println("\n\nNOTAS "+vAlumnos[i]);
            System.out.println("------------");
            for(j = 0;j < MAX_ASIG;j++){
                System.out.print(vAsignaturas[j]+": "+aNotas[i][j]+" ");
            }
        }
	}


	public static void mejorAlumno(int aNotas [][], String[] vAlumnos) {
		int suma, media=0, mejorAlumno=0;
		for(int i = 0;i<aNotas.length;i++) {
			suma=0;
			for(int j = 0;i<aNotas[i].length;i++) {
				suma = suma + aNotas[i][j];
			}
			if(suma>media) {
				media = suma;
				mejorAlumno=i;
			}

		}
		System.out.println("Mejor Alumno: " + vAlumnos[mejorAlumno]);
	}

	public static void peorAlumno(int aNotas[][], String[] vAlumnos) {
		int suspensos=0, cont, peorAlumno = 0;
		for(int i =0; i<aNotas.length;i++) {
			cont=0;
			for(int j=0;j<aNotas[i].length;j++) {
				if(aNotas[i][j]<5) {
					cont++;
				}
			}
			if  (cont > suspensos){
				suspensos = cont;
				peorAlumno = i;
			}
		}
		System.out.print("El alumno con mas suspensos es: " + vAlumnos[peorAlumno] + "y tiene " + suspensos + " suspensos");
	}
	
	public static void asigDificil(int aNotas[][], String[] vAsignaturas) {
		int i, j;
        int suma, menorMedia = Integer.MAX_VALUE;
        int asigDificil = 0;
        for(j = 0;j < MAX_ASIG;j++){
            suma = 0;
            for(i = 0;i < MAX_ALUM;i++){
                suma = suma + aNotas[i][j];
            }
            if (suma < menorMedia){
                menorMedia = suma;
                asigDificil = j;
            }
        }
        System.out.println("Asignatura más difícil: "+ vAsignaturas[asigDificil]);
	}


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] vNotas = new int[MAX_ALUM][MAX_ASIG];
        String[] vAlumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        String[] vAsignaturas = {"Lengua", "Matemáticas", "Historia", "Físca"};
        int opc;
        do{
            System.out.println("\nMENÚ CLASE");
            System.out.println("1. Rellenar Notas");
            System.out.println("2. Mostrar Notas");
            System.out.println("3. Mejor alumno");
            System.out.println("4. Peor alumno");
            System.out.println("5. Asignatura más difícil");
            System.out.println("6. Salir");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    rellenarNotas(vNotas, vAlumnos, vAsignaturas);
                    break;
                case 2:
                    mostrarNotas(vNotas, vAlumnos, vAsignaturas);
                    break;
                case 3:
                    mejorAlumno(vNotas, vAlumnos);
                    break;
                case 4:
                    peorAlumno(vNotas, vAlumnos);
                    break;
                case 5:
                    asigDificil(vNotas, vAsignaturas);
                    break;
                case 6:
                    System.out.println("¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while(opc != 6);
    }

}
