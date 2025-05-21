import java.util.Scanner;
public class MaxNumberOFHandshakes {
	public int max(int n){
		return (n*(n-1))/2;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n=input.nextInt();
		MaxNumberOFHandshakes obj=new MaxNumberOFHandshakes();
		int max=obj.max(n);
		System.out.print("Max num of handshakes: "+max);
	}
}