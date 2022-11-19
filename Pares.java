package Vetores;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		int a[], b[], soma=0, i=0;
		
		final int CONS = 10;
		
		a = new int [CONS];
		b = new int [CONS];
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite uma sequência de dez números para saber quantos são par");
		System.out.println();
		
		while(i<=9) {
			System.out.println("Digite o "+(i+1)+"° número");
			a[i] = leia.nextInt();
			if(a[i] % 2 == 0) {
				b[soma] = a[i];
				soma = soma+1;
			}
			i++;
			if(i==10) {
				System.out.println();
				if(soma==0) {
					System.out.println("Não há números pares na sequência");
				}
				else if(soma==1) {
					System.out.print("Há 1 número par, a saber: ");
					for(int i2=0;i2<soma;i2++) {
						System.out.print(b[i2]+" ");
					}
				}
				else {
					System.out.print("Há "+soma+" números pares, a saber: ( ");
					for(int i2=0;i2<soma;i2++) {
						System.out.print(b[i2]+" ");
						}
					System.out.println(")");
				}
			}
		}
	}
}
