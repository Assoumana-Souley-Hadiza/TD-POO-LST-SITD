package TD2;

public class exo5 {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        rec.setLongueur(12);
        rec.setLargeur(10);
        rec.perimetre();
        rec.aire();
        rec.iscarre();
        System.out.println(rec.toString());


    }
}
class Rectangle{
    private double longueur;
    private double largeur;
    private Rectangle rectangle;
    Rectangle(){};
    Rectangle(double longueur,double largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }
    Rectangle(Rectangle rectangle){
        this.rectangle=rectangle;
    }
    public double getLongueur(){ return longueur;}
    public void setLongueur(double longueur ){
        if(longueur>=0)
        this.longueur=longueur;
        else this.longueur=0;
    }
    public double getLargeur(){
       return largeur;
    }
    public void setLargeur(double largeur){
        if(largeur>=0)
        this.largeur=largeur;
        else this.largeur=0;
    }
    public Rectangle getRectangle(){return rectangle;}
    public void setRectangle(Rectangle rectangle){
        this.rectangle=rectangle;
    }
    public double perimetre()
    {
        return 2*(this.longueur+this.largeur);
    }
    public double aire()
    {
        return this.longueur*this.largeur;

    }
    public void iscarre()
    {
        if(this.longueur==this.largeur){
            System.out.println("c'est un carre");
        }else System.out.println("ce nest pas un carre");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ",perimetre="+perimetre()+
                ",aire="+aire()+
                '}';
              }
    }


