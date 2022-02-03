package Ciclos;

public class Ciclos {
public static void main(String[] args) {
	//while
//	int condicion = 3;
//	while(condicion < 10){
//		System.out.println("condicion = "+condicion);
//		condicion ++;
//	}
	
//	int control = 0;
//	do {
//		System.out.println("control= "+control);
//		control ++;
//	}while (control<3);
	for(int i=0;i<10;i++){
		if(i % 2==0) {
		//System.out.println("Control = "+i);
		//break; //termino el ciclo
		continue;//no hcae el contenido dentro de if
		}
		System.out.println("control = "+i);
	}
//	
 }
}
//