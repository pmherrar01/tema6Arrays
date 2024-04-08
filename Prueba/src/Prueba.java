import java.util.Scanner;

public class Prueba {

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
    
    public static void mostrarNotas(int[][] vNotas, String[] vAlumnos, String[] vAsignaturas){
        int i, j;
        for(i = 0;i < MAX_ALUM;i++){
            System.out.println("\n\nNOTAS "+vAlumnos[i]);
            System.out.println("------------");
            for(j = 0;j < MAX_ASIG;j++){
                System.out.print(vAsignaturas[j]+": "+vNotas[i][j]+" ");
            }
        }
    }
    
    //Alumno con mejor nota media
    public static void mejorAlumno(int[][] vNotas, String[] vAlumnos){
        int i, j;
        int suma, mayorMedia = 0, mejorAlumno = 0;
        for(i = 0;i < MAX_ALUM;i++){
            //Inicializamos suma para el nuevo alumno
            suma = 0;
            for(j = 0;j < MAX_ASIG;j++){
                //Sumamos las notas del alumno "i"
                suma = suma + vNotas[i][j];
            }
            if (suma > mayorMedia){
                mayorMedia = suma;
                mejorAlumno = i;
            }
        }
        System.out.println("Mejor Alumno: "+vAlumnos[mejorAlumno]);
    }
    
    //Alumno con más suspensos
    public static void peorAlumno(int[][] vNotas, String[] vAlumnos){
        int i, j, suspensos = 0, cont, peorAlumno = 0;
        for(i = 0;i < MAX_ALUM;i++){
            //Inicializamos cont de suspensos para alumno "i"
            cont = 0;
            for(j = 0;j < MAX_ASIG;j++){
                if  (vNotas[i][j] < 5){  //Si ha suspendido
                    cont++;
                }
            }
            //Si hemos encontrado un alumno con más suspensos
            if  (cont > suspensos){
                suspensos = cont;
                peorAlumno = i;
            }
        }
        System.out.println("Peor Alumno: "+vAlumnos[peorAlumno]);
    }
    
    //Nota media más baja
    public static void asigMasDificil(int[][] vNotas, String[] vAsignaturas){
        int i, j;
        int suma, menorMedia = Integer.MAX_VALUE;
        int asigDificil = 0;
        for(j = 0;j < MAX_ASIG;j++){
            //Inicializamos suma para la nueva asignatura
            suma = 0;
            for(i = 0;i < MAX_ALUM;i++){
                //Sumamos las notas de la asignatura "j"
                suma = suma + vNotas[i][j];
            }
            if (suma < menorMedia){
                menorMedia = suma;
                asigDificil = j;
            }
        }
        System.out.println("Asignatura más difícil: "+vAsignaturas[asigDificil]);
    }
    
    /**
     * @param args the command line arguments
     */
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
                case 1:  //Rellenar notas
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
                    asigMasDificil(vNotas, vAsignaturas);
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
