package les_boucles;

import java.util.Scanner;

public class exo2 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n,i;
        int somme=0;
        do{
            System.out.println("saisir l'entier N");
            n=s.nextInt();
        } while(n<=0);
        for(i=1;i<n;i++)
        {
            if(i%2!=0){
                somme=somme+i;
            }
        }
        System.out.println("la somme est: "+somme);
    }
}
