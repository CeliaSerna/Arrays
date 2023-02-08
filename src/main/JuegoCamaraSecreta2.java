package main;

import java.util.Scanner;

import java.util.Arrays;

public class JuegoCamaraSecreta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("******************* LA CÁMARA SECRETA ********************");
		System.out.println("¿Cuántos números quieres que tenga la combinación secreta?");
		
		int longitud = entrada.nextInt();
		int combinacion[]= new int[0] ;
		int intento[] = new int[longitud];
	
		for (int i=0; i<longitud; i++) {
		combinacion = Arrays.copyOf(combinacion, combinacion.length+1);
		combinacion[combinacion.length-1] = (int) (Math.random()*5+1);
		}
		//muestra el codigo secreto generado automamticamente
		System.err.println("( Combinación secreta -> "+Arrays.toString(combinacion)+" )");
		
		//BUCLE DONDE SE PIDEN EL CODIGO SECRETO HASTA QUE SE ACIERTE
		while (!Arrays.equals(combinacion, intento)) {
		//BUCLE DONDE PIDO TANTOS NUMEROS COMO LONGITUD HAYA ELEGIDO EL JUGADOR
		for ( int i=0; i < longitud; i++) {
		
		System.out.print("Introduce tu combinación ->");
		System.out.println("(Números entre 1 y 5 incluidos)");
	    intento[i] = entrada.nextInt();
		}
		System.out.println("Tu combinación es -> "+Arrays.toString(intento));
	
		if (!Arrays.equals(combinacion, intento)) {
		System.err.println("¡¡ Has fallado !!");
		for ( int i =0; i <longitud; i++) {
			if (intento[i] < combinacion[i] ) {
				System.out.print(intento[i] );	
				System.out.println(" --> Más");	
				
			}else if (intento[i] > combinacion[i] ) {
				System.out.print(intento[i] );	
				System.out.println(" --> Menos");

			}else if (intento[i] == combinacion[i] ) {
				System.out.print(intento[i] );
				System.out.println(" --> Número correcto");
		}
		}
		
		}
		}
		System.out.println("¡¡¡Enhorabuena!!! ¡¡¡Has acertado!!!");
	//falta imprimir por cada elemento del array si es mas o menos//	
	entrada.close();	
	}

}	

