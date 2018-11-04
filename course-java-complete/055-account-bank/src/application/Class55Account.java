// Versão Professorn
package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Class55Account {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account dataCount;
		
		System.out.print("Enter account number: ");
		int count = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String name = sc.next();

		System.out.print("Is there na initial deposit (y/n): ");
		char flag = sc.next().charAt(0);
		
		double initialCredit;
		if (flag == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialCredit = sc.nextDouble();
			dataCount = new Account(count, name, initialCredit);
			
		} else {
			dataCount = new Account(count, name);

		}	

		System.out.println();
		System.out.println("Account data: ");
		System.out.println("Account: " + dataCount.getCount() + ", Holder: " + dataCount.getName() + ", Balance: $ " + dataCount.getBalance());

		System.out.println();
		System.out.print("Enter a deposit value: ");
		dataCount.addCredit(sc.nextDouble());
		System.out.println();
		
		System.out.println("Updated account data: ");
		System.out.println("Account: " + dataCount.getCount() + ", Holder: " + dataCount.getName() + ", Balance: $ " + dataCount.getBalance());
		
		System.out.print("Enter a withdraw value: ");
		dataCount.addDebit(sc.nextDouble());
		System.out.println();
		
		System.out.println("Updated account data: ");
		System.out.print("Account: " + dataCount.getCount() + ", Holder: " + dataCount.getName() + ", Balance: $ " + dataCount.getBalance());

		sc.close();
	}	
}



/* Versão Ailton
 * package Application;
import java.util.Locale;
import java.util.Scanner;
import entities.AccountAula55;

public class Aula55 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int count = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String name = sc.next();

		System.out.print("Is there na initial deposit (y/n): ");
		char flag = sc.next().charAt(0);
		
		double initialCredit;
		if (flag == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialCredit = sc.nextDouble();
			
		} else {
			initialCredit = 0.00;
			
		}	

		AccountAula55 dataCount = new AccountAula55(count, name, initialCredit);

		dataCount.setCount(count);
		System.out.println();
		System.out.println("Account data: ");
		System.out.println("Account: " + dataCount.getCount() + ", Holder: " + dataCount.getName() + ", Balance: $ " + dataCount.getBalance());

		System.out.println();
		System.out.print("Enter a deposit value: ");
		dataCount.addCredit(sc.nextDouble());
		System.out.println();
		
		System.out.println("Updated account data: ");
		System.out.println("Account: " + dataCount.getCount() + ", Holder: " + dataCount.getName() + ", Balance: $ " + dataCount.getBalance());
		
		System.out.print("Enter a withdraw value: ");
		dataCount.addDebit(sc.nextDouble());
		System.out.println();
		
		System.out.println("Updated account data: ");
		System.out.print("Account: " + dataCount.getCount() + ", Holder: " + dataCount.getName() + ", Balance: $ " + dataCount.getBalance());

		sc.close();
	}	
}

*/
