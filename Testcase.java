package massive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Testcase {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testm1() throws Exception{
	    Massive massive = new Massive();
	    assertEquals(9, massive.arrMaxValue());
	}

    @Test
	void testm2() throws Exception{
	    Massive massive = new Massive();
	    int mas[] = {0, 1, 2, 4, 5, 6, 7, 9}; 
	    assertArrayEquals(mas, massive.arrSorting());
	}

    @Test
	void testm3() throws Exception{
	    Massive massive = new Massive();
	    int mas[] = {2, 0, 9, 6, 4, 7, 5, 1}; 
	    assertArrayEquals(mas, massive.reverseOrder());
	}

    @Test
	void testm4() throws Exception{
	    Massive massive = new Massive();
	    String act = "/";
	    int a = 17;
        int b = 0;
	    double result = 3.5;
	    assertEquals(result, massive.calculator(a, b, act), 0.5);
    }

 
}