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
    private int ouEstlaPlusPetite(int debut){
        int indiceDuMin = debut;
        for(var j = debut+1; j < Liste.length; j++)
            if(Liste[j].quelleMoyenne() <  Liste[indiceDuMin].quelleMoyenne()) indiceDuMin = j ;
        return indiceDuMin;
    }
    public void  classerMoyenne (){
        int indiceDuPlusPetit;
        Etudiant tmp;
        for (var i = 0; i < Liste.length; i++){
            indiceDuPlusPetit = ouEstlaPlusPetite(i);
            tmp = Liste[i];
            Liste[i]= Liste[indiceDuPlusPetit];
            Liste[indiceDuPlusPetit]=tmp;
        }
    }
}// Fin de la classe Cursus;
