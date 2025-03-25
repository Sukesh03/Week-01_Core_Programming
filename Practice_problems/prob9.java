import java.util.Scanner;
public class prob9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first num: ");
		double first=sc.nextDouble();
		System.out.print("Enter the second num: ");
		double second=sc.nextDouble();
		System.out.print("Enter the third num: ");
		double third=sc.nextDouble();
		double avg= (first+second+third)/3;
		System.out.println("The average of three numbers is: "+avg);
		sc.close();
	}
}	