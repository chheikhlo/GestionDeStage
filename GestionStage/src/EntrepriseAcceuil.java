
import java.util.*;


public class EntrepriseAcceuil {

    private String nom;
    private Encadrant encadrant;

    public EntrepriseAcceuil(String nom, Encadrant encadrant) {
        this.nom = nom;
        this.encadrant = encadrant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Encadrant getEncadrant() {
        return encadrant;
    }

    public void setEncadrant(Encadrant encadrant) {
        this.encadrant = encadrant;
    }



/*public Boolean signer(void ConventionDeStage) {
        // TODO implement here
        return null;
    }

    /*
    public Boolean choisir(void Encadrant) {
        // TODO implement here
        return null;
    }
    */
}