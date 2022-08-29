import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        long start;
        long end;
        double timeElapsed;
        char input;
        Scanner sc=  new Scanner(System.in);
        System.out.println("do you want start so (Enter any character)");
        input = sc.next().charAt(0);
        start = System.currentTimeMillis();
        System.out.println("do you want stop so (Enter y character)");
        input = sc.next().charAt(0);
        end = System.currentTimeMillis();
        timeElapsed = (end-start)/1000;
        System.out.println("the timeElapsed is :  "+timeElapsed+" sec");
        sc.close();
    }
}
