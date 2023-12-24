package TD3;

public class exo1 {
    public static void main(String[] args){
        Point P1=new Point(1,5);
        PointA P2=new PointA(4,2);
        P1.affCoord();
        P1.deplace(2,3);
        P1.affCoord();
        P2.deplace(3,5);
        P2.affich();
    }
}
class Point{
    public  Point(int x,int y){
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

   public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int x,y;
}
class PointA extends Point {

    public PointA(int x, int y) {
        super(x, y);
    }

    public void affich(){
        System.out.println("coordonnes:("+getX()+", "+getY()+")");
    }
}
