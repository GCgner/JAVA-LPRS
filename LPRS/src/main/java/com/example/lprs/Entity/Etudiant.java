/*************  ✨ Codeium Command ⭐  *************/
package com.example.lprs.Entity;

public class Etudiant {
    private int idEtudiant;
    private String nom;
    private String prenom;
    private String dernierDiplome;
    private String email;
    private String telephone;
    private String adresse;
    private Integer refUtilisateur;

    public Etudiant() {
    }

    public Etudiant(int idEtudiant, String nom, String prenom, String dernierDiplome, String email, String telephone, String adresse, Integer refUtilisateur) {
        this.idEtudiant = idEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.dernierDiplome = dernierDiplome;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
        this.refUtilisateur = refUtilisateur;
    }

    // Getters and Setters
    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDernierDiplome() {
        return dernierDiplome;
    }

    public void setDernierDiplome(String dernierDiplome) {
        this.dernierDiplome = dernierDiplome;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getRefUtilisateur() {
        return refUtilisateur;
    }

    public void setRefUtilisateur(Integer refUtilisateur) {
        this.refUtilisateur = refUtilisateur;
    }
}

/******  d925489f-fbbf-4b2f-a221-57683a8eb7bb  *******/