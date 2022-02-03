import java.util.Scanner;

public class ScanneryBuffer {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un numero");
	int numero1 = sc.nextInt();
	sc.nextLine(); //limpiar buffer
	
	System.out.println("introduce tu nombre");
	String nombre = sc.nextLine();
	
	System.out.println("Introduce un numero");
	int numero = sc.nextInt();
	
	System.out.println("Ingrese  otro numero");
	int numero2 = sc.nextInt();
	System.out.println("Tu nombre es "+nombre+" numero 1; "+numero1+" numero 2: "+numero2);
}
}
