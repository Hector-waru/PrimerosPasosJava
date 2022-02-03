package Metodos;

public class Metodos{
	int a,b;
  //metodo vacio
  public void sumar() {
	  int resultado= a +b ;
	  System.out.println("El resultado es " + resultado);
  }
  
  //Metodo con retorno de valores 
  public int sumaConRetorno() {
		 return a+b;
	 }
  //Metodo(Argumentos)
  public double multiplicarConArgumentos(int arg1, double arg2){
	  int c= arg1;
	  double d= arg2;

	  return c*d;
  }
  //Metodo Estatico
  public static void imprimirNombre(String nombre) {
	  System.out.println(nombre);
  }
  //
}
