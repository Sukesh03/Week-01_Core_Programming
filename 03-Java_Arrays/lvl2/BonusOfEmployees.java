import java.util.*;
public class BonusOfEmployees {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double sal[]=new double[10],yrs[]=new double[10];
		double nsal[]=new double[10],bon[]=new double[10];
		int totbon=0,totold=0,totnew=0;
		for (int i=0;i<10;i++){
			System.out.print("Enter salary: ");
			sal[i]=input.nextDouble();
			System.out.print("Enter years of service: ");
			yrs[i]=input.nextDouble();
			if (yrs[i]>5){
				bon[i]=5*sal[i]/100;
				nsal[i]=bon[i]+sal[i];
			}
			else{
				bon[i]=2*sal[i]/100;
				nsal[i]=bon[i]+sal[i];
			}
			totbon+=bon[i];
			totold+=sal[i];
			totnew+=nsal[i];
		}
		System.out.println("Total bonus: "+totbon);
		System.out.println("Total old salary: "+totold);
		System.out.println("Total new salary: "+totnew);
	}
}