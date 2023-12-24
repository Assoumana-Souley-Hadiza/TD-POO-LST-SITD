package td1.les_conditions;
import java.util.Scanner;
public class exo1 {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int a,b,c;
        System.out.println("saisir a:");
        a=s.nextInt();
        System.out.println("saisir b:");
        b=s.nextInt();
        System.out.println("saisir c:");
        c=s.nextInt();
        if(a>b && a>c )
        {
            System.out.println("max= "+a);
        }else if( b>a && b>c)
        {
            System.out.println("max= "+b);
        }
        else {
            System.out.println("max= "+c);
        }
}
}
