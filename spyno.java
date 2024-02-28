public class spyno {
    public static void main(String[] args) {
        int n=11;
        if(tofindspyno(n)){
            System.out.println("given number is spy number");
        }
        else{
            System.out.println("given number is not spy number");
        }
    }

    static boolean tofindspyno(int n){
        int sum=0,product=1,r=0;
        while (n!=0) {
            r=n%10;
            sum+=r;
            product*=r;
            n=n/10;
            
        }
        if(sum==product){
            return true;
        }
        else{
            return false;
        }

    }
    

    
}
