import java.util.Scanner;
public class CountToOneUsingWhileLoop {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		while (num>=1){
			System.out.println(num);
			num-=1;
		}
	}
}