import java.util.Scanner;
public class prob10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the distance in km: ");
		double dist=sc.nextDouble();
		double distm= dist*0.621371;
		System.out.println("The distance in miles: "+distm);
		sc.close();
	}
}