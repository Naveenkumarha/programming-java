public class tofindfibonacci {
    public static void fibonacci(int n){
        int a=0,b=1,c=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+",");
            a=b;
            b=c;
            c=a+b;
        }
    }

    public static void main(String[] args) {
       fibonacci(40);
    }
    
}
