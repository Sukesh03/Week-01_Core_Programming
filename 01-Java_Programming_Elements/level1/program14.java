import java.util.Scanner;
public class program14{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the distance in feet: ");
		double feet=input.nextDouble();
		double yard=feet/3;
		double mile=yard/1760;
		System.out.println("Distance in yards: "+yard+"\nDistance in miles: "+mile);
		input.close();
	}
}