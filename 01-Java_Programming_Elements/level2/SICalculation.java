import java.util.Scanner;
public class SICalculation {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter principal amt: ");
		double principal=scanner.nextDouble();
		System.out.print("Enter rate: ");
		double rate=scanner.nextDouble();
		System.out.print("Enter time: ");
		double time=scanner.nextDouble();
		double SI=(principal*rate*time)/100;
		System.out.println("The Simple Interest is: "+SI);
		scanner.close();
	}
}