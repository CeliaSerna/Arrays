package main;

import java.util.Arrays;

import java.util.Scanner;

public class Busqueda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //inserción en arrays no ordenados
       
		int[] miArray= {5, 3, 4, 8, 23, 45, 22, 56, 1, 145, 8, 4, 23};
		//imprimimos el array original
		System.out.println("Original " + Arrays.toString(miArray));
		Scanner entrada = new Scanner(System.in);
		
		
	//busqueda
		System.out.println("Indica el elemento a buscar ");
		int[] posicion = buscar(miArray, entrada.nextInt());
		
	if (posicion.length >0) {
		System.out.println("El valor indicado está en la posición " + Arrays.toString(posicion) );
	}else {
		System.err.println("El valor no ha sido encontrado");
	}
	
		entrada.close();	
    }
	
	static int[] buscar(int[] miArray, int elementoBuscado) {
	    int[] posicion = new int[0];
	    
		
		for ( int i = 0; i<miArray.length; i++) {
			if (miArray[i] == elementoBuscado) {
				posicion= Arrays.copyOf(posicion, posicion.length+1);
				posicion[posicion.length-1]=i;
				
				
		}
		}
		
		return posicion;
}
	
	

	
}
