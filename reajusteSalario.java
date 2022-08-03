package aula4Exercicios;
import java.util.Scanner;

public class reajusteSalario {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		String [] funcionario = new String [5];
		double [] salarios = new double [5];
		double porcentagem = 0;
		double novoSalario = 0;
		Double [] x = new Double [2];
		
		for  (int i = 0; i < 5; i++) {
			System.out.println ("Digite o nome do " + ( i + 1) + " ° funcionário");
			funcionario[i] = entradaDados.next(); 
			
			System.out.println("Digite o salário do " + ( i + 1) +" ° funcionário");
			salarios[i] = entradaDados.nextDouble(); 
			
			System.out.println("Digite a porcentagem a ser acrescida ao salário:");
			porcentagem = entradaDados.nextDouble();
			novoSalario = salarios[i] + ( salarios[i] * porcentagem/100);
			
			System.out.println(" O novo salário do funcionário é  " + novoSalario);
			
			entradaDados.close();
		}
		
		
		
	}

}
