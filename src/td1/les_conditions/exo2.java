package td1.les_conditions;
import java.util.Scanner;
public class exo2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double a,b,c;
        double delta;
        System.out.println("donnez a");
        a= s.nextDouble();
        System.out.println("donnez b");
        b= s.nextDouble();
        System.out.println("donnez c");
        c= s.nextDouble();
        delta=b*b-4*a*c;
        if(delta==0)
        { double x=-b/(2*a);
            System.out.println("on a une solution unique: X= "+x);
        }
        else if(delta>0)
        {  double racine1= (-b+Math.sqrt(delta))/(2*a);
            double racine2= (-b-Math.sqrt(delta))/(2*a);
            System.out.println("racine1= " + racine1);
            System.out.println("racine2= " + racine2);
        }
        else
        {
            System.out.println("pas de solution");
        }

    }
}
