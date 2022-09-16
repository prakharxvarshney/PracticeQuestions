import java.util.*;
public class Question1 {
    //Print sum of first n natural numbers
    static Scanner scan = new Scanner(System.in);
    public static void sum(int n, int i, int sum) {
         if(i==n) {
             sum+=i;
             System.out.println(sum);
             return;
         }
         sum+=i;
         sum(n,i+1,sum);
    }
    public static void main(String[] args) {
        System.out.print("Enter the intial value - ");
        int i=scan.nextInt();
        System.out.print("Enter the last value - ");
        int n=scan.nextInt();
        int sum = 0;
        sum(n,i,sum);
    }
}
