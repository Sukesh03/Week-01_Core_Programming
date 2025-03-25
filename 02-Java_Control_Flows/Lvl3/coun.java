import java.util.Scanner;
public class coun{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		int c=0;
		while(num!=0){
			c++;
			num=num/10;
		}
		System.out.print(c);
	}
}