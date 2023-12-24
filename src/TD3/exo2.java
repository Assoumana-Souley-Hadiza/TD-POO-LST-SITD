package TD3;


public class exo2 {
    public static void main(String[] args){
        PointNom p= new PointNom(2,3,'A');
        p.affichcoordnom();
        p.setPointNom(5,7,'B');
        p.affichcoordnom();
        p.setNom('C');
        p.affichcoordnom();


    }
}
class point{
    public  point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void deplace(int dx,int dy){
        x+=dx;
        y+=dy;
    }
    public void affCoord(){
        System.out.println("coordonnes: "+x+" "+y);
    }
    public int getX(){return x;}

    public int getY() {
        return y;
    }

    private int x,y;

}
class PointNom extends point{
    private char nom;
    public PointNom(int x,int y,char nom){
        super(x,y);
        this.nom=nom;
    }
    public void setPointNom(int x,int y,char nom){
        super.deplace(x-getX(),y-getY());
        this.nom=nom;
    }
    public void setNom(char nom){
        this.nom=nom;
    }
    public void affichcoordnom(){
        System.out.println("coordonnée:( "+getX()+", "+getY()+"); Nom= "+nom);
    }

}
