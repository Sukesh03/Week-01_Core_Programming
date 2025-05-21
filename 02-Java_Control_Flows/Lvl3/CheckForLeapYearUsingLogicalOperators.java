import java.util.Scanner;
public class CheckForLeapYearUsingLogicalOperators {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		if (num%400==0 || num%4==0 && num%100!=0){
			System.out.print("Leap year");
		}
		else {
			System.out.print("Not a Leap year");
		}
	}
}