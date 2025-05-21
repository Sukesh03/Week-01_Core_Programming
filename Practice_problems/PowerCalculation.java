import java.util.Scanner;

public class PowerCalculation {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the base: ");
		double base=sc.nextDouble();
		
		System.out.print("Enter the exponent: ");
		double exp=sc.nextDouble();
		
		double ans=Math.pow(base,exp);
		System.out.println("The calculation result is: "+ans);
		
		sc.close();
	}
}		