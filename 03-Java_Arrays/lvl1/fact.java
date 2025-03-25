import java.util.Scanner;
import java.util.Arrays;
public class fact{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int maxfac=10;
		int fac[]= new int[10];
		int idx=0;
		int num=input.nextInt();
		for (int i=1;i<=num;i++){
			if (num%i==0){
				if (idx==maxfac){
					maxfac*=2;
					fac=Arrays.copyOf(fac,maxfac);
				}
			fac[idx++]=i;
			}
		}
		System.out.println("Factors of " + num + " are:");
        for (int i = 0; i < idx; i++) {
            System.out.print(fac[i] + " ");
        }
	}
}