
public class E03 {

	public static void main(String[] args) {
		// Declara��o de vari�veis
		double c, f;
		
		// Convers�o de Fahrenheit para Celsius
		for(f = 50; f <= 150; f++) {
			c = (f-32)*5/9;
			System.out.printf("%.0f�F = %.2f�C\n", f, c);
			
		}		

	}

}
