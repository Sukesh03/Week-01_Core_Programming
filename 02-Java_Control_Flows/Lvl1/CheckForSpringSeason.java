import java.util.Scanner;
public class CheckForSpringSeason {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the month: ");
		int month=input.nextInt();
		System.out.print("Enter the day: ");
		int day=input.nextInt();
		if (month==3 && day>19){
			System.out.print("It is spring");
		}
		else if (month==6 && day<21){
			System.out.print("It is spring");
		}
		else if (month==4||month==5){
			System.out.print("It is spring");
		}
		else{
			System.out.print("It is not spring");
		}
	}
}