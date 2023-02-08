package main;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double datos[] = new double [10];
		System.out.println(datos);
		double datos2[] = datos;
		System.err.println(datos2);
		datos[2]=5.5;
		System.out.println(datos[2]+ "-" + datos2[2]);
		datos2[2]=6.5;
		System.err.println(datos[2]+ "-" + datos2[2]);
				
		
		
	}

}