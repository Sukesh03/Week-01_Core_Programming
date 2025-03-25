import java.util.Scanner;
public class vote{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int arr[]=new int[10];
		int len=arr.length;
		for (int i=0;i<len;i++){
			System.out.print("Enter the age: ");
			arr[i]=input.nextInt();
			if (arr[i]>=18){
				System.out.print("They can vote");
			}
			else if (arr[i]<0){
				System.out.print("invalid age");
			}
			else{
				System.out.print("They cant vote");
			}
		}
	}
}