package main;

public class BusquedaSecuencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int datos[]= {45, 34,23,3456,2345,3,546};
	int elementoBuscado=34;
	int indiceBusqueda=0;
	while(indiceBusqueda <datos.length) {
	System.out.println("vuelta " + indiceBusqueda + " valor del elemento " + datos[indiceBusqueda]);
	if (elementoBuscado==datos[indiceBusqueda]) {
		System.out.println("el elemento buscado está en la posición " + indiceBusqueda);
	}
	indiceBusqueda++;
	
	}
		
		
	}

}
