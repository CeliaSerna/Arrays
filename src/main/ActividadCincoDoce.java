package main;

import java.util.Arrays;

public class ActividadCincoDoce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//********DA UN ERROR********
		
int tabla[][];
tabla = new int[5][5];

for (int i =0; i<5; i++) {
	for (int j =0; j<5; i++) {
		 tabla[i][j] = 10*i + j;
	}
}
		
		System.out.println(Arrays.deepToString(tabla));
		
		for( int fila[]: tabla) {
			for(int columna:fila) {
				System.out.println(columna +" \t");
			}
			System.out.println();
		}
		
	}

}
