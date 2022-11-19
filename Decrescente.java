package Vetores;

import java.util.Scanner;

public class Decrescente {

	public static void main(String[] args) {
		int a[], b[], i2=9, i=0;
		final int CONS = 10;
		
		
		a = new int[CONS];
		b = new int [CONS];
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite uma sequência de dez núemros para ver o seu inverso");
		System.out.println(" ");
		while(i<CONS) {
			System.out.println("Digite o "+(i+1)+"° número");
			a[i] = leia.nextInt();
			b[i] = a[i];
			i++;
		}
		System.out.println();
		System.out.print("O inverso da sequência digitada é: (");
		for(i=0; i<9; i++) {
			System.out.print(b[i2]+", ");
			i2--;
			if(i2==0) {
				System.out.println(b[0]+")");
			}
		}

	}

}
