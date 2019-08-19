<<<<<<< HEAD
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Random;
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
public class SimuladorTest {

	public SimuladorTest() {
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
	 * Test of executaLongaSimulacao method, of class Simulador.
	 */
	@Test
	public void testExecutaLongaSimulacao()
			throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Class<Simulador> ecnatsni = Simulador.class;
		Field etapa = ecnatsni.getDeclaredField("etapa");
		etapa.setAccessible(true);
		Simulador instance = new Simulador();
		instance.executaLongaSimulacao();
		// System.out.println(etapa.get(instance));
		assertNotEquals(0, etapa.get(instance));
	}

	/**
	 * Test of simulacao method, of class Simulador.
	 */
	@Test
	public void testSimulacao() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Class<Simulador> ecnatsni = Simulador.class;
		Field etapa = ecnatsni.getDeclaredField("etapa");
		etapa.setAccessible(true);
		Simulador instance = new Simulador();
		int numSimulacoes = 10;
		instance.simulacao(numSimulacoes);
		assertEquals(numSimulacoes, etapa.get(instance));

	}

	/**
	 * Test of simulacaoUmaEtapa method, of class Simulador.
	 */
	@Test
	public void testSimulacaoUmaEtapa() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Class<Simulador> ecnatsni = Simulador.class;
		Field etapa = ecnatsni.getDeclaredField("etapa");
		etapa.setAccessible(true);
		Simulador instance = new Simulador();
		instance.simulacaoUmaEtapa();
		assertEquals(1, etapa.get(instance));
	}

	/**
	 * Test of redefine method, of class Simulador.
	 */
	@Test
	public void testRedefine() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Class<Simulador> ecnatsni = Simulador.class;
		Field etapa = ecnatsni.getDeclaredField("etapa");
		etapa.setAccessible(true);
		Simulador instance = new Simulador();
		instance.simulacaoUmaEtapa();
		instance.redefine();
		assertEquals(0, etapa.get(instance));

	}

	@Test
	public void povoa() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException,
			NoSuchMethodException, InvocationTargetException {
		Class<Simulador> ecnatsni = Simulador.class;
		Field animais = ecnatsni.getDeclaredField("animais");
		animais.setAccessible(true);
		Method povoa = ecnatsni.getDeclaredMethod("povoa");
		povoa.setAccessible(true);
		Simulador instance = new Simulador();
		povoa.invoke(instance);
		animais.get(instance);
		Class<Animal> animal = Animal.class;
		List<Animal> testes = (List<Animal>) animais.get(instance);
		int n = testes.size();
		int a = 0;
		for (int i = 0; i < n; i++) {
			assertEquals(Animal.class, testes.get(i).getClass().getGenericSuperclass());
		}
	}

}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Random;
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
public class SimuladorTest {
    
    public SimuladorTest() {
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
     * Test of executaLongaSimulacao method, of class Simulador.
     */
    @Test
    public void testExecutaLongaSimulacao() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Class<Simulador> ecnatsni = Simulador.class;
        Field etapa = ecnatsni.getDeclaredField("etapa");
        etapa.setAccessible(true);
        Simulador instance = new Simulador();
        instance.executaLongaSimulacao();
//        System.out.println(etapa.get(instance));
        assertNotEquals(0,etapa.get(instance));
    }

    /**
     * Test of simulacao method, of class Simulador.
     */
    @Test
    public void testSimulacao() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Class<Simulador> ecnatsni = Simulador.class;
        Field etapa = ecnatsni.getDeclaredField("etapa");
        etapa.setAccessible(true);
        Simulador instance = new Simulador();
        int numSimulacoes = 10;
        instance.simulacao(numSimulacoes);
        assertEquals(numSimulacoes,etapa.get(instance));
        
    }

    /**
     * Test of simulacaoUmaEtapa method, of class Simulador.
     */
    @Test
    public void testSimulacaoUmaEtapa() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Class<Simulador> ecnatsni = Simulador.class;
        Field etapa = ecnatsni.getDeclaredField("etapa");
        etapa.setAccessible(true);
        Simulador instance = new Simulador();
        instance.simulacaoUmaEtapa();
        assertEquals(1,etapa.get(instance));
    }

    /**
     * Test of redefine method, of class Simulador.
     */
    @Test
    public void testRedefine() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Class<Simulador> ecnatsni = Simulador.class;
        Field etapa = ecnatsni.getDeclaredField("etapa");
        etapa.setAccessible(true);
        Simulador instance = new Simulador();
        instance.simulacaoUmaEtapa();
         instance.redefine();
        assertEquals(0,etapa.get(instance));
        
    }
    @Test
    public void povoa() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Simulador> ecnatsni = Simulador.class;
        Field animais = ecnatsni.getDeclaredField("animais");
        animais.setAccessible(true);
        Method povoa = ecnatsni.getDeclaredMethod("povoa");
        povoa.setAccessible(true);
        Simulador instance = new Simulador();
        povoa.invoke(instance);
        animais.get(instance);
        Class<Animal> animal =  Animal.class;
        List<Animal> testes = (List<Animal>) animais.get(instance);
        int n = testes.size();
        int a = 0;
        for (int i = 0; i < n; i++) {
            assertEquals(Animal.class, testes.get(i).getClass().getGenericSuperclass());
        }
    }
    
}
>>>>>>> 0da62794867b406a13927c286c91db8860e48fbd
