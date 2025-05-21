import java.util.Scanner;
public class MultiDimensionArrayToOneDimensionArray {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter num of rows: ");
		int r=input.nextInt();
		System.out.print("Enter num of columns: ");
		int c=input.nextInt();
		int [][] matrix=new int[r][c];
		System.out.println("Enter elements of matrix");
		for (int i=0;i<r;i++){
			for (int j=0;j<c;j++){
				matrix[i][j]=input.nextInt();
			}
		}
		int[] array=new int[r*c];
		int index=0;
		for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                array[index++] = matrix[i][j];
            }
        }
        System.out.println("1D Array elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
	}
}