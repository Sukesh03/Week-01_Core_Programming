import java.util.Scanner;
public class program11{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number: ");
		float number1=input.nextFloat();
		System.out.print("Enter second number: ");
		float number2=input.nextFloat();
		float addition=number1+number2;
		float subtraction=number1-number2;
		float multiplication=number1*number2;
		float division=number1/number2;
		System.out.println("Addition:"+addition+" Subtraction:"+subtraction+" Multiplication:"+multiplication+" Division:"+division);
		input.close();
	}
}	