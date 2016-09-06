package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
	String printRes;
	@Before
	public void setUp() throws Exception {
		printRes = FizzBuzz.print();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void shouldPrintNumber() {
		assertThat( printRes, containsString("1"));
		assertThat( printRes, containsString("98"));
		}
	
	@Test
	public void shouldPrintFizz() {
		assertThat( printRes, containsString("Fizz"));
		}
	
	@Test
	public void shouldPrintBuzz() {
		assertThat( printRes, containsString("Buzz"));
		}
	@Test
	public void shouldPrintFizzBuzz() {
		assertThat( printRes, containsString("FizzBuzz"));
		}
}
