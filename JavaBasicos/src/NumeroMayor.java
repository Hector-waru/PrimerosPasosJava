import java.util.Scanner;

public class NumeroMayor {
   public static void main(String[] args){
	   System.out.println("Introduce tres numeros");
	    Scanner scanner = new Scanner(System.in);
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		int numero3 = scanner.nextInt();
		scanner.close();
	   if(numero1>numero2){
		   if(numero1>numero3){
			   System.out.println("numero "+numero1+" es el mas alto");
		   }
	   }else if(numero2>numero1){
		   if(numero2>numero3){
			   System.out.println("numero "+numero2+" es el mas alto");
		   }
		   }else{
					   System.out.println("numero "+numero3+" es el mas alto");
		   }
		  
}  
/*int Array[]= new int[3];
int i,j;
int aux;
for(i=0;i<3;i++){
	System.out.println("Ingrese el valor numero " + (i+1) );
	Array[i]=scanner.nextInt();
}
//Burble
for(i=0;i<3;i++){
	for(j=0;j<3;j++){
		if (Array[j]>Array[j+1]){
		aux=Array[j];
		Array[j] = Array[j+1];
		Array[j+1] = aux;
		}
	}
}
//Termina
 * */
}