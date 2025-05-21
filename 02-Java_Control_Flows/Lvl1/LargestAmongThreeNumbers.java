import java.util.Scanner;
public class LargestAmongThreeNumbers {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1=input.nextInt();
		System.out.print("Enter num2: ");
		int num2=input.nextInt();
		System.out.print("Enter num3: ");
		int num3=input.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("Number 1 is greatest");
		}
		else{
			if (num2>num3){
				System.out.println("Number 2 is greatest");
			}
			else{
				System.out.println("Number 3 is greatest");
			}
		}
	}
}