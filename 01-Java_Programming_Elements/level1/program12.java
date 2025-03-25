import java.util.Scanner;
public class program12{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter base: ");
		float b=input.nextFloat();
		float bi=b/2.54f;
		System.out.print("Enter height: ");
		float h=input.nextFloat();
		float hi=h/2.54f;
		float area=0.5f*b*h;
		float areai=0.5f*bi*hi;
		System.out.println("The area  in sq cms is "+area+" and in sq inches is "+areai);
		input.close();
	}
}