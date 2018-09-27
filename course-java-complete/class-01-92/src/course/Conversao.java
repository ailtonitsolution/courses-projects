package course;

public class Conversao {
	int a, b; double result;
	
	public double resultado () {
		result = (double) a / b;  //Conversão de inteiro para float ou double, Note: entre () significa casting... não funciona para tipos não compatíveis String para Int
		
		return result;
		
	}
}

