package com.company;

import java.util.Scanner;

public class Etudiant {
    private String nom , prenom;
    private double [] notes;
    private double moyenne;
    // comportement
    public Etudiant(){
        var lectureClavier = new Scanner(System.in);
        System.out.println("Entrez le nom de l'Etudiant");
        nom = lectureClavier.next();
        System.out.println("Entrez le prenom de l'Etudiant");
        prenom = lectureClavier.next();
        System.out.println("Combien de notes Pour l'etudiant");
        System.out.println(prenom +" "+ nom+": ");
        var nombre = lectureClavier.nextInt();
        notes = new double[nombre];
        for (var i = 0 ; i < notes.length ; i++){
            System.out.println("Entrez la note de numero "+ (i+1)+" : ");
            notes[i] = lectureClavier.nextDouble();
        }
        moyenne = calculMoyenne();
    }
    private  double calculMoyenne(){
        var somme = 0.0;
        for (double valeurNote : notes) {
            somme += valeurNote;
        }
        return somme/notes.length;

    }
    public  void afficheEtudiant(){
        System.out.println("Les Notes de  "+prenom+" "+nom+"\n"+ "Sont :");
        for (var valeurnote : notes){
            System.out.println(" "+valeurnote+"\n");
        }
        System.out.println(" Sa moyenne vaut "+moyenne);
    }
    public double quelleMoyenne(){
        return moyenne;
    }

}// Fin de la classe Etudiant;
