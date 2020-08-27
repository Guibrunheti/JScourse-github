package application;

import java.util.*;
import entities.Employee;

public class ProgramList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("How many emplyees will be registered?");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Employee #" + (i + 1) +":");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}
		System.out.println("Wich salary will receive a salary increase?");
		int idsalary = sc.nextInt();
		
		Integer pos = position(list, idsalary);
		
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of Employees");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}