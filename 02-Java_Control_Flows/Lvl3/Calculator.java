import java.util.Scanner;
public class Calculator {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1=input.nextInt();
		System.out.print("Enter num2: ");
		int num2=input.nextInt();
		input.nextLine(); 
		System.out.print("Enter the operation: ");
		String opn=input.nextLine();
		switch (opn){
			case "+":
				System.out.println(num1+num2);
				break;
			case "-":
				System.out.println(num1-num2);
				break;
			case "*":
				System.out.println(num1*num2);
				break;
			case "/":
				System.out.println(num1/num2);
				break;
			default:
				System.out.println("Inavlid operator");
		}
	}
}