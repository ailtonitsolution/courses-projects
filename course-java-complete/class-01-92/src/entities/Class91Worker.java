package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import entities.enums.Class91WorkerLevel;

public class Class91Worker {

	private String name;
	private Class91WorkerLevel level;
	private Double baseSalary;
	
	private Class91Department department;
	private List<Class91HourContract> contracts = new ArrayList<>();
	
		
	public Class91Worker() {
	}

	public Class91Worker(String name, Class91WorkerLevel level, Double baseSalary, Class91Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Class91WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(Class91WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Class91Department getDepartment() {
		return department;
	}

	public void setDepartment(Class91Department department) {
		this.department = department;
	}

	public List<Class91HourContract> getContracts() {
		return contracts;
	}

	public void addContract(Class91HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(Class91HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (Class91HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}