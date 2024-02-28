import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        if(isprime(num)==true){
            System.out.println(num+" is prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }


    public static boolean isprime(int num){
        if(num==1||num==0){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;

            }
        }
        return true;


    }


    
}
