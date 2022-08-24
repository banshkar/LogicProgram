import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int Number ,Temp, remainder,Reverse=0;
        Scanner sc =new Scanner( System.in);
        System.out.println("Enter Number :");
        Number =sc.nextInt();
        System.out.println(".........");
        System.out.println("before  :" +Number);
        Temp=Number;
        while (Temp>0){
            remainder=Temp%10;
            Reverse= Reverse*10+remainder;
            Temp=Temp/10;
        }
        System.out.println("........");
        System.out.println("after :" + Reverse);
    }
}
