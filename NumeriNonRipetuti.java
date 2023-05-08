package lezione5;

import java.util.Scanner;

public class NumeriNonRipetuti {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		int[] numeri=new int [10];
		
		for(int i=0;i<10;i++) {
			System.out.println("Inserici un numero:");
			numeri[i]=scanner.nextInt();
		}
        
        for (int i = 0; i < numeri.length; i++) {
            
            boolean ripetuto = false;
            
            for (int j = 0; j < i; j++) {
                if (numeri[i] == numeri[j]) {
                    ripetuto = true;
                    break;
                }
            }
            if (!ripetuto) {
                for (int k = i + 1; k < numeri.length; k++) {
                    if (numeri[i] == numeri[k]) {
                        ripetuto = true;
                        break;
                    }
                }
            }
            if (!ripetuto) {
                System.out.print(numeri[i]+ " ");
            }
        }
		scanner.close();
	}
}
