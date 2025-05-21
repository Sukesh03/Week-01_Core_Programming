import java.util.Scanner;
public class ReverseANumber {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		int temp=num,c=0;
		while (temp!=0){
			c++;
			temp/=10;
		}
		int[] digits=new int[c];
		int idx=0;
		while (num!=0){
			digits[idx++]=num%10;
			num/=10;
		}
		System.out.print("Reversed number: ");
		for (int i=0;i<c;i++){
			System.out.print(digits[i]);
		}
		System.out.println();
	}
}