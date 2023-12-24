package les_boucles;

import java.util.Scanner;

public class exo8 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(i=4;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
