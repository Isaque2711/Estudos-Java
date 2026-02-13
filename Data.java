package data;

import java.text.DateFormat;
import java.util.Date; // Import para pegar a hora
import java.util.Locale;
import java.util.Scanner; // Import para ler o que você digita

public class Data {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);// 1. Criamos o "leitor" de teclado (como o input do Python)
		
		Date relogio = new Date(); // 2. Criamos o objeto de data
		
		int hora = relogio.getHours(); // 3. Pegamos apenas a hora atual (de 0 a 23)
		
		System.out.print("Digite seu nome: ");
		String nome = leitor.nextLine(); // Aqui o programa "pausa" e espera você digitar
		
		String saudacao; // 5. Lógica da Saudação (o famoso IF/ELSE)
        if (hora >= 5 && hora < 12) {
            saudacao = "Bom dia";
        } else if (hora >= 12 && hora < 18) {
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }
		
		Locale brasil = new Locale("pt", "BR");
		
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		
		System.out.println("\n--- Assistente Java ---"); // 7. Resultado Final
        System.out.println("Olá, " + nome + "! " + saudacao + ".");
        System.out.println("Hoje é " + formatador.format(relogio));
        
        leitor.close();// Fechamos o leitor (boa prática)
	}

}
