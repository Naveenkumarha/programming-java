import java.util.Scanner;
public class factorial {
    
     public static int findfactorial(int n){
        if (n==1||n==0){
            return 1;
        }
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
            
        }
        return factorial;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sc.nextInt();
        int factorial=findfactorial(num);
        System.out.println(num +" factorial is "+ factorial);
        
    }
    
}
