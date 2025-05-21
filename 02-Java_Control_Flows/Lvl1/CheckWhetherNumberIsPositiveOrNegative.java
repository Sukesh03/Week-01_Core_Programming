import java.util.Scanner;
public class CheckWhetherNumberIsPositiveOrNegative {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		if (num>0){
			System.out.print("Positive");
		}
		else if (num<0){
			System.out.print("Negative");
		}
		else{
			System.out.print("Zero");
		}
	}}