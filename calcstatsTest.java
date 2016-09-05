package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
public class calcstatsTest {

	private calcstats calcstats;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	 public void should_get_stats_for_one_number() {
			calcstats = new calcstats(new int[] {1});
	        checkStatistics(1, 1, 1, 1);
	    }
	
	@Test
    public void should_get_stats_for_two_numbers() {
        calcstats = new calcstats(new int[] {2,-1});
        checkStatistics(-1,2,2,0.5);
    }

	@Test
	public void testGetMinimum() {
		calcstats = new calcstats(new int[] {2,-1,0});
		assertEquals(calcstats.getMinimum(),-1);
	}

	@Test
	public void testGetMaxmum() {
		calcstats = new calcstats(new int[] {2,-1,0});
		assertEquals(calcstats.getMaxmum(),2);
	}

	@Test
	public void testGetLength() {
		calcstats = new calcstats(new int[] {2,-1,0});
		assertEquals(calcstats.getLength(),3);
	}

	@Test
	public void testGetAvg() {
		calcstats = new calcstats(new int[] {2,-1,1});
		assertEquals(calcstats.getAvg(),1);
	}
	
	private void checkStatistics(int minimum, int maxmum, int count, double avg) {
	        assertThat( calcstats.getMinimum(), is(minimum));
	        assertThat( calcstats.getMaxmum(), is(maxmum));
	        assertThat( calcstats.getLength(), is(count));
	        assertThat( calcstats.getAvg(), is(0.01));
	    }
}
