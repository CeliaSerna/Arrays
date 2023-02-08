package main;

import java.util.Scanner;

public class TablaMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String[] meses ={"","Enero","Febrero" ,"Marzo", "Abril", "Mayo", "Junio",  "Julio", "Agosto" ,"Septiembre" ,"Octubre", "Noviembre", "Diciembre"};
		
		Scanner entrada = new Scanner(System.in);
	System.out.println("Dia de nacimiento");
	int dia = entrada.nextInt();
	System.out.println("Mes de nacimiento");
	int mes = entrada.nextInt();
	System.out.println("Año de nacimiento");
	int year = entrada.nextInt();
	
	System.out.println("Tu fecha de nacimiento es " + dia + " de " + meses[mes] + " de " + year);
	}

}
