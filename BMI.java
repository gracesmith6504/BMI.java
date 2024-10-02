import java.util.Scanner;

public class CircleMetrics {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("What is the radius of the circle? ");
		double radius = input.nextDouble();
		input.close();

		double diameter = radius * 2;
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.println("For a circle of radius " + radius +
			"\n Diameter = " + diameter + "\n Circumference = " + circumference + 
			"\n Area = " + area );
	}
}
