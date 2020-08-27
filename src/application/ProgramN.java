package application;

import entities.EmployeeN;
import java.util.*;

public class ProgramN {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many many employees will be registred: ");
		int n = sc.nextInt();
		List<EmployeeN> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee" + (i + 1) + "# ");
			System.out.println("Insert name: ");
			String name = sc.next();
			System.out.println("Insert Id: ");
			sc.nextLine();
			int id = sc.nextInt();
			System.out.println("Insert salary");
			double salary = sc.nextDouble();

			EmployeeN emp = new EmployeeN(id, name, salary);

			list.add(emp);
		}
		System.out.println("Wich Employee will receive a Increasement? ");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);

		if (pos == null) {
			System.out.println("ID does not exist!");

		} else {
			System.out.println("wich percent: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println("List of Employees: ");
			for (EmployeeN emp  : list) {
				System.out.println(emp);
			}
			
		sc.close();
	}

	public static Integer position(List<EmployeeN> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
