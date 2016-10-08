package Exo4;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        De de = new De();
        int i=0;
        int NbrJoueur = 0;
        Joueur max = new Joueur();
        System.out.print("Entre le nombre de joueur  : ");
        NbrJoueur = clavier.nextInt();
        int tours = 0;
        System.out.print("Entre le nombre de tours  : ");
        tours = clavier.nextInt();
        clavier.nextLine();
        Joueur[] tab = new Joueur[NbrJoueur];
        int d=0;
        for(i=0;i<NbrJoueur;i++) {
            System.out.print("Entre un pseudo pour le joueur : ");
            tab[i].pseudo = clavier.nextLine();
            tab[i].score = 0;
        }
           for (int j = 0; j<tours; j++) {
               for (i = 0; i < NbrJoueur; i++) {
                   tab[i].score=Joueur.CalculeScore(de.LancerDe());

               }
           }
                    max.score=tab[0].score;
                 for(i=1;i<NbrJoueur;i++){
                          if(max.score < tab[i].score){
                             max.score=tab[i].score;
                          }
                 }
                  System.out.println("Le gagnant est le joueur " + max.pseudo + " avec le score de : " + max.score + " points ");
    }
}


