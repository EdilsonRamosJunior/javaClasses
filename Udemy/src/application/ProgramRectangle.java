package application;
import java.util.Scanner;
import entities.Rectangle;


public class ProgramRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		
		rec.width = sc.nextDouble();
		rec.heigth = sc.nextDouble();
		System.out.printf("Area: %.2f%n", rec.area());
		System.out.printf("Perimeter: %.2f%n", rec.perimeter());
		System.out.printf("Diagonal: %.2f%n", rec.diagonal());
		
		sc.close();
	}

}
