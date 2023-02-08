package main;

import java.util.Arrays;

import java.util.Scanner;

public class CopyOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //inserción en arrays no ordenados
       
		int[] miArray= {5, 3, 4, 8, 23, 45, 22, 56, 1, 145};
		//imprimimos el array original
		System.out.println("Original " + Arrays.toString(miArray));
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuántos valores va a insertar? ");
		int nuevaLongitud= entrada.nextInt();
		
		//BUCLE DONDE INSERTAMOS TODOS LOS HUECOS QUE NOS PIDE EL USUARIO
		for (int i = 0 ; i<nuevaLongitud; i++) {
			miArray = Arrays.copyOf(miArray, miArray.length +1);
			System.out.println("Ingrese el nuevo valor ");
			miArray[miArray.length-1]= entrada.nextInt();
		}
		
		//IMPRIMIMOS EL ARRAY CON LOS NUEVOS NUEVOS INSERTADOS
		System.out.println("Nuevo array " + Arrays.toString(miArray));
		
		entrada.close();
	
	
	
	}

}
