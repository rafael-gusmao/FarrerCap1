import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		// Declaração de variáveis
		double media;
		int cont, soma, idade;
		Scanner sc = new Scanner(System.in);
		
		// Inicialização de variáveis
		cont = 0;
		soma = 0;
		idade = -1;
		
		// Leitura das idades
		while(idade != 0) {
			System.out.println("Digite a idade: ");
			idade = sc.nextInt();
			
		// Soma e contador são incrementados apenas se a idade for válida
			if (idade > 0) {
				soma += idade;
				cont++;
			}
		}
		
		// Cálculo e impressão da média das idades
		media = (double)soma/cont;
		System.out.println("Média das idades: " + media);
		sc.close();

	}

}
