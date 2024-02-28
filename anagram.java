public class anagram {
    public static void main(String[] args) {
        String s1="elloh";
        String s2="hello";
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        if(sort(c1).equals (sort(c2))){
            System.out.println("anagram");
        }
        else{
            System.out.println("not a anagram");
        }
    }

    public static String sort(char[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
        String ans=new String(arr);
        return ans;
    }
    
}
