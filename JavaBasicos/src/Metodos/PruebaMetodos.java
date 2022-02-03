package Metodos;

public class PruebaMetodos {
	 public static void main(String[] args) {
		      //un estatic funciona sin objetos 
		 Metodos.imprimirNombre("Hector");
			//Crear un nuevo objeto que va a contener los metodos y atributos
			   Metodos metodoPrueba = new Metodos();
			   metodoPrueba.a=10;
			   metodoPrueba.b=26;
			   
//			   metodoPrueba.sumar();	

			   int resultadoSuma = metodoPrueba.sumaConRetorno();
			   System.out.println(resultadoSuma - 10);
			   
			   // 
			   double multiplicacion = metodoPrueba.multiplicarConArgumentos(10, 20.50);
			   System.out.println("****************");
			   System.out.println("El resultado de la multiplicacion es "+ multiplicacion);
			   
//			   
	 }
}
//