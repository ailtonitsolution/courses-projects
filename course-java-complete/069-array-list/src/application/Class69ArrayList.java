package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Class69ArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Employee> result = new ArrayList<>();
		
		System.out.print("How many employees will be registred ? ");
		int n = sc.nextInt();
				
		for(int i = 0; i < n ; i++) {
			System.out.println();
			System.out.println("Employee #"+ i+ ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			result.add(new Employee(id, name, salary));
			
		}
		
		System.out.println();		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		Employee emp = result.stream().filter(x -> x.getId()== id).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id does not exist !");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			
		}
		
		System.out.println();
		
		System.out.println("List of Employees");
		
		for(Employee obj : result) {
			System.out.println(obj);
			
		}
		sc.close();
	}

}
