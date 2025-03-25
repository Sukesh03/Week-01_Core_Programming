import java.util.Scanner;
public class swap{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a num1: ");
		int a=input.nextInt();
		System.out.print("Enter a num2: ");
		int b=input.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a= "+a+" b= "+b);
		input.close();
	}
}