package TD3;

public class exo3 {
    public static void main(String[] args){
        Centre c=new Centre(2,3,'A');
       c.affiche();
       Cercle cercle=new Cercle(3,4,'B',5);
       cercle.affiche();
    }
}
class POIN{
    public  POIN(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void affCoord(){
        System.out.println("coordonnes: "+x+" "+y);
    }
    public void affiche(){
        System.out.println("coordonnes: "+x+" "+y);
    }
    public int getX(){return x;}

    public int getY() {
        return y;
    }

    private int x,y;

}
class Centre extends POIN{
    private char nom;
    public Centre(int x,int y,char nom){
        super(x,y);
        this.nom=nom;
    }
    public void AffNom(){
        System.out.println("nom= "+nom);
    }
    public void affiche(){
        super.affiche();
        System.out.println("nom= "+nom);
    }
}
class Cercle extends Centre{
    private int rayon;
    public Cercle(int x,int y,char nom,int rayon){
        super(x,y,nom);
        this.rayon=rayon;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("rayon: "+rayon);
    }

}