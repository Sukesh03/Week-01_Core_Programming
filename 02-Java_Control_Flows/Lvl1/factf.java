import java.util.Scanner;
public class factf{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int fact=input.nextInt();
		for (int i=fact-1;i>0;i--){
			fact*=i;	
		}
		System.out.print("Factorial: "+fact);
	}
}