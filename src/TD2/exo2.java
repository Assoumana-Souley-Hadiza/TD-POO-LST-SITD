package TD2;

public class exo2 {
    public static void main(String[] args){
        oint a=new oint();
        a.setNom('A');
        a.setX(5);
        a.setY(6);
        System.out.println(a);
       double z= a.norme();
        System.out.println(z);



    }
}
class oint{
    private double x,y;
    private char nom;
    oint(){}
    oint(double x,double y,char nom){
        this.x=x;
        this.y=y;
        this.nom=nom;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }
    public double norme(){
        return Math.sqrt(x*x+Math.pow(this.getY(),2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", nom=" + nom +
                '}';
    }
}
