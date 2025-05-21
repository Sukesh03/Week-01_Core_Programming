import java.util.Scanner;
public class MultiplesOfNumberUsingWhileLoop {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		if (num>0 && num<100){
			int c=num-1;
			while (c>1){
				if (num%c==0){
					System.out.println(c);
				}
			c--;
			}
		}
	}
}