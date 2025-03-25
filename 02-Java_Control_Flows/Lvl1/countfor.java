import java.util.Scanner;
public class countfor{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		for (int i=num;i>0;i--){
			System.out.println(i);
		}
	}
}