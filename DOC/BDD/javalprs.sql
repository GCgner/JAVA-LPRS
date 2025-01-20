-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 20 jan. 2025 à 14:51
-- Version du serveur : 5.7.40
-- Version de PHP : 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `javalprs`
--

-- --------------------------------------------------------

--
-- Structure de la table `bon_commande`
--

DROP TABLE IF EXISTS `bon_commande`;
CREATE TABLE IF NOT EXISTS `bon_commande` (
  `id_bon_commande` int(11) NOT NULL,
  `date_commande` date NOT NULL,
  `ref_utilisateur` int(11) DEFAULT NULL,
  `ref_fournisseur` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_bon_commande`),
  KEY `ref_utilisateur` (`ref_utilisateur`),
  KEY `ref_fournisseur` (`ref_fournisseur`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `bon_commandefourniture`
--

DROP TABLE IF EXISTS `bon_commandefourniture`;
CREATE TABLE IF NOT EXISTS `bon_commandefourniture` (
  `ref_fourniture` int(11) NOT NULL,
  `ref_bon_commande` int(11) NOT NULL,
  PRIMARY KEY (`ref_fourniture`,`ref_bon_commande`),
  KEY `ref_bon_commande` (`ref_bon_commande`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `demande_de_fourniture`
--

DROP TABLE IF EXISTS `demande_de_fourniture`;
CREATE TABLE IF NOT EXISTS `demande_de_fourniture` (
  `id_demande` int(11) NOT NULL,
  `quantite` int(11) NOT NULL,
  `raison` text,
  `statut` varchar(50) DEFAULT NULL,
  `justification_refus` text,
  `ref_utilisateur` int(11) DEFAULT NULL,
  `ref_fourniture` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_demande`),
  KEY `ref_utilisateur` (`ref_utilisateur`),
  KEY `ref_fourniture` (`ref_fourniture`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `dossier_inscription`
--

DROP TABLE IF EXISTS `dossier_inscription`;
CREATE TABLE IF NOT EXISTS `dossier_inscription` (
  `id_dossier` int(11) NOT NULL,
  `date_inscription` date NOT NULL,
  `heure_inscription` time NOT NULL,
  `filiere_interet` varchar(255) DEFAULT NULL,
  `motivation` text,
  `ref_etudiant` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_dossier`),
  KEY `ref_etudiant` (`ref_etudiant`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

DROP TABLE IF EXISTS `etudiant`;
CREATE TABLE IF NOT EXISTS `etudiant` (
  `id_etudiant` int(11) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `prenom` varchar(100) NOT NULL,
  `dernier_diplome` varchar(255) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `telephone` varchar(15) DEFAULT NULL,
  `adresse` text,
  `ref_utilisateur` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_etudiant`),
  KEY `ref_utilisateur` (`ref_utilisateur`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

DROP TABLE IF EXISTS `fournisseur`;
CREATE TABLE IF NOT EXISTS `fournisseur` (
  `id_fournisseur` int(11) NOT NULL,
  `contact` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `telephone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_fournisseur`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `fourniture`
--

DROP TABLE IF EXISTS `fourniture`;
CREATE TABLE IF NOT EXISTS `fourniture` (
  `id_fourniture` int(11) NOT NULL,
  `libelle` varchar(100) NOT NULL,
  `description` text,
  `stock` int(11) DEFAULT NULL,
  `ref_fournisseur` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_fourniture`),
  KEY `ref_fournisseur` (`ref_fournisseur`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `rendez_vous`
--

DROP TABLE IF EXISTS `rendez_vous`;
CREATE TABLE IF NOT EXISTS `rendez_vous` (
  `id_rendez_vous` int(11) NOT NULL,
  `date_rdv` date NOT NULL,
  `heure_rdv` time NOT NULL,
  `salle` varchar(100) DEFAULT NULL,
  `ref_utilisateur` int(11) DEFAULT NULL,
  `ref_dossier_inscription` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_rendez_vous`),
  KEY `ref_utilisateur` (`ref_utilisateur`),
  KEY `ref_dossier_inscription` (`ref_dossier_inscription`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id_utilisateur` int(11) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `prenom` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `roles` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_utilisateur`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
