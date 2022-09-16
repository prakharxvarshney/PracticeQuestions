public class Question3 {
    public static void printFibonacciSequence(int a, int b, int n) {
        if(n==2) {
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFibonacciSequence(b,c,n-1);
    }
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        printFibonacciSequence(0,1,10);
    }
}
