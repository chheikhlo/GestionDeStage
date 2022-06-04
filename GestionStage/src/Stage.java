/**
 * 
 */
public class Stage {

    private Boolean estValider;
    private EntrepriseAcceuil entreprise;
    private String sujetPropose;
    private String lieuExecution;
    private String resultatAttendu;
    private int montantPrevisionnel;
    private String listAvantage;

    //private ConventionDeStage conventionDeStage;
    private Boolean estChoisit = false;


    public Stage(EntrepriseAcceuil entreprise, String sujetPropose, String lieuExecution, String resultatAttendu, int montantPrevisionnel, String listAvantage) {
        this.entreprise = entreprise;
        this.sujetPropose = sujetPropose;
        this.lieuExecution = lieuExecution;
        this.resultatAttendu = resultatAttendu;
        this.montantPrevisionnel = montantPrevisionnel;
        this.listAvantage = listAvantage;
    }

    public Boolean getEstValider() {
        return estValider;
    }

    public void setEstValider(Boolean estValider) {
        this.estValider = estValider;
    }

    public EntrepriseAcceuil getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(EntrepriseAcceuil entreprise) {
        this.entreprise = entreprise;
    }

    public String getSujetPropose() {
        return sujetPropose;
    }

    public void setSujetPropose(String sujetPropose) {
        this.sujetPropose = sujetPropose;
    }

    public String getLieuExecution() {
        return lieuExecution;
    }

    public void setLieuExecution(String lieuExecution) {
        this.lieuExecution = lieuExecution;
    }

    public String getResultatAttendu() {
        return resultatAttendu;
    }

    public void setResultatAttendu(String resultatAttendu) {
        this.resultatAttendu = resultatAttendu;
    }

    public int getMontantPrevisionnel() {
        return montantPrevisionnel;
    }

    public void setMontantPrevisionnel(int montantPrevisionnel) {
        this.montantPrevisionnel = montantPrevisionnel;
    }

    public String getListAvantage() {
        return listAvantage;
    }

    public void setListAvantage(String listAvantage) {
        this.listAvantage = listAvantage;
    }

    public Boolean getEstChoisit() {
        return estChoisit;
    }

    public void setEstChoisit(Boolean estChoisit) {
        this.estChoisit = estChoisit;
    }
}