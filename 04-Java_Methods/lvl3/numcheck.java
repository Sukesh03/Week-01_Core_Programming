import java.util.Scanner;
public class numcheck {
    public static int countdig(int n){
        return String.valueOf(n).length();
    }
    public static int[] getdigitsarr(int n){
        int numdigits=countdig(n);
        int[] digits=new int[numdigits];
        for (int i=numdigits-1;i>=0;i--){
            digits[i]=n%10;
            n/=10;
        }
        return digits;
    }
    public static boolean isduck(int n){
        String numstr=String.valueOf(n);
        return numstr.contains("0") && numstr.charAt(0)!='0';
    }
    public static boolean isarm(int n){
        int[] digits=getdigitsarr(n);
        int numdigits=digits.length;
        int s=0;
        for (int dig:digits){
            s+=Math.pow(dig,numdigits);
        }
        return s==n;
    }
    public static int[] findlar(int[] digits){
        int largest=Integer.MIN_VALUE,seclar=Integer.MIN_VALUE;
        for (int digit:digits){
            if (digit>largest){
                seclar=largest;
                largest=digit;
            } else if (digit>seclar && digit!=largest) {
                seclar=digit;
            }
        }
        return new int[]{largest,seclar};
    }
    public static int[] findsma(int[] digits){
        int smallest=Integer.MAX_VALUE,secsma=Integer.MAX_VALUE;
        for (int digit:digits){
            if (digit<smallest){
                secsma=smallest;
                smallest=digit;
            } else if (digit<secsma && digit!=smallest) {
                secsma=digit;
            }
        }
        return new int[]{smallest,secsma};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n=sc.nextInt();
        System.out.println("Number of digits: " + countdig(n));
        int[] digits=getdigitsarr(n);
        System.out.print("Digits array: ");
        for (int dig:digits){
            System.out.print(dig+" ");
        }
        System.out.println();
        System.out.println("Duck Number? " + (isduck(n) ? "Yes" : "No"));
        System.out.println("Is Armstrong Number? " + (isarm(n) ? "Yes" : "No"));
        int[] largestValues = findlar(digits);
        System.out.println("Largest Digit: " + largestValues[0]);
        System.out.println("Second Largest Digit: " + largestValues[1]);

        // Find smallest and second smallest digits
        int[] smallestValues = findsma(digits);
        System.out.println("Smallest Digit: " + smallestValues[0]);
        System.out.println("Second Smallest Digit: " + smallestValues[1]);
        sc.close();
    }
}
