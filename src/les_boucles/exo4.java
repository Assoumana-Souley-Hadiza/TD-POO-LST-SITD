package les_boucles;

import java.util.Scanner;

public class exo4 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a,b;
        int r;
        int pgcd;
        do {
            System.out.println("saisir a et b");
            a=s.nextInt();
            b=s.nextInt();
        } while(a<=0|| b<=0);
        do {
            r=a%b;
            a=b;
            b=r;
        } while(r!=0);
        pgcd=a;
        System.out.println("pgdc= "+pgcd);


    }
}
