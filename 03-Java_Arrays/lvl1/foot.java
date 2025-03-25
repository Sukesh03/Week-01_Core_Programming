import java.util.Scanner;
public class foot{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double mean=0;
		double arr[]=new double[11];
		for (int i=0;i<11;i++){
			System.out.print("Enter the height: ");
			arr[i]=input.nextDouble();
			mean+=arr[i];
		}
		mean/=11;
		System.out.println("Mean height: "+mean);
		input.close();
	}
}