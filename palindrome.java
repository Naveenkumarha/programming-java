import java.util.Scanner;
class palindrome{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int sum=0,temp=num,r;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(sum==temp){
            System.out.println("given no is palindrome");
        }
        else{
             System.out.println("given no is not palindrome");
        }
        
    }
}