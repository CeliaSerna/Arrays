package main;

import java.util.Scanner;

public class ActividadCincoTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada= new Scanner(System.in);

System.out.println("¿Cuántos números quiere introducir?");
int cantidadNumeros = entrada.nextInt();
int tabla[] = new int[cantidadNumeros];

for(int i = 0; i <tabla.length; i++) {
System.out.println("Intorduzca un número");
tabla[i]= entrada.nextInt();
	
}

System.out.println("Los números ordenador alrevés" );
for (int i = tabla.length -1; i>=0 ; i--) {
	System.out.println(tabla[i]);
}
}
	
}