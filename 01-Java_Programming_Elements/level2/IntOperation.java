import java.util.Scanner;
public class IntOperation{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter value of a: ");
		int a=input.nextInt();
		System.out.print("Enter value of b: ");
		int b=input.nextInt();
		System.out.print("Enter value of c: ");
		int c=input.nextInt();
		int a1,a2,a3,a4;
		a1=a+b*c;
		a2=a*b+c;
		a3=c+a/b;
		a4=a%b+c;
		System.out.println("Operation 1: "+a1+" Operation 2: "+a2+"Operation 3: "+a3+" Operation 4: "+a4);
		input.close();
	}
}		