
public class Ejercicio10 {
	
	public static void rellenarVector(int vNum[]) {
		for (int i = 0; i<vNum.length;i++) {
			vNum[i]=(int) ((Math.random()*8)+1);
		}
	}
	
	public static void mostrarVector(int vNum[]) {
		System.out.print("Se han generado los siguiente numeros ");
		for(int i = 0; i< vNum.length;i++) {
			System.out.print("[" + vNum[i] + "]");
		}
	}
	
	public static boolean repetido(int vNum[], int num, int pos) {
        int i;
        boolean enc = false;
        i = pos;
		while((i < vNum.length)&&(!enc)){
            if  (vNum[i] == num){ 
                enc = true;
            }
            i++;
        }
        return enc;
	}
	
	public static void cambiarPorCeros(int vNum[]) {
		int i, j, num;
		boolean repetido;
		System.out.println("\n" + "Sustituimos los elementos repetidos por un '0' ");
		for(i = 0;i < vNum.length;i++){
            if  (vNum[i] != 0){
                num = vNum[i];
                repetido = repetido(vNum, num, i + 1);
                if  (repetido){
                    for(j = i;j < vNum.length;j++){
                        if  (vNum[j] == num){
                            vNum[j] = 0;
                        }
                    }
                }
            }
        }
	}
	
	public static void main(String[] args) {
		int []vNum = new int[10];
		rellenarVector(vNum);
		mostrarVector(vNum);
		cambiarPorCeros(vNum);
		mostrarVector(vNum);
	}

}
