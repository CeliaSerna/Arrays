package main;

import java.util.Arrays;

public class Eliminacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros = {1,2,3,4,5,6};
		System.out.println("Array original " + Arrays.toString(numeros));
		int posicion = Arrays.binarySearch(numeros, 2);
		if ( posicion >=0) {
			for (int i= posicion; i <numeros.length -1; i++) {
				numeros[i]= numeros[i+1];
			}
		}
		numeros = Arrays.copyOf(numeros, numeros.length-1);
		System.out.println("Array resultante " + Arrays.toString(numeros));
		
		
		
	}

}
