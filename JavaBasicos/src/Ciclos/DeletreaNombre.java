package Ciclos;

import java.util.Scanner;

public class DeletreaNombre {
     public static void main(String[] args) {
		/**/
    	 Scanner sc= new Scanner(System.in);
    	 System.out.println("Introduce tu nombre");
    	 String nombre = sc.next();
    	 // existe toCharArray lo contiene en un array ó charAt(numeroDeLetra)
    	 char[] separa = nombre.toCharArray();
    	 for(int i=0;i<separa.length;i++) {
    		 System.out.println(separa[i]);
    	 }
	}
}
