import java.util.Scanner;
public class dayofweek{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter month: ");
		int m=input.nextInt();
		System.out.print("Enter day: ");
		int d=input.nextInt();
		System.out.print("Enter year: ");
		int y=input.nextInt();
		if (m<3){
			m+=12;
			y--;
		}
		int q=d;
		int k=y%100;
		int j=y/100;
		int h=(1+(13*(m+1))/5+k+(k/4)+(j/4)+(5*j))%7;
		int dayofweek=(h+6)%7;
		System.out.println(dayofweek);
	}
}