package TD2;

public class exo6 {
    public static void main(String[] args){
        Banque banque=new Banque(1, 5000.75F,"AB 1200");
        System.out.println(banque.avoirInf());
        System.out.println( banque.avoirSolde());
        banque.deposer(500);
        System.out.println(banque.avoirInf());
        banque.retirer(200);
        System.out.println(banque.avoirInf());
        System.out.println( banque.avoirSolde());

    }
}
class Banque{
    private int Ncompte;
    private float solde;
    private String CIN;
    Banque(){};
    Banque(int Ncompte,float solde,String CIN){
        this.Ncompte=Ncompte;
        this.solde=solde;
        this.CIN=CIN;
    }
    public int getNcompte(){ return Ncompte;}
    public void setNcompte(int Ncompte){
        this.Ncompte=Ncompte;
    }
    public float getSolde(){
        return solde;
    }
    public void setSolde(float solde){
        this.solde=solde;
    }
    public String getCIN(){return CIN;}
    public void setCIN(String CIN){
        this.CIN=CIN;
    }
    public void deposer(float somme){
        solde+=somme;
    }
    public void retirer(float somme){
       solde=solde-somme;
    }
    public float avoirSolde(){
        return solde;
    }
    public String avoirInf(){
        return "BANQUE{ Ncompte="+Ncompte+
                ",Solde="+solde+
                ",CIN="+CIN;
    }



}
