import java.util.Scanner;

public class Test1030A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        boolean hard=false;
        for(int i=0;i<n;i++)
        {
            int person=sc.nextInt();
            if(person==1)
            hard=true;
        }
        sc.close();
        if(hard)
        System.out.print("HARD");
        else
        System.out.print("EASY");
        
    }
    
}