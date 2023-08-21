/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.io.Serializable;

/**
 *
 * @author mathi
 */
public class Article implements Serializable {

    private String titre;
    private String contenu;
    private String dateCreation;
    private String auteur;

    /*
* Accesseurs et mutateurs
     */
    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "Article{" + "titre=" + titre + ", contenu=" + contenu + 
                ", dateCreation=" + dateCreation + ", auteur=" + auteur + '}';
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

}
