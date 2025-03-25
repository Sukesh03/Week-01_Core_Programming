import java.util.Scanner;
public class sumnaf{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double sum=0;
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		for (int i=num;num>0;num--){
			sum+=num;
		}
		System.out.print("Sum: "+sum);
	}
}