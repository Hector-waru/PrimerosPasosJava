package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {
   public static void main(String[] args) {
	//las colecciones nos sriven para almacenar un conjunto de objetos
	//La diferencia entre colecciones y arreglos es el dinamismo de las colecciones puede cambiar
	  
	   //Set tiene 3 implementaciones
	   
	   //no puede contener elementos repetidos
	    
	   //Hashset una tabla hash D:
	   //los elementos no mantienen un orden lo tiene por memoria
	  /* Set<String> frutas = new HashSet<String>();
	   frutas.add("Mango");
	   frutas.add("Uva");
	   frutas.add("Piña");
	   frutas.add("Sandia");
	   frutas.add("Jicama");
	   frutas.add("Pera");
	   frutas.add("Manzana");
	   //Elemento donde se guarda :  ese elemento se guarda en una variable
	   for(String fruta: frutas ){
		   System.out.println(fruta);
	   } */
		
	   //treeset la mas lentar y porden de acuedo a sus valores
	   /*Set<String> frutas = new TreeSet<String>();
	   frutas.add("Mango");
	   frutas.add("Uva");
	   frutas.add("Piña");
	   frutas.add("Sandia");
	   frutas.add("Jicama");
	   frutas.add("Pera");
	   frutas.add("Manzana");
	   //Elemento donde se guarda :  ese elemento se guarda en una variable
	   for(String fruta: frutas ){
		   System.out.println(fruta);
	   }*/
	   //linkedHashSet - tiene un metodo para ordenarlos - computacionalmente mas pesado
	  /* Set<String> frutas = new LinkedHashSet<String>();
	   frutas.add("Mango");
	   frutas.add("Uva");
	   frutas.add("Piña");
	   frutas.add("Sandia");
	   frutas.add("Jicama");
	   frutas.add("Pera");
	   frutas.add("Manzana");
	   //Elemento donde se guarda :  ese elemento se guarda en una variable
	   for(String fruta: frutas ){
		   System.out.println(fruta);
	   }*/
	   
	  //listas se permiten duplicados, acceder a elementos especificos
	   //buscar elementos
	   //ArrayList
	   List<String> pokemones = new ArrayList<String>(); 
	   pokemones.add("chicorita"); 
	   pokemones.add("Eevee");
	   pokemones.add("Dragonite");
	   pokemones.add("Gengar");
	   pokemones.add("Charizard");
	   //(posicion, insercion)
	   pokemones.add(2, "Pikachu");
	   pokemones.add("Gengar");
	   
	   pokemones.remove(5);
	   pokemones.set(0, "Flareon");
	   
	   for(String pokemon: pokemones){
		   System.out.println(pokemon);
	   }
	   //metodo para recuperar lo que quiero
	   System.out.println("*************");
	   System.out.println(pokemones.get(0));
	   System.out.println(pokemones.indexOf("Gengar"));
	   System.out.println(pokemones.lastIndexOf("Gengar"));
	   System.out.println(pokemones.indexOf("Togepi"));
	   
	   //LinkedList
	   //doblmenete enlazada internamente sabe lo que hay delante y atras del cada uno
	    List<String> digimones = new LinkedList<String>();
	    digimones.add("Agumon");
	    digimones.add("Patamon");
	    digimones.add("Leomon");
	    digimones.add("Greymon");
	    
	   //coleccion Map
	    //vienen en pares indice, valor
	    //No puede contener claves duplicadas
	    //HashMap
	    //Mejor rendimiento pero no garantiza orden
	    Map<Integer, String> usuarios = new HashMap<Integer, String>();
	    usuarios.put(1, "Hector");
	    usuarios.put(2, "Rebeca");
	    usuarios.put(3,"Roxy");
	    
	    System.out.println(usuarios.get(3));
	   
	    //Keyset recupera nombre de la clave
	    System.out.println(usuarios.keySet());
	    //Values - Resupera el valor
	    System.out.println(usuarios.values());
	    
	    //treemap
	    Map<String, String> tamales =  new TreeMap<String, String>();

	    tamales.put("Oxaqueño", "Mole rojo");
	    tamales.put("Torta", "Mole verde");
	    tamales.put("dulces", "Gansito");
	    tamales.put("Salado", "cochinita");
	    System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		tamales.entrySet().forEach(elemento ->{
			System.out.println(elemento);
		});
		//LinkedHashMap
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		carros.put(1, "volvo");
		carros.put(2, "vento");
		carros.put(3, "Pointer");
		System.out.println("****************");
		System.out.println(carros.keySet());
		System.out.println(carros.values());
	
		
		//    
 }
}
//