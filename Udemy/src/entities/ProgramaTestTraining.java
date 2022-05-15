package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import application.TestTraining;

public class ProgramaTestTraining {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<TestTraining> list = new ArrayList<>();
		
		System.out.print("Quantas perguntas? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Telefone: ");
			Integer phone = sc.nextInt();
			
			list.add(new TestTraining(id, name, phone));
		}
		
		for(TestTraining obj : list) {
			System.out.println(obj);
		}
	}

}
