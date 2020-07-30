import java.util.Scanner;

public class Test677A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,h,c=0;
        n=sc.nextInt();
        h=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            if(ele>h)
            c=c+2;
            else c++;
        }
        sc.close();
        System.out.print(c);

    }
    
}