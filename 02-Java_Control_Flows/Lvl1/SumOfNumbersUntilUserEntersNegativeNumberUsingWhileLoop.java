import java.util.Scanner;
public class SumOfNumbersUntilUserEntersNegativeNumberUsingWhileLoop {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double sum=0;
		while (true){
			System.out.print("Enter a number: ");
			int num=input.nextInt();
			if (num==0 || num<0) break;
			sum+=num;
		}
		System.out.println("Sum: "+sum);
	}
}