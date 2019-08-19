<<<<<<< HEAD
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabri
 */
public class ContadorTest {
	Contador contador;

	public ContadorTest() {
		Contador contador = new Contador("Nome");
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	/**
	 * Test of getName method, of class Contador.
	 */
	@Test
	public void testGetName() {
		System.out.println("getName");
		Contador conta = new Contador("");
		conta.getName();
		assertEquals("", conta.getName());

	}

	/**
	 * Test of getCount method, of class Contador.
	 */
	@Test
	public void testGetCount() {
		System.out.println("getCount");
		Contador conta = new Contador("");
		for (int i = 0; i < 10; i++) {
			conta.increment();
		}
		assertEquals(10, conta.getCount());
	}

	/**
	 * Test of increment method, of class Contador.
	 */
	@Test
	public void testIncrement() {
		System.out.println("increment");
		Contador conta = new Contador("");
		conta.increment();
		assertEquals(1, conta.getCount());
	}

	/**
	 * Test of reset method, of class Contador.
	 */
	@Test
	public void testReset() {
		System.out.println("reset");
		Contador conta = new Contador("");
		for (int i = 0; i < 10; i++) {
			conta.increment();
		}
		conta.reset();
		assertEquals(0, conta.getCount());
	}

}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabri
 */
public class ContadorTest {
    Contador contador;
    public ContadorTest() {
        Contador contador = new Contador("Nome");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Contador.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Contador conta = new Contador("");
        conta.getName();
        assertEquals("",conta.getName());
        
    }

    /**
     * Test of getCount method, of class Contador.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        Contador conta = new Contador("");
        for (int i = 0; i < 10; i++) {
            conta.increment();
        }
        assertEquals(10,conta.getCount());
    }

    /**
     * Test of increment method, of class Contador.
     */
    @Test
    public void testIncrement() {
        System.out.println("increment");
        Contador conta = new Contador("");
        conta.increment();
        assertEquals(1,conta.getCount());
    }

    /**
     * Test of reset method, of class Contador.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
                Contador conta = new Contador("");
        for (int i = 0; i < 10; i++) {
            conta.increment();
        }
        conta.reset();
        assertEquals(0,conta.getCount());
    }
    
}
>>>>>>> 0da62794867b406a13927c286c91db8860e48fbd
