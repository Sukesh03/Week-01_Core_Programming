import java.util.Scanner;
public class park{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter s1: ");
		double s1=input.nextDouble();
		System.out.print("Enter s2: ");
		double s2=input.nextDouble();
		System.out.print("Enter s3: ");
		double s3=input.nextDouble();
		double peri=s1+s2+s3;
		System.out.println("The total rounds: "+(5/(s1+s2+s3)));
		input.close();
	}
}