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
public class Personne implements Serializable {

    private String nom;
    private String prenom;
    private Integer age;

    /*
* Accesseurs et mutateurs
     */
    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " " + age + " ans";
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
