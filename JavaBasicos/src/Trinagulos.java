import java.util.Scanner;

public class Trinagulos {
      public static void main(String[] args){
    	  int Array []= new int[3];
    	  int i;
    	  int suma=0;
    	  System.out.println("Ingrese 3 angulos para su triangulo");
    	  Scanner scanner = new Scanner(System.in);
    	  for(i=0;i<3;i++){
    		  System.out.println("Ingrese el valor numero " + (i+1) );
    		  Array[i]=scanner.nextInt();
    		
    		  suma=Array[i]+suma;
    	  }
    	  scanner.close();
    	  
    	  if(suma>180||suma<180){
    		  System.out.println("Esto dejo de ser un tringulo pues la suma de sus angulos no son 180 grados");
    	  }else{
    		  System.out.println("Que bonito tu triangulo ;^)");
    	  }
    	  //fin de main
      }
}
