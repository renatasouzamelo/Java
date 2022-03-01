package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		//System.out.println(2 + 3);
		double raio =3.4;
		final double Pi = 3.14159;
		
		//final torna a variável constante;
		
		double resultado = Pi * raio * raio;
		
		System.out.println(resultado);
		
		raio = 10;
		resultado = Pi * raio * raio;
		
		System.out.println("A área é de:" + resultado + "m2");
		//acima concatenar;
	}

}
