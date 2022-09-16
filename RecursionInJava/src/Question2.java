import java.util.Scanner;
public class Question2 {
    //Print Factorial of a number n
    static Scanner scan = new Scanner(System.in);
    public static void printFactorial(int i, int n, int factorial) {
        if(i==n) {
            factorial*=i;
            System.out.println(factorial);
            return;
        }
        factorial = factorial * i;
        printFactorial(i+1,n,factorial);
    }
    public static void main(String[] args) {
        System.out.print("Enter the number - ");
        int n=scan.nextInt();
        int i = 1;
        int factorial = 1;
        printFactorial(i,n,factorial);
    }
}
