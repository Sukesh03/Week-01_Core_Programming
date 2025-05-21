import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length: ");
		double length=sc.nextDouble();
		System.out.print("Enter the width: ");
		double width=sc.nextDouble();
		double peri=2*(length+width);
		System.out.println("The perimeter is: "+peri);
		sc.close();
	}
}