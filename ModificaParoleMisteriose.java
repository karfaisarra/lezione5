package lezione5;

import java.util.Scanner;

public class ModificaParoleMisteriose {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		String[] parole= {"cane", "gatto", "topo", "criceto", "pesce"};
		boolean indovinato=false;
		int index=0;
		
		for(int i=0; i<3;i++) {
			System.out.println("Inserisci una parola:");
		    String parola = scanner.nextLine();
			    
		    for(int j=0; j<parole.length;j++) {
		    	if (parola.equalsIgnoreCase(parole[j])) {
		            System.out.println("Indovinato!");
		            indovinato=true;
		            index=j;
		            break;
		        }
		    }
		    if(!indovinato) {
		    	System.out.println("Sbagliato!");
		    }else {
		    	break;
		    }
		}
		if(!indovinato) {
			System.out.println("Tentativi esauriti");			
		}
		System.out.print("Le parole misteriose erano: ");
		for(int i=0; i<parole.length;i++) {
			if(i!=index) {
				System.out.print(parole[i]+ " ");
			}
		}
		scanner.close();
	}
}
