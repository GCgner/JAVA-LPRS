package com.example.lprs.Entity.Repository;

import com.example.lprs.BDD.Database;
import com.example.lprs.Entity.Utilisateur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilisateurRepository {

    private final Connection bdd;

    public UtilisateurRepository() {
        this.bdd = new Database().getBdd();
    }

    public boolean inscription(Utilisateur utilisateur) {
        if (getUtilisateurByEmail(utilisateur.getEmail()) != null) {
            System.out.println("Email déjà existent !");
            return false;
        }

        String query = "INSERT INTO Utilisateur (nom, prenom, email, mdp) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = bdd.prepareStatement(query)) {
            preparedStatement.setString(1, utilisateur.getNom());
            preparedStatement.setString(2, utilisateur.getPrenom());
            preparedStatement.setString(3, utilisateur.getEmail());
            preparedStatement.setString(4, utilisateur.getMdp());
            int result = preparedStatement.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Utilisateur getUtilisateurByEmail(String email) {
        Utilisateur utilisateur = null;
        String query = "SELECT * FROM Utilisateur WHERE email = ?";

        try (PreparedStatement preparedStatement = bdd.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                utilisateur = new Utilisateur();
                utilisateur.setId_utilisateur(resultSet.getInt("id_utilisateur"));
                utilisateur.setNom(resultSet.getString("nom"));
                utilisateur.setPrenom(resultSet.getString("prenom"));
                utilisateur.setEmail(resultSet.getString("email"));
                utilisateur.setMdp(resultSet.getString("mdp"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return utilisateur;
    }

    public Utilisateur connexion(String email, String mdp) {
        String query = "SELECT * FROM Utilisateur WHERE email = ? AND mdp = ?";
        try (PreparedStatement preparedStatement = bdd.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, mdp);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setId_utilisateur(resultSet.getInt("id"));
                utilisateur.setNom(resultSet.getString("nom"));
                utilisateur.setPrenom(resultSet.getString("prenom"));
                utilisateur.setEmail(resultSet.getString("email"));
                utilisateur.setMdp(resultSet.getString("mdp"));
                return utilisateur;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
