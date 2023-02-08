package main;

import java.util.Arrays;

import java.util.Scanner;

public class TablaBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] coches = new String[10][3];
		
	Scanner entrada = new Scanner(System.in);
	for (int i =0; i < coches.length; i++) { //recorremos las filas
		for ( int j=0; j<coches[i].length; j++) { //recorremos las columnas de esa fila
			switch (j) {
			case 0 -> {
				System.out.println("Indica la marca y el modelo [" +(i+1) + "] -> >  " );
				coches[i][j]=entrada.nextLine();
			}
			case 1 -> {
				System.out.println("Indica cantidad de coches vendidos [" +(i+1) + "] -> >  " );
				coches[i][j]=entrada.nextLine();
			}
			case 2 -> {
				System.out.println("Indica precio medio de venta [" +(i+1) + "] -> >  " );
				coches[i][j]=entrada.nextLine();
			}
			
			}
		
	}
	}
	//para imprimir todo el array bidimensional utilizamos Arrays.deepToString(coches)
	System.out.println(Arrays.deepToString(coches));
	
	for( String filas[]: coches) {
		for(String columnas:filas) {
			System.out.println(columnas +" \t");
		}
		System.out.println();
	}


entrada.close();	
}
}
