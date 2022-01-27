package operadores;

public class Operadores {
	public static void main(String[] args) {
		/*operadores aritmeticos
		 / dividir
		  * multiplicar
		  + sumar
		  - restar
		  */
		int a = 10;
		int b = 20;
		double c = 10.0;
		int suma = a + b;
		System.out.println(suma);
		
		String strl = "El resultado de la suma es  ";
		System.out.println(strl + suma);
		//resta
		System.out.println("El resultado de la resta es: " + (a-b));
		//division
		int division =a / b;
		System.out.println("El resultado de la division es: " + division);
		//Parseo almenos a un dato ya que proviene de un int pero se puede agregar una dato double y hacer la division
		double division2=(double) a/b;
		System.out.println("El resultado de la division numero dos es " + division2);
		//Multiplicacion
		double multi = c*a;
		System.out.println("El resultado de la multiplicacion " + multi);
		//modulo
		int modulo = a % b;
		System.out.println("El moudulo de la operacion es "+ modulo);
		
		//Operador de asignacion
		int e, d;
		e=6;
		d = 5;
		System.out.println(d +" "+ e);
		//operadores de declaracion compuesta
		/*+=, -=, /=, %=
		 Operacicon simplificada*/
		int f=0, g=5;
		f +=5;
		System.out.println(f);
		//operadores relaxionales
		// <,>, <=,>=, ==, !=
		int j=15, h=25;
		String i = "HOLA";
		System.out.println(h > j);
		System.out.println();
		//operador unario preasignacion, postasignacion++, -- 
		int k=0, l=0;
		
		System.out.println(++k);
		//precedencia de operadores
		int operacion = (4+5)*6;
		int x=0, y=0;
		int operacion2= ++x + --y;
		System.out.println(operacion2);
		//operador ternario
		int edad=19, valor=0, valor1=2;
		int resultado= (edad<=18)? valor: valor1;
		System.out.println(resultado);
		//operadores logicos
		System.out.println(true && true);
		System.out.println(true || false);
		System.out.println(true && false);
		System.out.println(true && !true);
		
	}
}
