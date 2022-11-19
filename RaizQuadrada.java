package Vetores;

import java.util.Scanner;

public class RaizQuadrada {

	public static void main(String[] args) {
		double a[], b[];
		Scanner leia = new Scanner (System.in);
		
		final int CONS = 10;
		
		a = new double [CONS];
		b = new double [CONS];
		
		for(int i=0; i<CONS;i++) {
			System.out.println("Escreva o "+(i+1)+"° número");
			a[i] = leia.nextInt();
		}
		
		for(int i=0; i<CONS;i++) {
			b[i] = Math.sqrt(a[i]);
			System.out.println("A raiz quadrada do "+(i+1)+"° número é "+b[i]);
		}

	}

}
