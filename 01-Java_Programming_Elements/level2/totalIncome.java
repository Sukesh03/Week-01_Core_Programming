import java.util.Scanner;
public class totalIncome{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the salary: ");
		int salary=input.nextInt();
		System.out.print("Enter the bonus: ");
		int bonus=input.nextInt();
		System.out.println("The total income: "+(salary+bonus));
		input.close();
	}
}	