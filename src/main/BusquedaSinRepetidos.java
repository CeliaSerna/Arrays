package main;

import java.util.Arrays;

import java.util.Scanner;

import javax.swing.AbstractAction;

public class BusquedaSinRepetidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
  int[] numeros = new int [25];
  for (int i = 0; i <25; i++) {
	  numeros[i]=(int)(Math.random()*30+1);
  }
  Arrays.sort(numeros);
  System.out.println(Arrays.toString(numeros));
  //funcion que busque los repetidos
  int[] repetidos= buscarRepetidos(numeros);
  Arrays.sort(repetidos);
  System.err.println("Array sin repetidos " + Arrays.toString(repetidos));
		
}
	
static int[] buscarRepetidos(int[] numeros) {
		int[] temporal = new int[0];
		for (int elemento : numeros) {
			//   !buscar  ----->   si la función buscar devuelve falso 
			if (!buscar(temporal, elemento)) {
				temporal=Arrays.copyOf(temporal, temporal.length+1);
				temporal [temporal.length-1]=elemento;
			}
		}
		return temporal;
		
}
	
static boolean buscar(int[] temporal, int elemento) {
	boolean indicador = false;
	for (int i=0; i<temporal.length; i++) {
		if ( temporal[i] == elemento) {
			indicador=true;
	}
	}
	return indicador;
}


}
