import java.util.Scanner;

public class PerfectNUmber {
    public static void main(String[] args) {
        int Number,Temp ,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        Number =sc.nextInt();
        Temp=Number;
        for(int i=1; i<Number; i++){
            if(Number%i==0){
                sum= sum+i;
            }
        }
        if(Temp==sum){
            System.out.println("This Number is Perfect");
        }
        else {
            System.out.println("This NUmber is not Perfect");
        }
    }
}
