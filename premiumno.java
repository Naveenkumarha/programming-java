import java.util.Scanner;
public class premiumno {

    static boolean toCalculatePrimeNo(int n){
        if(n==0||n==1){
            return false;
        }
        int c=0;
        for(int i=2;i<=n;i++){
            
            if(n%i==0){
                c++;
            }
            
        }
        return c==1;
    }

    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int d=ip.nextInt();
        int c=0;
        int r=0;
        while(n>0){
            r=n%10;
            if(r==d){
                c++;
            }
            n=n/10;
           
        }

        if(toCalculatePrimeNo(c)==true){
            System.out.println("given number is premimum no");
        }
        else{
            System.out.println("given number not a premimum no");

        }
        
    }
    
}
