package td1.les_conditions;
import java.util.Scanner;
public class exo4 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int moyenne;
        System.out.println("saisir la moyenne");
        moyenne=s.nextInt();
        if(moyenne<10)
        {
            System.out.println("pas de mention");
        }
        else if(moyenne>=10 && moyenne<12)
        {
            System.out.println("passable");
        }
        else if(moyenne>=12 && moyenne<14){
            System.out.println("assez bien");
        }
        else if(moyenne>=14 && moyenne<16)
        {
            System.out.println("bien");
        }
        else {
            System.out.println("tres bien");
        }
    }
}
