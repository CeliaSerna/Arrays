package main;

import java.util.Arrays;

import java.util.Scanner;

public class CopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//inserción en arrays no ordenados
		int[] miArray= {5, 3, 4, 8, 23, 45, 22, 56, 1, 145};
		//imprimimos el array original
		System.out.println("Original " + Arrays.toString(miArray));
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indique el valor a insertar ");
		int nuevoValor= entrada.nextInt();
		//creamos un hueco en el array para insertar un nuevo numero
		miArray = Arrays.copyOf(miArray, miArray.length +1);
		
		miArray[miArray.length-1]=nuevoValor;
		//imprimimos el array con el nuevo valor
		System.out.println("Nuevo array " + Arrays.toString(miArray));
	
	entrada.close();
	
	}

}
