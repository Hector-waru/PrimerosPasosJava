package Array;

public class Arreglos {
 public static void main(String[] args) {
	/*Lo arreglos aqui solo arancan con un micmo dato, tambien la cantidad de datos a tener*/
	//iniciarlizar arreglo
	int numeros[];
	numeros=new int[4];
	//otra manera
	String[] nombres=new String[5];
	numeros[0]=1;
	numeros[1]=10;
	numeros[2]=100;
	numeros[3]=1000;
	
	nombres[0]="juan";
	nombres[1]="juan";
	nombres[2]="juan";
	nombres[3]="juan";
	//otra forma de declarar y llenar un array      tyyhtgu
	String[] frutas= new String[]{"manzana","banana","uva","jicama","sandia"};
	
	for(int i=0;i<numeros.length;i++) {
		System.out.println("Elemento de numeros "+numeros[i]);
	}
	
	for(int i=0;i<nombres.length;i++) {
		System.out.println("Elemento de numeros "+nombres[i]);
	}
 }
}
