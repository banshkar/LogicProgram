import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int next;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Number");
        int first =sc.nextInt();
        System.out.println("Enter second Number");
        int second =sc.nextInt();
        System.out.println("Enter  Number of Size");
        int size =sc.nextInt();
        System.out.print(first+" "+second);
        for(int N=2; N<=size; N++){
           next =first+second;
           first=second;
           second=next;
            System.out.print(" "+next);
        }
        System.out.println();

    }
}
