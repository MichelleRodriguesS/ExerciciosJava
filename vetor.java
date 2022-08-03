package aula4Exercicios;
import java.util.Scanner;

public class vetor {
	public static void main(String[] args) {
		Scanner x = new Scanner (System.in);
		String [] nomes = new String [5];
	
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println ("Digite o " + i + " ° nome ");
			nomes [i] = x.next ();
			
		}
		
		for (int i = 0; i < nomes.length; i ++) {
			System.out.println ( i + " - " + nomes [i]);
			System.out.println ( "_________________________");
			
		}
		
	}

}
