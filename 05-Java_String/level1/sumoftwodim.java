import java.util.Scanner;
public class sumoftwodim {
    public static int[][] array(int[][] arr1, int[][] arr2, int r,int c){
        int[][] sum=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c=sc.nextInt();
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print("Enter a num: ");
                arr1[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print("Enter a num: ");
                arr2[i][j]=sc.nextInt();
            }
        }
        int arr[][]=array(arr1,arr2,r,c);
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
