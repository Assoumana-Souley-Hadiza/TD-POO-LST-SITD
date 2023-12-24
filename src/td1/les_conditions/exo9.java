package td1.les_conditions;

import java.util.Scanner;

public class exo9 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("saisir les 2 variables:");
        a=s.nextInt();
        b=s.nextInt();
        if(a<b){
            System.out.println(" "+a+"; "+b);
        } else System.out.println(" "+b+"; "+a);
    }
}
