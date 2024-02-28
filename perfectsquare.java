import java.util.Scanner;
public class perfectsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        
        if(isperfectsquare(num)==true){
           System.out.println(num+" is perfect square ");
        }
        else{
            System.out.println(num+" is not a perfect square");
        }

        
    }

    static boolean isperfectsquare(int n){
        for(int i=1;i<=n;i++){
            if(i*i==n){
                return true;
            }
        }
        return false;
    }
    
}
