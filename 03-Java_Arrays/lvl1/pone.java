import java.util.Scanner;
public class pone{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int arr[]=new int[5];
		int len=arr.length;
		for (int i=0;i<len;i++){
			System.out.print("Enter a number: ");
			arr[i]=input.nextInt();
			if (arr[i]>0){
				System.out.println("Positive");
				if (arr[i]%2==0){
					System.out.println("Even");
				}
				else{
					System.out.println("Odd");
				}
			}
			else if (arr[i]<0){
				System.out.println("Negative");
			}
			else{
					System.out.println("Zero");
			}
		}
		if (arr[0]==arr[len-1]){
			System.out.println("Both are equal");
		}
		else if (arr[0]<arr[len-1]){
			System.out.println("Last element is greater than first element");
		}
		else {
			System.out.println("Last element is smaller than first element");
		}
	}
}