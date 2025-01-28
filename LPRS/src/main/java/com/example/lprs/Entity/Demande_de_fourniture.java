public class DemandeDeFourniture {
    private int idDemande;
    private int quantite;
    private String raison;
    private String statut;
    private String justificationRefus;
    private Integer refUtilisateur;
    private Integer refFourniture;

    public DemandeDeFourniture() {}

    public DemandeDeFourniture(int idDemande, int quantite, String raison, String statut, String justificationRefus, Integer refUtilisateur, Integer refFourniture) {
        this.idDemande = idDemande;
        this.quantite = quantite;
        this.raison = raison;
        this.statut = statut;
        this.justificationRefus = justificationRefus;
        this.refUtilisateur = refUtilisateur;
        this.refFourniture = refFourniture;
    }

    // Getters and setters for each field
    public int getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(int idDemande) {
        this.idDemande = idDemande;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getJustificationRefus() {
        return justificationRefus;
    }

    public void setJustificationRefus(String justificationRefus) {
        this.justificationRefus = justificationRefus;
    }

    public Integer getRefUtilisateur() {
        return refUtilisateur;
    }

    public void setRefUtilisateur(Integer refUtilisateur) {
        this.refUtilisateur = refUtilisateur;
    }

    public Integer getRefFourniture() {
        return refFourniture;
    }

    public void setRefFourniture(Integer refFourniture) {
        this.refFourniture = refFourniture;
    }
}

