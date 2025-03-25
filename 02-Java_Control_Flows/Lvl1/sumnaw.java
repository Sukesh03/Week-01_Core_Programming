import java.util.Scanner;
public class sumnaw{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double sum=0;
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		while (num>0){
			sum+=num;
			num--;
		}
		System.out.print("Sum: "+sum);
	}
}