import java.util.Scanner;
public class smallest{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1=input.nextInt();
		System.out.print("Enter num2: ");
		int num2=input.nextInt();
		System.out.print("Enter num3: ");
		int num3=input.nextInt();
		if (num1<num2 && num1<num3){
			System.out.println("First number is smallest");
		}
		else{
			System.out.println("First number is not smallest");
		}
	}
}