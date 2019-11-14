package com.company;

import verbe.*;

public class Main {

    public static void main(String[] args) {
        ListeVerbe l = new ListeVerbe(9);
        l.list_verb.add(new PremierGroupe("Danser"));
        l.list_verb.add(new DeuxiemeGroupe("Finir"));
        l.list_verb.add(new TroisiemeGroupeEndre("Prendre"));

       System.out.println(l.conjugue1erPersonneSingulier());
       System.out.println(l.conjugue1erPersonnePluriel());
       System.out.println(l.conjugueParticipePresent());
       System.out.println(l.conjugueParticipePasse());
    }
}
