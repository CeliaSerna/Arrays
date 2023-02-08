package main;

import java.util.Arrays;

public class Primitiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

static int primitiva (int apuesta[], int  conbinacionGanadora[]) {
	int aciertos =0;
	
	for (int a: apuesta) {
		if (Arrays.binarySearch(conbinacionGanadora, a) >=0) {
			aciertos++;
		}
	}
return (aciertos);
}
}
