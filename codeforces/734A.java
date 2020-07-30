import java.util.Scanner;

public class Test {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,d=0;
        String s;
        n=sc.nextInt();
        sc.nextLine();
        s=sc.nextLine();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='A')a++;
            else d++;
        }
        if(a>d)
        System.out.print("Anton");
        else if(d>a)
        System.out.print("Danik");
        else System.out.print("Friendship");
        sc.close();
    }
    
}