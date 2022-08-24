import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter Number :");
        int Number=sc.nextInt();
        int flag=0;
        for(int i=2; i<=Number/2; i++){
            if(Number%i==0){
                flag++;
                break;
            }
        }
        if(flag==0 && Number!=1){
            System.out.println("This Number is Prime");
        }
        else {
            System.out.println("This Number Is not prime");
        }
    }
}
