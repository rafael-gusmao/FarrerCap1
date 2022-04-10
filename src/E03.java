
public class E03 {

	public static void main(String[] args) {
		// Declaração de variáveis
		double c, f;
		
		// Conversão de Fahrenheit para Celsius
		for(f = 50; f <= 150; f++) {
			c = (f-32)*5/9;
			System.out.printf("%.0fºF = %.2fºC\n", f, c);
			
		}		

	}

}
