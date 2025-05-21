import java.util.Scanner;
public class WeightInPounds {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter weight: ");
		double weight=input.nextDouble();
		double pound=weight/2.2;
		System.out.print("Weight in pounds: "+pound);
		input.close();
	}
}	