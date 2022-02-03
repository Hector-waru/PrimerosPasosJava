import java.util.Scanner;

public class Descuento {
     public static void main(String[] args){
    	 double cuenta;	
          System.out.println("Ingrese el total de su compra");
   	      Scanner scanner = new Scanner(System.in);
   	      cuenta = scanner.nextDouble();
   	      
   	      if(cuenta<1000){
   	    	  System.out.println("Gracias por tu compra");
   	      }else if(cuenta>=1000&&cuenta<5000){
   	    	  cuenta=cuenta *.90;
   	    	  System.out.println("Tu nuevo total con 10% de descuento es de");
   	      }else if(cuenta>=5000&&cuenta<10000){
   	    	cuenta=cuenta *.80;
 	    	  System.out.println("Tu nuevo total con 10% de descuento es de"); 
   	      }else if(cuenta>=10000){
   	    	cuenta=cuenta *.70;
	    	  System.out.println("Tu nuevo total con 10% de descuento es de"); 
   	      }
   	      

 //
     }
}
//