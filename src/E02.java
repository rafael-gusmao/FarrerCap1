import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {
		// Declara��o de vari�veis
		int i, contMulheres;
		double altura, maiorAltura, menorAltura, somaMulheres;
		char sexo;
		Scanner sc = new Scanner(System.in);
		
		// Inicializa��o de vari�veis
		maiorAltura = -1;
		menorAltura = 1000;
		somaMulheres = 0;
		contMulheres = 0;
		
		// Leitura da altura e sexo de 50 pessoas
		for(i = 0; i < 50; i++) {
			System.out.println("Digite a altura: ");
			altura = sc.nextDouble();
			System.out.println("Digite o sexo (M ou F): ");
			sexo = sc.next().charAt(0);
			
			// Atualiza maior altura
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			
			// Atualiza menor altura
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			
			if (sexo == 'F'){
				somaMulheres += altura;
				contMulheres++;
			}
		}
		
		// Imprime a sa�da
		System.out.printf("Maior altura: %.2f", maiorAltura);
		System.out.printf("Menor altura: %.2f", menorAltura);
		System.out.printf("M�dia de altura das mulheres: %.2f\n", somaMulheres/contMulheres);
		System.out.println("Total de homens: " + (50-contMulheres));
		
		sc.close();
	}

}
