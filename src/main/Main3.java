package main;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//actividad resuelta 5.1
int aleatorios[];
aleatorios = new int [10];

for (int i = 0; i < aleatorios.length; i++) {
	aleatorios[i] = (int)(Math.random()*100+1);
	System.out.println(aleatorios[i]);
}

int suma = 0;		
for (int valor : aleatorios) {
	suma += valor;
}
	System.out.println("La suma de los valores aleatorios es " + suma);
		
	}

}

