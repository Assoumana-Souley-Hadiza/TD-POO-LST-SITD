package td1.les_conditions;
import java.util.Scanner;
public class exo5 {
    public static void main(String[] args){
       int heure;
        Scanner  s =new Scanner(System.in);
       do{
           System.out.println("saisissez l'heure ");
           heure=s.nextInt();
       } while(heure<0||heure>=24);

       System.out.println("saisir la langue");
       char langue=s.next().charAt(0);
       if(langue=='f'){
           if(heure>=0 && heure<18)
           {
               System.out.println("Bonjour");

           } else if(heure>=18 && heure<22)
           {
               System.out.println("Bonsoir");
           } else {
               System.out.println("Bonne nuit");
           }
       }
       if(langue=='a')
       {
           if(heure>=0 && heure<18)
           {
               System.out.println("Good morning");

           } else if(heure>=18 && heure<22)
           {
               System.out.println("Good evening");
           } else {
               System.out.println("Good night");
           }

       }
    }
}
