import java.util.Scanner;
public class hars{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		int sum=0;
		int temp=num;
		while(num!=0){
			sum+=num%10;
			num=num/10;
		}
		if (temp%sum==0){
			System.out.print("Harshad number");
		}
		else{
			System.out.print("not harshad number");
		}
	}
}	