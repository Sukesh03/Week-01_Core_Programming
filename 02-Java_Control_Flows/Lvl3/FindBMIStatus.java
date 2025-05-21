import java.util.Scanner;
public class FindBMIStatus {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter weight: ");
		double wt=input.nextDouble();
		System.out.print("Enter height: ");
		double ht=input.nextDouble();
		double bmi=wt/(ht/100*ht/100);
		if (bmi<=18.4){
			System.out.println("Underweight");
		}
		else if (bmi>=18.5 && bmi<25){
			System.out.println("Normal");
		}
		else if (bmi>=25 && bmi<40){
			System.out.println("Overweight");
		}
		else{
			System.out.println("Obese");
		}
	}
}