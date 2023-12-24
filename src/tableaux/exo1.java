package tableaux;

import java.util.Random;


public class exo1 {
    public static void main (String[] args){

        int tab[]=new int[10];
        Random r=new Random();
        int i;
        for(i=0;i<10;i++){
            tab[i] =r.nextInt(100);
        }
        for(i=0;i<10;i++)
        {
            System.out.println("tab[ "+i+"] : "+tab[i]);
        }
        int max=tab[0];
        int min=tab[0];
        for(i=0;i<10;i++)
        {
            if(tab[i]> max) max=tab[i];
            if(tab[i]< min) min=tab[i];
        }
        System.out.println("max= "+max+"min= "+min);
    }
}
