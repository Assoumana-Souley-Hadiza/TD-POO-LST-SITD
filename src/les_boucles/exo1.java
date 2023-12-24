package les_boucles;

import java.util.Scanner;

public class exo1 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n; int i;
        int fact=1;
        do{
            System.out.println("saisir l'entier N");
            n=s.nextInt();
        } while(n<=0);
        for (i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("le factoriel de"+n+" est: "+fact);
    }
}
