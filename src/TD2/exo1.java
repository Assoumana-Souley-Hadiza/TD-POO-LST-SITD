package TD2;

public class exo1 {
    public static void main(String[] args){
        point a=new point('b',10);
        a.afficher();
        a.translate(4);
        a.afficher();
    }

}
 class point{
    private char nom;
    private double abscisse;
    point(char nom,double abscisse){
        this.nom=nom;
        this.abscisse=abscisse;
    }
    public void afficher(){
        System.out.println("Nom= "+this.nom+" Abscisse= "+this.abscisse);
    }
    public void translate(double translation){
        abscisse=abscisse+translation;
    }
}
