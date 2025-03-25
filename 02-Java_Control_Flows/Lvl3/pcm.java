import java.util.Scanner;
public class pcm{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter marks in maths: ");
		double maths=input.nextDouble();
		System.out.print("Enter marks in physics: ");
		double phy=input.nextDouble();
		System.out.print("Enter marks in chemmistry: ");
		double chem=input.nextDouble();
		double perc=(maths+phy+chem)*100/300;
		System.out.println("Percentage: "+perc);
		if (perc>=80){
			System.out.print("Grade: A\nRemarks:Level 4,above agency-normalized standards");
		}
		else if(perc<80 && perc>=70){
			System.out.print("Grade: B\nRemarks:Level 3,at agency-normalized standards");
		}
		else if(perc<70 && perc>=60){
			System.out.print("Grade: C\nRemarks:Level 2,below agency-normalized standards");
		}
		else if(perc<60 && perc>=50){
			System.out.print("Grade: D\nRemarks:Level 1,well below agency-normalized standards");
		}
		else if(perc<50 && perc>=40){
			System.out.print("Grade: E\nRemarks:Level 1-,too below agency-normalized standards");
		}
		else{
			System.out.print("Grade: R\nRemarks: Remedial standards");
		}
	}
}