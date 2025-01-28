public class rendre_vous {

    private int id_rendez_vous;
    private Date date_rdv;
    private Time heure_rdv;
    private String salle;
    private Integer ref_utilisateur;
    private Integer ref_dossier_inscription;

    public rendre_vous() {
    }

    public rendre_vous(int id_rendez_vous, Date date_rdv, Time heure_rdv, String salle, Integer ref_utilisateur, Integer ref_dossier_inscription) {
        this.id_rendez_vous = id_rendez_vous;
        this.date_rdv = date_rdv;
        this.heure_rdv = heure_rdv;
        this.salle = salle;
        this.ref_utilisateur = ref_utilisateur;
        this.ref_dossier_inscription = ref_dossier_inscription;
    }

    public int getId_rendez_vous() {
        return id_rendez_vous;
    }

    public void setId_rendez_vous(int id_rendez_vous) {
        this.id_rendez_vous = id_rendez_vous;
    }

    public Date getDate_rdv() {
        return date_rdv;
    }

    public void setDate_rdv(Date date_rdv) {
        this.date_rdv = date_rdv;
    }

    public Time getHeure_rdv() {
        return heure_rdv;
    }

    public void setHeure_rdv(Time heure_rdv) {
        this.heure_rdv = heure_rdv;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public Integer getRef_utilisateur() {
        return ref_utilisateur;
    }

    public void setRef_utilisateur(Integer ref_utilisateur) {
        this.ref_utilisateur = ref_utilisateur;
    }

    public Integer getRef_dossier_inscription() {
        return ref_dossier_inscription;
    }

    public void setRef_dossier_inscription(Integer ref_dossier_inscription) {
        this.ref_dossier_inscription = ref_dossier_inscription;
    }
}
