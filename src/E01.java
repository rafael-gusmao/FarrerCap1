import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		// Declara��o de vari�veis
		double media;
		int cont, soma, idade;
		Scanner sc = new Scanner(System.in);
		
		// Inicializa��o de vari�veis
		cont = 0;
		soma = 0;
		idade = -1;
		
		// Leitura das idades
		while(idade != 0) {
			System.out.println("Digite a idade: ");
			idade = sc.nextInt();
			
		// Soma e contador s�o incrementados apenas se a idade for v�lida
			if (idade > 0) {
				soma += idade;
				cont++;
			}
		}
		
		// C�lculo e impress�o da m�dia das idades
		media = (double)soma/cont;
		System.out.println("M�dia das idades: " + media);
		sc.close();

	}

}
