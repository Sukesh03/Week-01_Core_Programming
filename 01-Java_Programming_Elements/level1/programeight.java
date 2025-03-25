import java.util.Scanner;
public class programeight{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter dist in km: ");
		double km=input.nextDouble();
		System.out.println("The distance in miles: "+km*1.6);
		input.close();
	}
}		