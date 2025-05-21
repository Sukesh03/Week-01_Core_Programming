import java.util.Scanner;
public class ComputePercentageAndGrade {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n=input.nextInt();
		double mar[]=new double[n],per[]=new double[n];
		String grade[]=new String[n];
		for (int i=0;i<n;i++){
			double phy;
            do {
                System.out.print("Enter physics marks(positive value): ");
                phy = input.nextDouble();
                if (phy <= 0) {
                    System.out.println("Marks must be a positive value.");
                }
            } while (phy <= 0);
			double che;
            do {
                System.out.print("Enter chemistry marks(positive value): ");
                che = input.nextDouble();
                if (che <= 0) {
                    System.out.println("Marks must be a positive value.");
                }
            } while (che <= 0);
			double mat;
            do {
                System.out.print("Enter maths marks(positive value): ");
                mat = input.nextDouble();
                if (mat <= 0) {
                    System.out.println("Marks must be a positive value.");
                }
            } while (mat <= 0);
			mar[i]=phy+che+mat;
			System.out.print("Marks: "+mar[i]);
			per[i]=mar[i]/3;
			System.out.print("Percentage: "+per[i]);
			if (per[i]>=80){
			System.out.println("Grade: A\nRemarks:Level 4,above agency-normalized standards");
			}
			else if(per[i]<80 && per[i]>=70){
				System.out.println("Grade: B\nRemarks:Level 3,at agency-normalized standards");
			}
			else if(per[i]<70 && per[i]>=60){
				System.out.println("Grade: C\nRemarks:Level 2,below agency-normalized standards");
			}
			else if(per[i]<60 && per[i]>=50){
				System.out.println("Grade: D\nRemarks:Level 1,well below agency-normalized standards");
			}
			else if(per[i]<50 && per[i]>=40){
				System.out.println("Grade: E\nRemarks:Level 1-,too below agency-normalized standards");
			}
			else{
				System.out.println("Grade: R\nRemarks: Remedial standards");
			}
		}
	}
}