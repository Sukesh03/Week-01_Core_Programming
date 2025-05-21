import java.util.*;
public class YoungestAndTallestAmongFriends {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double age[]=new double[3],height[]=new double[3];
		System.out.print("Enter the age: ");
		for (int i=0;i<3;i++){
			age[i]=input.nextDouble();
		}
		Arrays.sort(age);
		System.out.print("Enter the ht: ");
		for (int i=0;i<3;i++){
			height[i]=input.nextDouble();
		}
		Arrays.sort(height);
		System.out.println("Youngest: "+age[0]);
		System.out.println("Tallest: "+height[2]);
	}
}