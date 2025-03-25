import java.util.Scanner;
public class prime{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		boolean isprime=false;
		int c=0;
		for (int i=2;i<num;i++){
			if (num%i==0){
				c++;
			}
		}
		if (c==0){
			isprime=true;
		}
		System.out.println(isprime);
	}
}