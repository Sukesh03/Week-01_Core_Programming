import java.util.Scanner;
public class MultiplicationFromSixtoNine {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.print("Enter an integer: ");
		int num=input.nextInt();
		for (int i=6;i<=9;i++){
			arr[i]=num*(i);
		}
		for (int i=6;i<=9;i++){
			System.out.println(num+" * "+(i)+" = "+arr[i]);
		}
		input.close();
	}
}