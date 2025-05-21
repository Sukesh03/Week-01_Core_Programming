import java.util.Scanner;
public class FactorsOfNumberUsingWhileLoop {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=input.nextInt();
		int j=1;
		while (j>0 && j<=num){
			for (int i=1;i<=num;i++){
				if (num%i==0){
					System.out.println(i);
				}
				j++;
			}
		}
	}
}