import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n;int k;
        n=sc.nextLong();
        k=sc.nextInt();
        sc.nextLine();
        while(k>0)
        {
            if(n%10 != 0)
            {
                n--;
            }
            else 
            {
                n=n/10;
            }
            k--;
        }
        System.out.print(n);
        
    }
}