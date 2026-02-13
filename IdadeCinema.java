package idadecinema;

import java.time.LocalDate; // Importa a classe para lidar com datas modernas
import java.time.Period; // Importa a classe que calcula o tempo entre duas datas
import java.util.Scanner; // Importa o leitor de teclado

public class IdadeCinema {
	
	public static void main(String[]args ) { 
		// Criamos o 'leitor' para capturar o que for digitado no console
		Scanner leitor = new Scanner(System.in); 
		
		System.out.print("Digite seu nome: "); // 1. Perguntar o nome
		String nome = leitor.nextLine();
		
		LocalDate hoje = LocalDate.now(); // Pega a data exata de HOJE do relógio do seu computador
		
		System.out.println("------- Data de nascimento ------- "); // 2. Perguntar a data de nascimento
		System.out.print("Dia: ");
		int dia = leitor.nextInt(); // Lê um número inteiro para o dia
		System.out.print("Mês: ");
		int mes = leitor.nextInt(); // Lê um número inteiro para o mês
		System.out.print("Ano: ");
		int ano = leitor.nextInt(); // Lê um número inteiro para o ano
		
		LocalDate nascimento = LocalDate.of(ano, mes, dia); // Criamos um objeto de data 'nascimento' usando os números que você digitou
		int idade = Period.between(nascimento, hoje).getYears(); // A 'mágica': Period.between compara o nascimento com hoje e .getYears() extrai só os anos
		
		System.out.println("\nOlá, " + nome + "! Você tem exatamente " + idade + " anos de idade."); // O '\n' serve para pular uma linha antes de mostrar o resultado
		
		if (idade >= 18) { // Estrutura de decisão (Se a idade for 18 ou maior...)
			System.out.println("Entrada liberada! Parabéns pela maioridade.");
		} else {
			System.out.println("Entrada negada. Volte quando tiver 18 anos!");
		}
		
		leitor.close(); // Encerra o leitor para liberar os recursos do Windows
		
		
	}
	
 } 
