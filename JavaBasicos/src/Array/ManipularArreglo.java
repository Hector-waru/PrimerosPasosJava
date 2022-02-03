package Array;

public class ManipularArreglo {
     public static void main(String[] args) {
		/* Crea una clase llamara ManipularArreglo
crea un array con los siguientes números enteros:

1, 6, 45, 53, 80, 102, 145, 326, 450, 892
Crea un programa que use un ciclo que tome los números de arreglo y devuelva la suma total, la suma de los números pares y la suma de los números impares.*/
	
     int[] numeros=new int[]{1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
     int flagTotal=0;
     int flagPar=0;
     int flagImpar=0;
     
     for(int i=0;i<numeros.length;i++) {
    	 flagTotal=flagTotal+numeros[i];
    	 if(numeros[i] % 2 == 0){
    		 flagPar=flagPar+numeros[i];
    	 }else{
    		 flagImpar=flagImpar+numeros[i];
    	 }
     }
     System.out.println("El resultado del total es: "+ flagTotal+" la suma de los pares es: "+flagPar+" y la suma de los impares es: "+flagImpar);
     
     }
}
