package application;
import java.util.Scanner;
import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println(student);
		System.out.print(student.result());
		
		sc.close();
	}

}
