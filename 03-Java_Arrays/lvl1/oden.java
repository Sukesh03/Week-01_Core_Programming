import java.util.Scanner;
import java.util.Arrays;
public class oden{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		int as=num/2+1;
		double odd[]=new double[as],eve[]=new double[as];
		int o=0,e=0;
		for (int i=1;i<num+1;i++){
			if (i%2==0){
				eve[e]=i;
				e++;
			}
			else{
				odd[o]=i;
				o++;
			}
		}
		System.out.println("Odd: "+Arrays.toString(odd));
		System.out.println("Even: "+Arrays.toString(eve));
	}
}