import java.util.Scanner;

public class ProgramacionEstruturada {
	public static void main(String[] args) {
		
		System.out.println("Introduce tu edad");
		Scanner scanner = new Scanner(System.in);
		int edad = scanner.nextInt();
		scanner.close();
		
		if(edad>=18){
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}

}
}