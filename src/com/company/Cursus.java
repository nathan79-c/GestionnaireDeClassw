package com.company;

import java.util.List;
import java.util.Scanner;

public class Cursus {
    private Etudiant [] Liste;
    public Cursus(){
        var lectureClavier = new Scanner(System.in);
        System.out.println("Nombres D'Etudiants : ");
        var nbEtudiants = lectureClavier.nextInt();
        Liste = new Etudiant [nbEtudiants];
        for (var i = 0; i < Liste.length ; i++){
            Liste[i] = new Etudiant();
        }
    }
    public void afficheEtudiant(){
        for (var e : Liste) e.afficheEtudiant();
    }
}// Fin de la classe Cursus;
