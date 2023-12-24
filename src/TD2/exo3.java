package TD2;

public class exo3 {
    public static void main(String[] args){
        Livre livre=new Livre();
        livre.setTitre("Afrique");
        livre.setAuteur("ali");
        livre.setPrix(1250);
        livre.setAnnee(2022);
        System.out.println(livre);

    }
}
  class Livre{
    private String titre;
    private String auteur;
    private double prix;
    private double annee;
    private Livre livre;
   Livre(){};
   Livre(String titre){
       this.titre=titre;
   }
   Livre(String titre,String auteur){
       this.titre=titre;
       this.auteur=auteur;
   }

      Livre(String titre,String auteur,double prix){
          this.titre=titre;
          this.auteur=auteur;
          this.prix=prix;
      }
      Livre(String titre,String auteur,double prix,double annee){
          this.titre=titre;
          this.auteur=auteur;
          this.prix=prix;
          this.annee=annee;
      }
      Livre(Livre livre){
       this.livre=livre;
      }

      public String getTitre() {
          return titre;
      }

      public void setTitre(String titre) {
          this.titre = titre;
      }
      public String getAuteur(){
       return auteur;
      }
      public void setAuteur(String auteur){
       this.auteur=auteur;
      }
      public double getPrix(){
       return prix;
      }
      public void setPrix(double prix){
       this.prix=prix;
      }

      public double getAnnee() {
          return annee;
      }

      public void setAnnee(double annee) {
          this.annee = annee;
      }

      public Livre getLivre() {
          return livre;
      }

      public void setLivre(Livre livre) {
          this.livre = livre;
      }

      @Override
      public String toString() {
          return "Livre{" +
                  "titre='" + titre + '\'' +
                  ", auteur='" + auteur + '\'' +
                  ", prix=" + prix +
                  ", annee=" + annee +
                  ", livre=" + livre +
                  '}';
      }
  }
