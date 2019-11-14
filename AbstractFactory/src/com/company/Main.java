package com.company;

import chargueurListe.ChargeurVerbe;
import creeVerbe.src.CreeVerbe1erGroupe;
import verbes.src.Verbe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        File fiche = new File("doc/listeverbes1ergroupe.txt");
        try {
            for(Verbe v: ChargeurVerbe.chargeur(new BufferedReader(new FileReader(fiche.getPath())), new CreeVerbe1erGroupe()))
            {
                System.out.println(v.getRadical());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
