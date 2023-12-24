package TD3;

public class exo5 {
}
class Vehicule{
    private int NbPasager;
    Vehicule(int n){
        this.NbPasager=n;
    }
    public String toString(){
        return "NbPassager= "+NbPasager;
    }

    public int getNbPasager() {
        return NbPasager;
    }
}
class Moto extends Vehicule{
    private int nbRoues=2;
    Moto(int n){
        super(n);
    }
    Moto(int nbRoues,int n){
        super(n);
        this.nbRoues=2;
    }
    public String toString(){
        return "Nbpassager="+getNbPasager()+" nbroues="+nbRoues;
    }
}
class Avion extends Vehicule{
    private int nbMoteur;
    Avion(int NbP){
        super(NbP);
    }
    Avion(int nbMoteur,int NbP){
        this(NbP);
        this.nbMoteur=nbMoteur;
    }
}
class Tripoteur extends Moto{
    Tripoteur(int n){
        super(n,3);
    }
}