package main;

import java.util.Arrays;

import java.util.Scanner;

public class ActividadCincoCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int longitud, fin;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Escriba la longitud del array");
	longitud = entrada.nextInt();
	System.out.println("¿Hasta que número quiere mostrar los pares? ");
	fin = entrada.nextInt();
	
	int tabla[] = rellenaPares(longitud, fin);
	System.out.println(Arrays.toString(tabla));
	}

	
static int[] rellenaPares(int longitud ,int fin) {
	int pares[] = new int[longitud];
	
	int i =0;
	while (i <pares.length) {
	int numero = (int)(Math.random()*fin +1);
	if (numero %2 == 0) {
		pares[i] = numero;
		i++;
	}
	}
Arrays.sort(pares);
return (pares);

}

}
