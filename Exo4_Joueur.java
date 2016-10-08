package Exo4;

public class Joueur {
    protected static String pseudo;
    protected static int score;
    public Joueur(){
    }
        public static int CalculeScore(int d){
        score=score+d;
        return score;
    }

    }

