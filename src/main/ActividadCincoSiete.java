package main;

import java.util.Arrays;

public class ActividadCincoSiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
	}

static int[] sinRepetidos(int[] tabla) {
	int temporal[]= new int[0];
	
	for (int elemento : tabla) {
		if (BusquedaDicotomica(temporal, elemento) == -1) {
			temporal = Arrays.copyOf(temporal, temporal.length +1);
			temporal[temporal.length -1]= elemento;
		}
	}
return temporal;
}

private static int BusquedaDicotomica(int[] temporal, int elemento) {
	// TODO Auto-generated method stub
	return 0;
}
}
