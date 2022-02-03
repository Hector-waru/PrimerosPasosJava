import java.util.Scanner;
public class EstructuraDeControlSwitch {
       public static void main(String[] args) {
    	   /* 
    	    switch(Condicion a evaluar){
    	    case "valor" :
    	    Codigo a ejecutar
    	    break;
    	    
    	    case "n" :
    	    Codigo a ejecutar
    	    break;
    	    
    	     default :
    	    Codigo a ejecutar
    	    }*/
    	   Scanner sc = new Scanner(System.in);
    	   
	       System.out.println("que dia es hoy?");
	       String dia = sc.nextLine();
	       
	       
    	   switch(dia.toLowerCase()) {
    	   case "lunes":
   		   System.out.println("Falta mucho para el viernes de lokiar");
    	   //comentar texto seleccionado source>add block comment ctrl+ mayus +7
   		   break;
    	   case "martes":
    	   System.out.println("Es martes de tianguis con elotes en vaso suculentos ");
    	   break;
    	   case "miercoles":
    		   System.out.println("Es miercoles de tianguis donde la fruta es buena UuU");
    		   break;
    	   case "jueves":
    		   System.out.println("Ya mañana es viernes UwU");
    		   break;
    	   case "viernes":
    		   System.out.println("Viernes de la locacion ");
    		   break;
    	   case "sabado":
    		   System.out.println("sigamos en modo del viernes >:D ");
    		   break;
    	   default:
  		   System.out.println("Buen intento al romper el codigo pero ingresa un dia por favor :D");
    	  } 
    	   sc.close();
//
       }
       
}
//