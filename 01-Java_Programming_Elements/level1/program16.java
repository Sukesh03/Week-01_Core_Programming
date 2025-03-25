import java.util.Scanner;
public class program16{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the num of students: ");
		int numberOfStudents=input.nextInt();
		int maxNumOfHandshakes=(numberOfStudents*(numberOfStudents-1))/2;
		System.out.println("Max num of handshakes: "+maxNumOfHandshakes);
		input.close();
	}
}