import java.util.Arrays;
import java.util.Scanner;
public class largest{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=input.nextInt();
		int maxdigit=10;
		int[] digits=new int[maxdigit];
		int index=0;
		while (num!=0 && index<maxdigit){
			digits[index++]=num%10;
			num/=10;
		}
		int lar=0,sec=0;
		for (int i=0;i<index;i++){
			if (digits[i]>lar){
				sec=lar;
				lar=digits[i];
			}
			else if (digits[i]>sec&&digits[i]!=lar){
                sec= digits[i];
			}
		}
		System.out.println(Arrays.toString(digits));
        System.out.println("The largest element is: "+lar);
        System.out.println("The second largest element is: "+sec);

	}
}