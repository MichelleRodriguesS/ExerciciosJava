package aula4Exercicios;
import java.util.Scanner;
public class exeWhile {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double preço = 0;
	boolean escolha = true;
	
	
	System.out.println("Digite o produto a ser cadastrado : ");
	String produto = entrada.next();
	
	System.out.println("Digite o valor do produto: ");
	preço = entrada.nextDouble();
	System.out.println("Você cadastrou" + produto + preço);
	
	System.out.println(" Digite (1) para cadastrar e (0) para sair. ");
	do { 
		
		System.out.println("Você cadastrou" + produto  +  preço);
		
		
	}while (escolha); 
	
		
		
	}

}