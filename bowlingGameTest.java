package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class bowlingGameTest {
	 private bowlingGame game;

	@Before
	public void setUp() throws Exception {
		game = new bowlingGame();
	}
	
	 private void rollForMany(int frames, int pins) {
	        for (int i = 0; i < frames; i++) {
	            game.roll(pins);
	        }
	    }
	 
	@After
	public void tearDown() throws Exception {
	}

	@Test
    public void should_score_zero_when_knock_down_nothing() {
        rollForMany(20, 0);
        assertEquals(game.score(),0);
    }
	 @Test
	    public void should_add_all_pins_when_no_bonus() {
	        rollForMany(20, 1);
	        assertEquals(game.score(),20);
	    }
	 @Test
	    public void should_add_spare_bonus_given_not_the_last_frame_spare() {
	        rollOfSpare();
	        game.roll(6);
	        rollForMany(17, 0);
	        assertEquals(game.score(),22);
	    }
	 @Test
	    public void should_add_spike_bonus_given_not_the_last_frame_spike() {
	        rollOfSpike();
	        game.roll(5);
	        game.roll(4);
	        rollForMany(16, 0);
	        assertEquals(game.score(),28);
	    }
	 
	 @Test
	 public void should_add_bonus_given_last_frame_spare() {
		 rollForMany(18,0);
		 rollOfSpare();
		 game.roll(4);
		 assertEquals(game.score(),14);
	}
	 
	 @Test
	 public void should_add_bonus_given_last_frame_spike() {
		 rollForMany(18,0);
		 rollOfSpike();
		 game.roll(8);
		 game.roll(2);
		 assertEquals(game.score(),20);
	}
	 
	 private void rollOfSpare() {
		 game.roll(5);
		 game.roll(5);
	}
	 
	 private void rollOfSpike() {
		 game.roll(10);
	}
}
