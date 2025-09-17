public class Etudiant {
    private String nom;
    private String prénom;

    public Etudiant(String nom, String prénom) {
        this.nom = nom;
        this.prénom = prénom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    @Override
    public String toString() {
        return String.format("Nom: '%s', Prénom: '%d'}",
                nom, prénom);
    }

}
