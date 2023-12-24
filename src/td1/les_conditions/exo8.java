package td1.les_conditions;

import java.util.Scanner;

public class exo8 {
    public static void main(String[] args){
      Scanner s= new Scanner(System.in) ;
      int mois;int annee; int i = 0;
      System.out.println("saisir le mois");
      mois=s.nextInt();
      switch (mois)
      {
          case 1:case 3: case 5: case 7: case 8: case 10: case 12:  i =31;
          break;
          case 4: case 6: case 9: case 11:  i=30;
          break;
          case 2:
              do{
                  System.out.println("saisir l'annee ");
                  annee=s.nextInt();
              } while(annee<1900 || annee >2100);

              if(annee%4==0) i=29;
              else i=28;
              break;
              
      }
      System.out.println("le nombre de jour du mois"+mois+"est: "+i);
    }
}
