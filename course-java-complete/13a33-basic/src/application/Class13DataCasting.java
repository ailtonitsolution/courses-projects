package application;
import java.util.Scanner;

class Teste{
	String nome = "Ailton";
	
	public String retornaNome() {
		return nome;
	}	
}


public class Class13DataCasting {

	public static void main(String[] args) {
		Class13DataCastingConvertion tt = new Class13DataCastingConvertion();
		tt.a = 1;
		tt.b = 2;
		System.out.println("Resultado agora foi -> " + tt.resultado());
				

		// Print Test------------------------------------
		Scanner sc = new Scanner(System.in);
		Teste   ts = new Teste();
		
		System.out.println(ts.retornaNome());		
				
		String name = "Maria Green";
		Object objname = "Maria Green 2";
		
		System.out.println("Hello Word !");
		
		System.out.println(name);
		System.out.println(objname);
		
		sc.close();

	}

}
