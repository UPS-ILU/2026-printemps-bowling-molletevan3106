package tdd;

public class Game {
    private int somme = 0;
    private boolean bonus = false;

    void roll(int premierEssai, int deuxiemeEssai) {
        if (estSpare(premierEssai, deuxiemeEssai)) {
            gererSpare(premierEssai, deuxiemeEssai);
        } else if (bonus) {
            gererBonus(premierEssai, deuxiemeEssai);
        } else {
            ajouterScoreNormal(premierEssai, deuxiemeEssai);
        }
    }

    int score() {
        return somme;
    }
    private boolean estSpare(int premierEssai, int deuxiemeEssai) {
        return premierEssai != 10 && (premierEssai + deuxiemeEssai) == 10;
    }

    private void gererSpare(int premierEssai, int deuxiemeEssai) {
        if (bonus) {
            somme += premierEssai;
        }
        bonus = true;
        somme += premierEssai + deuxiemeEssai;
    }

    private void gererBonus(int premierEssai, int deuxiemeEssai) {
        somme += premierEssai;
        somme += premierEssai + deuxiemeEssai;
        bonus = false;
    }

    private void ajouterScoreNormal(int premierEssai, int deuxiemeEssai) {
        somme += premierEssai + deuxiemeEssai;
        bonus = false;
    }
}
