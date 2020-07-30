import java.util.Scanner;
public class Test344A {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        int c=1;
        String prev=null,curr=null;
        for(int i=0;i<n;i++)
        {

                if(curr!=null)prev=curr;
                curr=sc.nextLine();
                if(prev!=null && prev.charAt(1)==curr.charAt(0))
                c++;
            
        }
        sc.close();
        System.out.print(c);
    }
    
}