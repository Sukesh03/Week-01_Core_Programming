import java.util.Scanner;
public class MultiplicationFromOnetoTen {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.print("Enter an integer: ");
		int num=input.nextInt();
		for (int i=0;i<=9;i++){
			arr[i]=num*(i+1);
		}
		for (int i=0;i<=9;i++){
			System.out.println(num+" * "+(i+1)+" = "+arr[i]);
		}
		input.close();
	}
}