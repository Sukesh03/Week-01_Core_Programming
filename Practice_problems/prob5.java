import java.util.Scanner;

public class prob5{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the radius of the cyl: ");
		double radius=scanner.nextDouble();
		System.out.print("Enter the height of the cyl: ");
		double height=scanner.nextDouble();
		
		double volume=Math.PI*Math.pow(radius,2)*height;
		System.out.println("Volume of the cyl: "+volume);
		scanner.close();
	}
}