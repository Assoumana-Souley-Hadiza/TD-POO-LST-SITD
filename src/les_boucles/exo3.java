package les_boucles;

import java.util.Scanner;

public class exo3 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n,i;
        int p=0;
        int max=0;
        for(i=1;i<=20;i++)
        {
            System.out.println("donner les variables:");
            n=s.nextInt();
            if(n>max){
                max=n;
                p=i;
            }
        }
        System.out.println("max= "+max+"position= "+p);

    }
}
