package main;

import java.util.Arrays;

public class BusquedaDicotomica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int datos[]= {45, 34,23,3456,2345,3,546};
		System.out.println("array sin ordenar " + Arrays.toString(datos));
		Arrays.sort(datos);
		System.out.println("array ordenado " + Arrays.toString(datos));
		int elementoBuscado=45;
		int indiceBusqueda=Arrays.binarySearch(datos, elementoBuscado);
		System.out.println(indiceBusqueda);
		
		if (indiceBusqueda<datos.length && indiceBusqueda >=0) {
			System.out.println("El elemento buscado esta en la posición " + indiceBusqueda);
		}else {
			System.out.println("el elemento buscado no se encuentra y debería ir en la posición " + (-indiceBusqueda-1));
		}
		
		
	}

}
