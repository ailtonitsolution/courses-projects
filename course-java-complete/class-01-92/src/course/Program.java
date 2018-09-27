package course;

import java.util.Locale;
import java.util.Scanner;
import course.Conversao;	


class Teste{
	String nome = "Ailton";
	
	public String retornaNome() {
		return nome;
	}	
}


public class Program {
	public static void main(String[] args) {
		
		/* Desde o início
		
		// External Class Test () 
		Conversao tt = new Conversao();
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
		
		
		// Calc Test------------------------------------- 
		int a, b;
		double result;
		
		a = 5;
		b = 2;
		result = (double) a / b;

		System.out.println(result);
		
		
		// For loop test (Book) -------------------------
		int count;
		
		for(count = 0; count < 5; count ++) {
			System.out.println("This count is " + count);
		}
		
		
		// Boolean type test (Book) ---------------------
		boolean bb;
		
		bb = true;		
		
		if(bb) System.out.println("Ailton");
		
		
		// Escape Test (Book) ----------------------------
		System.out.println("First line\nSecond line");
		System.out.println("A\tB\tC");
		System.out.println("D\tE\tF");
		
		
		// Variable Test, Block Scope (Book) --------------
		int x;
		x = 10;
		
		if(x == 10) {
			
			//int y;
			//y = 20;
			
			System.out.println(x);
		}

		//System.out.println(y); // This line with error because it is out of scope if ()
		
		
		
		// Variable declared in the intern and extern scope with the same name (sample book)
		// *** int count;
		
		for(count = 0 ; count < 5 ; count++) {
			System.out.println("This is count: "+count);
			
			//*** int count; //inválido
			for(count = 0 ; count < 5 ; count++) {
				System.out.println("This program is in error!");
			}
			
		}
		
		
		// Aritmetics operators,  division rest (Sample Book)
		int isresult, irem;
		double dresult, drem;
		
		isresult = 10 / 3;
		irem     = 10 % 3;
		
		dresult  = 10.0 / 3.0;
		drem     = 10.0 % 3.0;
		
		System.out.println("Division: " + isresult);
		System.out.println("Rest Division: " + irem);
		
		System.out.println("Division: " + dresult);
		System.out.println("Rest Division: " + drem);
		

		// Demonstrates relational and logical operators (Sample Book)
		int i, j;
		boolean b1, b2;
		
		i = 10;
		j = 11;
		if(i < j) System.out.println("i < j");
		if(i <= j) System.out.println("i <= j");
		if(i != j) System.out.println("i != j");
		if(i == j) System.out.println("i == j");
		if(i >= j) System.out.println("i >= j");
		if(i > j) System.out.println("i > j");
		
		b1 = true;
		b2 = false;
		if(b1 & b2) System.out.println("This won't execute");
		if(!(b1 & b2)) System.out.println("!(b1 & b2) is true");
		if(b1 | b2) System.out.println("(b1 | b2) is true");
		if(b1 ^ b2) System.out.println("b1 ^ b2 is true");
		
		
		// Test print with parameters use .printf() not .println()
		char   gender  = 'F';
		int    age     = 32;
		double balance = 10.35874;
		String name2   = "Maria";
		
		System.out.print("Good Morning !!"); // Print message without carriage return
		System.out.println("Good Morning !!"); // Print message with carriage return   
		System.out.printf("%s tem %s years old\n", name2, age); // Print message with parameters
		System.out.printf("%.2f%n", balance); // Recomendation %n all plataform
		System.out.printf("%.4f%n", balance); //
		Locale.setDefault(Locale.US); // Print values with . according to locale
		System.out.printf("%.4f%n", balance); //
		System.out.printf("%s tem %s years old sexo %s tem %.2f bitcoins %n", name2, age, gender, balance); // Print message with parameters
		
		
		// Test Concatenation operators -------------------
		double n1 = 10;
		double n2 = 30;
		String s  = "ABC";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		System.out.println("---------------");
		
		n1 *= 2;
		n2 += n1;
		s  += "DEF";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		*/
		
		/* Section 2, class 20
		
		// Reading words and sentences 
		Scanner scnovo = new Scanner(System.in);  // Descomentar esta linha para executar, conflito do scanner no bloco acima
		String sentence = scnovo.nextLine();	   // Descomentar esta linha para executar, conflito do scanner no bloco acima	
		
		String c, d, e;
		c = scnovo.next();
		d = scnovo.next();
		e = scnovo.next();
		
		System.out.println(sentence);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		c = scnovo.next();
		d = scnovo.next();
		e = scnovo.next();
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		scnovo.close();   // Descomentar esta linha para executar, conflito do scanner no bloco acima
		*/
		 
		
		/* Section 2, class 21
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc. nextInt();
		sc.nextLine(); // This line was added because of nextInt()
		String name = sc.nextLine(); // Bob Brown
		char gender = sc.next().charAt(0); //F
		// b5
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		// 4.32
		double n2 = sc.nextDouble();
		// Maria F 23 1.68
		String name2 = sc.next();
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();	
		*/
		
		/* Section 2, class 22
		 
		String original = "abcd FGHIJ ABC abc DEFG   ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a','x');
		String s07 = original.replace("abc","xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("original: "+original+"-");
		System.out.println("toLowCase: "+s01+"-");
		System.out.println("toUpperCase: "+s02+"-");
		System.out.println("trim: "+s03+"-");
		System.out.println("substring(2): "+s04+"-");
		System.out.println("substring(2,9): "+s05+"-");
		System.out.println("replace(a,x): "+s06+"-");
		System.out.println("replace(abc,xy): "+s07+"-");
		System.out.println("indexOf: "+i);
		System.out.println("indexOf: "+j);
		*/
		
		
		/* Section 2, class 22
		
		String c = "Morango Laranja Limão";
		String[] vetor = c.split(" ");
		
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		*/


		/* Section 2, class 23
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What time is it ?");
		int time = sc.nextInt();
		
		if (time < 12) {
			System.out.println("Good Morning !!!");
			
		} else { if (time <18) {
			System.out.println("Good Afternoon !!!");
			
		} else
			System.out.println("Good Night !!!");
		
		}
		
		sc.close();	
		*/
		
		
		/* Section 2 - Exercice
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1);
			
		} else { if(n2 > n3) {
			System.out.println(n2);
			
		} else
			System.out.println(n3);
		
		}		
		
		sc.close();
	   */
		
		
		/* Section 2, class 24 
		  
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String day;
		
		if (x == 1) {
		day = "Sunday";
		}
		else if (x == 2) {
		day = "Monday";
		}
		else if (x == 3) {
		day = "Tuesday";
		}
		else if (x == 4) {
		day = "Wednesday";
		}
		else if (x == 5) {
		day = "Thursday";
		}
		else if (x == 6) {
		day = "Friday";
		}
		else if (x == 7) {
		day = "Saturday";
		}
		else {
		day = "Invalid value";
		} 
		System.out.println("Day: " + day);		
		
				
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String day;
		
		switch (x) {
		case 1:
		day = "Sunday";
		break;
		case 2:
		day = "Monday";
		break;
		case 3:
		day = "Tuesday";
		break;
		case 4:
		day = "Wednesday";
		break;
		case 5:
		day = "Thursday";
		break;
		case 6:
		day = "Friday";
		break;
		case 7:
		day = "Saturday";
		break;
		default:
		day = "Invalid value";
		}
		System.out.println("Day: " + day);
		*/
		
		
		/* Section 2 class 25
		
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20)?preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
		
		sc.close();
		*/		
		

		/* Section 2 class 26
		
		double preco = 400;
		double desconto;
		
		if(preco < 20) {
			desconto = preco * 0.1;
			
		}else{
			desconto = 0;
		}
		
		System.out.println(desconto); // se a var desconto não receber valor, system... ia dar erro
		
		*/
		
		
		/* Section 2 class 27
		
		//
		
		*/
		
		
		
		/* Section 2 class 28 - Functions
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		
		showHigher(higher);
		
			
		sc.close();
		
		*/
		
		
		
	}
	
	public static int max(int x, int y, int z) {
		int aux;

		if (x > y && x > z) {
			aux = x;
			
		} else { if(y > z) {
			aux = y;
			
		} else
			aux = z;
		
		}		

		return aux;
		
	}

	
	public static void showHigher(int value) {
		System.out.println("Higher " + value); 
		
	}
	
}