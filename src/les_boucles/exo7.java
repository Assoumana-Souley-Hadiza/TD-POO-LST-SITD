package les_boucles;

import java.util.Scanner;

public class exo7 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n,i,j;
        System.out.println("saisir le nombre de ligne");
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+j);
            }
            System.out.print("\n");
        }
    }
}
