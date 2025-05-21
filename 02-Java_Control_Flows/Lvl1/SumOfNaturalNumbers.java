import java.util.Scanner;
public class SumOfNaturalNumbers {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		if (num>0){
			int sum=num*(num+1)/2;
			System.out.println("The sum is: "+sum);
		}
		else{
			System.out.println("The number is not a natural number");
		}
	}
}