package application;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.EmployeeId;

public class ProgramEmployeeId {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		List<EmployeeId> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Emplyoee #%d:%n", i);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new EmployeeId(id, name, salary));
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase :");
		int id = sc.nextInt();
		EmployeeId emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (EmployeeId obj : list) {
			System.out.println(obj);
		}
		
		
		
		sc.close();}

		public static boolean hasId(List<EmployeeId> list, int id) {
			EmployeeId emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			return emp != null;
		
		}

	}
