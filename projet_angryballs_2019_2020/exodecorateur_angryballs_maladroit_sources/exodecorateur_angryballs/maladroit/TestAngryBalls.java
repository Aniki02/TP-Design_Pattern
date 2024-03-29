package exodecorateur_angryballs.maladroit;

import java.awt.Color;
import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;

import exodecorateur_angryballs.maladroit.modele.Bille;
import exodecorateur_angryballs.maladroit.modele.BilleMvtNewtonArret;
import exodecorateur_angryballs.maladroit.modele.BilleMvtNewtonFrottementRebond;
import exodecorateur_angryballs.maladroit.modele.BilleMvtRUPasseMurailles;
import exodecorateur_angryballs.maladroit.modele.BilleMvtRURebond;
import exodecorateur_angryballs.maladroit.modele.BilleMvtPesanteurFrottementRebond;
import exodecorateur_angryballs.maladroit.vues.CadreAngryBalls;
import exodecorateur_angryballs.maladroit.vues.VueBillard;
import exodecorateur_angryballs.maladroit.modele.*;

/**
 * Gestion d'une liste de billes en mouvement ayant toutes un comportement different
 * 
 * Ideal pour mettre en place le DP decorator
 * */
public class TestAngryBalls
{

/**
 * @param args
 */
public static void main(String[] args)
{
//------------------- creation de la liste (pour l'instant vide) des billes -----------------------

Vector<Bille> billes = new Vector<Bille>();

//---------------- creation de la vue responsable du dessin des billes -------------------------

CadreAngryBalls cadre = new CadreAngryBalls("Angry balls",
                                        "Animation de billes ayant des comportements differents. Situation ideale pour mettre en place le DP Decorator",
                                        billes);

cadre.montrer(); // on rend visible la vue

//------------- remplissage de la liste avec 4 billes -------------------------------



double xMax, yMax;
double vMax = 0.1;
xMax = cadre.largeurBillard();      // abscisse maximal
yMax = cadre.hauteurBillard();      // ordonnee maximale

double rayon = 0.05*Math.min(xMax, yMax); // rayon des billes : ici toutes les billes ont le meme rayon, mais ce n'est pas obligatoire

Vecteur p0, p1, p2, p3, p4,  v0, v1, v2, v3, v4;    // les positions des centres des billes et les vecteurs vitesse au demarrage. 
                                                    // Elles vont etre choisies aleatoirement

//------------------- creation des vecteurs position des billes ---------------------------------

p0 = Vecteur.creationAleatoire(0, 0, xMax, yMax);
p1 = Vecteur.creationAleatoire(0, 0, xMax, yMax);
p2 = Vecteur.creationAleatoire(0, 0, xMax, yMax);
p3 = Vecteur.creationAleatoire(0, 0, xMax, yMax);
p4 = Vecteur.creationAleatoire(0, 0, xMax, yMax);

//------------------- creation des vecteurs vitesse des billes ---------------------------------

v0 = Vecteur.creationAleatoire(-vMax, -vMax, vMax, vMax);
v1 = Vecteur.creationAleatoire(-vMax, -vMax, vMax, 0);
v2 = Vecteur.creationAleatoire(-vMax, -vMax, vMax, vMax);
v3 = Vecteur.creationAleatoire(-vMax, -vMax, vMax, vMax);
v4 = Vecteur.creationAleatoire(-vMax, -vMax, vMax, vMax);

//--------------- ici commence la partie e changer ---------------------------------

billes.add(new         BilleMvtRURebond(p0, rayon, v0, Color.red));
billes.add(new      BilleMvtPesanteurFrottementRebond(p1, rayon, v1, new Vecteur(0,0.001), Color.yellow));
billes.add(new              BilleMvtNewtonFrottementRebond(p2, rayon, v2, Color.green));
billes.add(new              BilleMvtRUPasseMurailles(p3, rayon, v3, Color.cyan));
billes.add(new BilleMvtNewtonArret(p4, rayon, v4,  Color.black));

//---------------------- ici finit la partie e changer -------------------------------------------------------------


System.out.println("billes = " + billes);


//-------------------- creation de l'objet responsable de l'animation (c'est un thread separe) -----------------------

AnimationBilles animationBilles = new AnimationBilles(billes, cadre);

//----------------------- mise en place des ecouteurs de boutons qui permettent de contreler (un peu...) l'application -----------------

EcouteurBoutonLancer ecouteurBoutonLancer = new EcouteurBoutonLancer(animationBilles);
EcouteurBoutonArreter ecouteurBoutonArreter = new EcouteurBoutonArreter(animationBilles); 

//------------------------- activation des ecouteurs des boutons et ea tourne tout seul ------------------------------


cadre.lancerBilles.addActionListener(ecouteurBoutonLancer);             // maladroit : e changer
cadre.arreterBilles.addActionListener(ecouteurBoutonArreter);           // maladroit : e changer




}

}
