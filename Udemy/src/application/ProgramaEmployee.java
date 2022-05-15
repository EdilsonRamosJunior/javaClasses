package application;
import java.util.Scanner;
import entities.Employee;

public class ProgramaEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		emp.grossSalary = sc.nextDouble();
		emp.tax = sc.nextDouble();
		
		System.out.print("Employee: ");
		System.out.println(emp);
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.print("Update data: ");
		System.out.println(emp);
		
		sc.close();

	}

}
