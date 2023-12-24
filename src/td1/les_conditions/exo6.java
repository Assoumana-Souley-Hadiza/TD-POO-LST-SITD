package td1.les_conditions;

import java.util.Scanner;

public class exo6 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int a,b;
        System.out.println("saisir les 2 variables:");
        a=s.nextInt();
        b=s.nextInt();
        if(a>0&&b>0){
            System.out.println("la multiplication est positive");
        } else if(a<0 && b<0){
            System.out.println("la multiplication est positive");
        } else {
            System.out.println("la multiplication est négative");
        }
    }
}
