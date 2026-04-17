package tdd;

public class Game {
	private int somme=0;
	void roll(int nb_quille) {
		somme+=nb_quille;
	}
	int score() {
		
		return somme;
	}
}
