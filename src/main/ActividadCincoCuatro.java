package main;

public class ActividadCincoCuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla[] = {9,4,5,3,12,7,8};
		//maximo(tabla);
		System.out.println("El número mayor es " + maximo(tabla));
}
static int maximo(int tabla[]) {		
		
		int maximo = tabla[0];
		for (int e: tabla) {
			if (e > maximo) {
				maximo =e;
			}
		}
		return  maximo;
	}

}
