package fr.game;

import java.util.Scanner;

public class Personnage {
    //  attributs de la class Personnage
    private int pointDeVie;
    private int degats;
    private String nom;

    // contructeur vide
    public Personnage() {

    }

    // constructeur avec l'ensembles des parametres
    public Personnage(int pointDeVie, int degats, String nom) {
        this.pointDeVie = pointDeVie;
        this.degats = degats;
        this.nom = nom;
    }
    /*
     Créer un personnage avec tous ses attributs.
     Demande a l'utilisateur d'entrer le nom du personnage.
     retour: une instance de la classe Personnage correctement instancié.
     */
    public static void personnageFactory () {
//Demander a l'utilisateur un nom de personnage ok
//Créer un nouveau personnage en utilisant le constructeur
// avec tous ses params (dont le nom qui vient d' etre choisie par l'utilisateur)
//  Retourner l'instance du personnage
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre nom pour le jeu :");
        String nom = sc.nextLine();
        Personnage p = new Personnage();
        p.setPointDeVie(100);
        p.setDegats(15);
        p.setNom(nom);
        System.out.println(p);
    }
    //ensembles des geter and setter
    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public int getDegats() {
        return degats;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "pointDeVie=" + this.pointDeVie +
                ", degats=" + this.degats +
                ", nom='" + this.nom + '\'' +
                '}';
    }
}
