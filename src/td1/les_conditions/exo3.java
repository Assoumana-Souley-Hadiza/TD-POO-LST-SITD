package td1.les_conditions;
import java.util.Scanner;
public class exo3 {
    public static void main(String[] args){
        int a,b;
        int s,p;
        Scanner n= new Scanner(System.in);
        System.out.println("donnez a:");
        a=n.nextInt();
        System.out.println("donnez b:");
        b=n.nextInt();
        s=a+b;
        p=a*b;
        if(s%2==0)
        {
            System.out.println("la somme a+b est paire");
        }else
        {
            System.out.println("la somme a+b n'est pas paire");
        }
        if(p%2==0)
        {
            System.out.println("le produit ab est paire");
        }else
        {
            System.out.println("le produit ab n'est pas paire");
        }
        if(s>0)
        {
            System.out.println("la somme  est positif");
        }else {
            System.out.println("la somme est négative");
        }
        if(p>0)
        {
            System.out.println("le produit  est positif");
        }else {
            System.out.println("le produit est négative");
        }
    }
}
