public class sunnyno {
    public static void main(String[] args) {
        int n=3;
        if(tofindsunny(n+1)){
            System.out.println("given no is sunny number:");
        }
        else{
            System.out.println("not a sunny number");
        }

    }

    static boolean tofindsunny(int n){
        for(int i=1;i<=n;i++){
            if(i*i==n){
                return true;
            }
        }
        return false;
    }
    
}
