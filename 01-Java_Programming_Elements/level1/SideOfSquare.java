import java.util.Scanner;
public class SideOfSquare {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the perimeter of the square: ");
		double perimeter=input.nextDouble();
		System.out.println("The side of the square: "+perimeter/4);
		input.close();
	}
}