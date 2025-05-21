import java.util.Scanner;
public class DivisibleByFive {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		if (num%5==0){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		input.close();
	}
}