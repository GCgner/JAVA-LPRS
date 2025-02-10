package com.example.lprs.Entity;

public class Fournisseur {
    private int idFournisseur;
    private String contact;
    private String email;
    private String telephone;

    public Fournisseur() {}

    public Fournisseur(int idFournisseur, String contact, String email, String telephone) {
        this.idFournisseur = idFournisseur;
        this.contact = contact;
        this.email = email;
        this.telephone = telephone;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

