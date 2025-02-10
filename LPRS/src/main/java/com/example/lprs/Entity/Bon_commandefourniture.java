package com.example.lprs.Entity;

public class Bon_commandefourniture {
    private int ref_fourniture;
    private int ref_bon_commande;

    public Bon_commandefourniture() {
    }

    public Bon_commandefourniture(int ref_fourniture, int ref_bon_commande) {
        this.ref_fourniture = ref_fourniture;
        this.ref_bon_commande = ref_bon_commande;
    }

    public int getRef_fourniture() {
        return ref_fourniture;
    }

    public void setRef_fourniture(int ref_fourniture) {
        this.ref_fourniture = ref_fourniture;
    }

    public int getRef_bon_commande() {
        return ref_bon_commande;
    }

    public void setRef_bon_commande(int ref_bon_commande) {
        this.ref_bon_commande = ref_bon_commande;
    }
}
