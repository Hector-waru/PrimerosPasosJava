package Ciclos;
import java.util.Scanner;
public class Tabla {
	/*
	 * 1.- Crea una nueva clase llamada Tabla
2.- Copia el siguiente codigo y verifica que funcione

	public class Table
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Ingresa cualquier número positivo: ");
	        num = console.nextInt();
	                
	        System.out.println("Tabla de multiplicar de  " + num);
	        
	       //Implementa un bucle while que imprima el resultado
	    }
	}	

3.- Debe imprimir la tabla de multiplicar del número en cuestión (solo los primeros 10 números)*/
	public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num;
       
        System.out.print("Ingresa cualquier número positivo: ");
        num = console.nextInt();
        if(num <0){
        	num=num*-1;
        }
               
        System.out.println("Tabla de multiplicar de  " + num);
        int i=1;
        int resultado;
        do {
        	resultado = num * i;
        	System.out.println(num+" x "+i+"= "+resultado);
        	i++;
        }while(i<=10);
        
       //Implementa un bucle while que imprima el resultado
    }
}
