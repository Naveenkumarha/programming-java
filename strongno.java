import java.util.Scanner;
public class strongno {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=ip.nextInt();
        int sum=0,temp=num;
        int digit;
       
        while(num>0){
             digit=num%10;
            int factorial=toFindFactorial(digit);
            sum+=factorial;
            num=num/10;

        }
        if(temp==sum){
            System.out.println("given number is strong number");
        }
        else{
            System.out.println("given number is not strong number");
        }

        
    }

    public static int toFindFactorial(int n){
       int  factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;

    }
    
}
