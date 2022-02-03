import java.util.Scanner;

public class Calculadora {
 public static void main(String[] args) {
	int num1, num2, opcion, resulta;
	System.out.println("Hola usuario ingresa por favor dos datos para realizar una operacion");
	System.out.println("Dato numero 1");
	Scanner sc = new Scanner(System.in);
    num1 = sc.nextInt();
    System.out.println("Dato numero 2;");
    num2 = sc.nextInt();
   
    System.out.println("Elige una opcion;");
    System.out.println("1) sumar");
    System.out.println("2) restar");
    System.out.println("3) multiplicar");
    System.out.println("4) dividir");
    opcion =sc.nextInt();
    switch (opcion){
    case 1:
    	resulta = ((num1)+(num2));
    	System.out.println("El resultado de la opercion es "+resulta);
    	break;
    case 2:
    	resulta = ((num1)-(num2));
    	System.out.println("El resultado de la opercion es "+resulta);
    	break;
    case 3:
    	resulta = ((num1)*(num2));
    	System.out.println("El resultado de la opercion es "+resulta);
    	break;
    case 4:
    	if(num2==0){
    		System.out.println("no puedes dividir entre 0");
    	}else {
    	resulta = ((num1)/(num2));
    	System.out.println("El resultado de la opercion es "+resulta);
    	}
    	break;
    default:
    	System.out.println("no es una opcion disponible");
    
    }
}
}
