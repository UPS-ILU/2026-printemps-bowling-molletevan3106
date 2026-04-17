package tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	 Game game;
	@BeforeEach
	void init() {
		game=new Game();
	}

	@Test
	void test_vide() {
		assertEquals(0,game.score());
	}
	
	@Test
	void test_aucune_quille() {
		for (int i = 0; i < 20; i++) {
			game.roll(0,0);
		}
		assertEquals(0,game.score());
	}
	@Test
	void test_une_quille() {
		for (int i = 0; i < 10; i++) {
			game.roll(1,1);
			
		}
		assertEquals(20,game.score());
	}
	@Test
	void test_uneEtdeux_quille() {
		for (int i = 0; i < 10; i++) {
			game.roll(1,2);
			
		}
		assertEquals(30,game.score());
	}
	@Test
	void test_spare() {
		game.roll(7, 3);
		game.roll(4, 0);
		for (int i = 0; i < 8; i++) {
			game.roll(0, 0);
		}
		assertEquals(18,game.score());
	}
}
