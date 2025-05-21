import java.util.Scanner;
public class FactorialOfNumberUsingWhileLoop {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		double fact=num;
		while (fact>1){
			fact--;
			num*=fact;	
		}
		System.out.print("Factorial: "+num);
	}
}