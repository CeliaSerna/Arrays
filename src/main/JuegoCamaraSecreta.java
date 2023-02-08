package main;

import java.util.Scanner;

import java.util.Arrays;

public class JuegoCamaraSecreta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("***************** LA CÁMARA SECRETA ********************");
		System.out.println("¿Cuántos números quiere que tenga la combinación secreta?");
		int longitud = entrada.nextInt();
		int combinacion[]= new int[0] ;
		int intento =0;
		
		for (int i=0; i<longitud; i++) {
		combinacion = Arrays.copyOf(combinacion, combinacion.length+1);
		combinacion[combinacion.length-1] = (int) (Math.random()*5+1);
		}
		//muestra el codigo secreto generado automamticamente
		//System.err.println(Arrays.toString(combinacion));
	//inicio  un bucle que se repetira el número de veces que número tenga la tabla
		for ( int i= 0; i < longitud; i++) {
		
		//bucle donde va pidiendo numeros y los compara con los de la tabla
		while (combinacion[i]!= intento) {
		System.out.println("Introduzca un número");
		intento = entrada.nextInt();
	
		if (combinacion[i]<intento) {
		System.out.println("Menos");
		
		}else if (combinacion[i] > intento) {
		System.out.println("Más");
		}
		} 
		System.out.println("Correcto");
		
		
		}
		
		System.out.println("Ha acertado el códido secreto, que es --> " + Arrays.toString(combinacion));
		
		
	entrada.close();	
	}

}