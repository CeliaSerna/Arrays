package main;

import java.util.Arrays;
import java.util.Scanner;
public class Copia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int miArray[] = {5,6,43,654,4,5,56,33};
//insertamos 5 datos más longitud 13, 

System.out.println("ORIGINAL " + miArray + " datos " + Arrays.toString(miArray));

Scanner entrada = new Scanner(System.in);
//se pide  al usuario cuanto va a ingresar
System.out.print("¿Cuántos números vas a ingresar?");
int nuevosNumeros=entrada.nextInt();

miArray=Arrays.copyOf(miArray, miArray.length+nuevosNumeros);

for (int i = (miArray.length-nuevosNumeros); i <miArray.length; i++) {
	System.out.print("escribe el nuevo número");
	miArray[i]= entrada.nextInt();
	
}
System.out.println("original " + miArray + " datos" + Arrays.toString(miArray));

entrada.close();	
		
		
		
		
	}

}
