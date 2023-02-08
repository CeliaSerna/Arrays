package main;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada=new Scanner(System.in);

System.err.print("Ingrese el numero de edades a introducir->");

int longitudTabla=entrada.nextInt();

int datos[]=new int[longitudTabla];

System.out.println(datos.length);

for (int i=0; i<datos.length;i++) {

	System.out.print("Ingrese la edad en la posicion de la tabla "+ i +"-> ");            

	datos[i]=entrada.nextInt();                    

}
//RECORRER LOS DATOS//
for (int i : datos) {
	System.out.println("La edad introducida es " + i);
	
}
}

}
