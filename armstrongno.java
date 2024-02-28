import java.util.Scanner;
public class armstrongno {
    static int count(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
            
        }
        return count;
    }

    static int power(int base,int exponent){
        int res=1;
        for(int i=1;i<=exponent;i++){
            res=res*base;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=ip.nextInt();
        int temp=num;
        int exponent=count(num);
        int digit=0,sum=0;
        while(num!=0){
            digit=num%10;
            sum=sum+power(digit, exponent);
            num=num/10;

        }
        System.out.println(temp==sum?"armstrong number":"not a armstrong number");
        
    }
    
    
}

