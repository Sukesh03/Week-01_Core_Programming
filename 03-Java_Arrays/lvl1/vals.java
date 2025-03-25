import java.util.Scanner;
public class vals{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double arr[]=new double[10];
		int i=0;
		double sum=0;
		while (true){
			System.out.print("Enter a number: ");
			arr[i]=input.nextDouble();
			i++;
			if (arr[i-1]<=0) break;
			else if(i>9) break;
		}
		for (int j=i-1;j>=0;j--){
		sum+=arr[j];
		}
		System.out.print(sum);
	}
}