package TD2;

public class exo4 {
    public static void main(String[] args){
        Temps t=new Temps(11,50,3);
        System.out.println(t.toString());
        t.ajouterMinutes(25);
        System.out.println(t.toString());
        t.ajouterSecondes(2546);
        System.out.println(t.toString());
    }
}
class Temps{
    private int heures;
    private int minutes;
    private int secondes;
    private Temps temps;
    Temps(){};
    Temps(int heures){
        this.heures=heures;
    }
    Temps(int heures,int minutes){
        this.heures=heures;
        this.minutes=minutes;
    }
    Temps(int heures,int minutes,int secondes){
        this.heures=heures;
        this.minutes=minutes;
        this.secondes=secondes;
    }
    public int getHeures(){ return heures;}
    public void setHeures(int heures){
        this.heures=heures;
    }
    public int getMinutes(){return minutes;}
    public void setMinutes(int minutes){
        this.minutes=minutes;
    }
    public int getSecondes(){ return secondes;}
    public void setSecondes(int secondes){
        this.secondes=secondes;}

    public Temps(Temps temps){

        this(temps.getSecondes(),temps.getMinutes(), temps.getHeures());
    }

    public Temps getTemps() {
        return temps;
    }

    public void setTemps(Temps temps) {
        this.temps = temps;
    }

    @Override
    public String toString() {
        return "Temps{" +
                "heures=" + heures +
                ", minutes=" + minutes +
                ", secondes=" + secondes +
                ", temps=" + temps +
                '}';
    }
    public void ajouterHeures(int heures){
        this.setHeures(this.getHeures()+heures);
    }
    public void ajouterMinutes(int minutes){
        minutes=minutes+this.getMinutes();
        ajouterHeures(minutes/60);
        this.setMinutes(minutes%60);
    }
    public void ajouterSecondes(int secondes){
        secondes=secondes+this.getSecondes();
        ajouterMinutes(secondes/60);
        this.setSecondes(secondes%60);
    }
}
