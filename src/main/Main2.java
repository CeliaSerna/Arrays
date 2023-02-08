package main;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// actividad resuelta 5.2
Scanner entrada = new Scanner(System.in);
entrada.useLocale(Locale.US);
double tabla[]= new double[5];

for (int i= 0; i<5; i++) {
	System.out.println("Escribe un número");
	tabla[i] = entrada.nextDouble();
}
		System.out.println(Arrays.toString(tabla));
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));
		
	}

}
