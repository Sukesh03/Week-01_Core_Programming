import java.util.Scanner;
public class DoubleOperations {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter value of a: ");
		double a=input.nextDouble();
		System.out.print("Enter value of b: ");
		double b=input.nextDouble();
		System.out.print("Enter value of c: ");
		double c=input.nextDouble();
		double a1,a2,a3,a4;
		a1=a+b*c;
		a2=a*b+c;
		a3=c+a/b;
		a4=a%b+c;
		System.out.println("Operation 1: "+a1+" Operation 2: "+a2+"Operation 3: "+a3+" Operation 4: "+a4);
		input.close();
	}
}		