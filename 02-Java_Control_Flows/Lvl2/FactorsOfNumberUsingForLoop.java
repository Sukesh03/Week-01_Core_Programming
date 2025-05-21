import java.util.Scanner;
public class FactorsOfNumberUsingForLoop {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=input.nextInt();
		if (num>0){
			for (int i=1;i<=num;i++){
				if (num%i==0){
					System.out.println(i);
				}
			}
		}
		else {System.out.println("Enter a positive number");};
	}
}