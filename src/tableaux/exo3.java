package tableaux;

public class exo3 {
    public static void main(String[] args)
    {
      int tab[]={10,14,15,8,17,5,12,11,13} ;
      int n=11;
      int c=0;
      for(int i=0;i< tab.length;i++){
          if(tab[i]>=n){ c++;
          }
      }
      System.out.println("le nombre d'etudiant est: "+c);
    }
}
