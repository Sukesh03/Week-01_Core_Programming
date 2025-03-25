import java.util.Scanner;
public class program15{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the unit price: ");
		double unitPrice=input.nextDouble();
		System.out.print("Enter the quantity: ");
		double qty=input.nextDouble();
		double totalPrice=unitPrice*qty;
		System.out.println("Total price: "+totalPrice);
		input.close();
	}
}