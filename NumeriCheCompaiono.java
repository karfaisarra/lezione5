package lezione5;

import java.util.Scanner;

public class NumeriCheCompaiono {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		int[] numeri=new int [10];
		int maxNumero=0, maxCount=0;
		
		for(int i=0;i<10;i++) {
			System.out.println("Inserisci un numero: ");
			numeri[i]=scanner.nextInt();
		}
		
		for(int i=0;i<numeri.length;i++) {
			int numero = numeri[i];
			int count=1;
			
			if(numero==maxNumero) {
				continue;
			}
			
			for(int j=i+1; j<numeri.length;j++) {
				if(numeri[j]==numero) {
					count++;
				}
			}
			
			if(count>maxCount) {
				maxNumero = numero;
                maxCount = count;
			}
		}
		System.out.println("Il numero che compare più volte è " + maxNumero);
		scanner.close();
	}
}
