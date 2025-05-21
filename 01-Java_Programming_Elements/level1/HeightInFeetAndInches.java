import java.util.Scanner;
public class HeightInFeetAndInches {
	public static void main(String[] args){
		double inch=2.54,foot=12;
		Scanner input= new Scanner(System.in);
		System.out.print("Height in cm: ");
		double height=input.nextDouble();
		double heightinch=height/inch;
		double heightfeet=heightinch/foot;
		System.out.println("Height in feet: "+heightfeet+"Height in inches: "+heightinch);
	}
}		