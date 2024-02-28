public class duckno {
    public static void main(String[] args) {
        int n=2010;
   
    if(tofindduck(n)){
        System.out.println("given number is duck");
    }
    else{
        System.out.println("given number is not duck");
    }
    }

    static boolean tofindduck(int n){
       int  r=0;
        while (n!=0) {
            r=n%10;
            if(r==0){
                return true;
                
            }
            n=n/10;
        }
        return false;
    }
    
}
