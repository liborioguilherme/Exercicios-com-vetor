package Vetores;

import java.util.Scanner;

public class MenorMaior {

	public static void main(String[] args) {
		int a[], menor=1, maior=1, i=0;
		final int CONS = 10;
		Scanner leia = new Scanner(System.in);
		
		a = new int [CONS];
		
		while(i<CONS) {
			System.out.println("Informe o "+(i+1)+"° número");
			a[i] = leia.nextInt();
			if(a[i]>maior) {
				maior = a[i];
				if(i==0) {
					menor = maior;
				}
			}
			if(a[i]<maior){
				menor = a[i];
			}
			if(a[i]<menor) {
				menor = a[1];
			}
			i++;
		}
		System.out.println();
		System.out.println("O menor número é: "+menor);
		System.out.println("O maior número é: "+maior);
	}

}
