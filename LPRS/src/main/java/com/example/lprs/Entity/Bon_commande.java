package com.example.lprs.Entity;
public class Bon_commande {

    private int id_bon_commande;
    private Date date_commande;
    private int ref_utilisateur;
    private int ref_fournisseur;

    public Bon_commande() {
    }

    public Bon_commande(int id_bon_commande, Date date_commande, int ref_utilisateur, int ref_fournisseur) {
        this.id_bon_commande = id_bon_commande;
        this.date_commande = date_commande;
        this.ref_utilisateur = ref_utilisateur;
        this.ref_fournisseur = ref_fournisseur;
    }

    public int getId_bon_commande() {
        return id_bon_commande;
    }

    public void setId_bon_commande(int id_bon_commande) {
        this.id_bon_commande = id_bon_commande;
    }

    public Date getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(Date date_commande) {
        this.date_commande = date_commande;
    }

    public int getRef_utilisateur() {
        return ref_utilisateur;
    }

    public void setRef_utilisateur(int ref_utilisateur) {
        this.ref_utilisateur = ref_utilisateur;
    }

    public int getRef_fournisseur() {
        return ref_fournisseur;
    }

    public void setRef_fournisseur(int ref_fournisseur) {
        this.ref_fournisseur = ref_fournisseur;
    }

}
