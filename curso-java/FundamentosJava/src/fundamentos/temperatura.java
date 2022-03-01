package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		// (˚F -32) * 5/9 = ˚C	
		
		final double fator = 5.0/9;
		final int ajuste = 32;
		
		double fahrenheit = 86;
		double resultado = (fahrenheit - ajuste) * fator;
		System.out.println("O resultado da conversao de fahrenheit para Celsios é de:" + resultado+ "C˚");
		
		
		fahrenheit = 40;
		resultado = (fahrenheit - ajuste) * fator;
		System.out.println("O resultado da conversao de fahrenheit para Celsios é de:" + resultado+ "C˚");
	}

}
