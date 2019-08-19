<<<<<<< HEAD
import java.lang.reflect.Field;
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
public class LocalizacaoTest {
	private static final Random rand = Randomizador.getRandom();
	private int profundidade;
	private int largura;
	public static Localizacao localizacao;
	public static Animal animal;
	private Object[][] campo;
	public static Campo campo1;
	public static Campo campo2;
	public Campo campes;

	public LocalizacaoTest() {
		Localizacao local = new Localizacao(10, 10);

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
	 * Test of equals method, of class Localizacao.
	 */
	@Test
	public void testEquals() {
		System.out.println("As localizacoes s„o iguaiss");
		Localizacao instance = new Localizacao(10, 10);
		assertTrue(instance.equals(instance));

	}

	@Test
	public void testNotEquals() {
		System.out.println("As localizacoes s„o diferentes");
		Localizacao instance = new Localizacao(10, 10);
		Localizacao localizacao2 = new Localizacao(11, 11);
		assertFalse(instance.equals(localizacao2));
	}

	/**
	 * Test of toString method, of class Localizacao.
	 */
	@Test
	public void testToString() {
		System.out.println("Devolve os valores corretamente");
		int v1 = 10;
		int v2 = 10;
		Localizacao instance = new Localizacao(v1, v2);
		assertEquals("10,10", instance.toString());
	}

	/**
	 * Test of setLinha method, of class Localizacao.
	 */
	@Test
	public void testSetLinha() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		System.out.println("A linha foi atribuida corretamente");
		Class<Localizacao> instance = Localizacao.class;
		Field linha = instance.getDeclaredField("linha");
		linha.setAccessible(true);
		Localizacao instance2 = new Localizacao(10, 10);
		int defLinha = 10;
		instance2.setLinha(defLinha);
		assertEquals(defLinha, linha.get(instance2));
	}

	/**
	 * Test of setColuna method, of class Localizacao.
	 */
	@Test
	public void testSetColuna() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		System.out.println("A coluna foi atribuida corretamente");
		Class<Localizacao> instance = Localizacao.class;
		Field coluna = instance.getDeclaredField("coluna");
		coluna.setAccessible(true);
		Localizacao instance2 = new Localizacao(10, 10);
		int defColuna = 10;
		instance2.setLinha(defColuna);
		assertEquals(defColuna, coluna.get(instance2));
	}

	/**
	 * s Test of hashCode method, of class Localizacao.
	 */
	@Test
	public void testHashCode() {
		System.out.println("O hash foi definido conforme a regra de negocio");
		int defLinha = 10;
		int defColuna = 10;
		Localizacao instance = new Localizacao(defLinha, defColuna);
		int operacao = (defLinha << 16) + defColuna;
		assertEquals(operacao, instance.hashCode());

	}

	/**
	 * Test of getLinha method, of class Localizacao.
	 */
	@Test
	public void testGetLinha() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		System.out.println("A coluna foi devolvida corretamente");
		Class<Localizacao> instance = Localizacao.class;
		Field linha = instance.getDeclaredField("linha");
		linha.setAccessible(true);
		Localizacao instance2 = new Localizacao(10, 10);
		assertEquals(linha.get(instance2), instance2.getLinha());
	}

	/**
	 * Test of getColuna method, of class Localizacao.
	 */
	@Test
	public void testGetColuna() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		System.out.println("A linha foi devolvida corretamente");
		Class<Localizacao> instance = Localizacao.class;
		Field coluna = instance.getDeclaredField("coluna");
		coluna.setAccessible(true);
		Localizacao instance2 = new Localizacao(10, 10);
		assertEquals(coluna.get(instance2), instance2.getColuna());
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
public class LocalizacaoTest {
    private final Random rand = Randomizador.getRandom();
    private int profundidade;
    private int largura;
    public static Localizacao localizacao;
    public static Animal animal;
    private Object[][] campo;
    public static Campo campo1;
    public static Campo campo2;
    public Campo campes;
    
    
    
    public LocalizacaoTest() {
        Localizacao local = new Localizacao(10,10);
        
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
     * Test of equals method, of class Localizacao.
     */
    @Test
    public void testEquals() {
        System.out.println("As localizacoes s√£o iguaiss");
        Localizacao instance = new Localizacao(10,10);
        assertTrue(instance.equals(instance));
     
    }
    
    @Test
    public void testNotEquals() {
        System.out.println("As localizacoes s√£o diferentes");
        Localizacao instance = new Localizacao(10,10);
        Localizacao localizacao2 = new Localizacao(11,11);
        assertFalse(instance.equals(localizacao2));
    }

    /**
     * Test of toString method, of class Localizacao.
     */
    @Test
    public void testToString() {
        System.out.println("Devolve os valores corretamente");
        int v1 = 10;
        int v2 = 10;
        Localizacao instance = new Localizacao(v1,v2);
        assertEquals("10,10",instance.toString());
    }

    /**
     * Test of setLinha method, of class Localizacao.
     */
    @Test
    public void testSetLinha() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("A linha foi atribuida corretamente");
         Class<Localizacao> instance = Localizacao.class;
         Field linha = instance.getDeclaredField("linha");
         linha.setAccessible(true);
         Localizacao instance2 = new Localizacao(10,10);
         int defLinha = 10;
        instance2.setLinha(defLinha);
        assertEquals(defLinha, linha.get(instance2));
    }

    /**
     * Test of setColuna method, of class Localizacao.
     */
    @Test
    public void testSetColuna() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("A coluna foi atribuida corretamente");
        Class<Localizacao> instance = Localizacao.class;
         Field coluna = instance.getDeclaredField("coluna");
         coluna.setAccessible(true);
         Localizacao instance2 = new Localizacao(10,10);
         int defColuna = 10;
        instance2.setLinha(defColuna);
        assertEquals(defColuna, coluna.get(instance2));
    }

    /**s
     * Test of hashCode method, of class Localizacao.
     */
    @Test
    public void testHashCode() {
        System.out.println("O hash foi definido conforme a regra de negocio");
        int defLinha = 10;
        int defColuna = 10;
        Localizacao instance = new Localizacao(defLinha,defColuna);
        int operacao = (defLinha<<16)+defColuna;
        assertEquals(operacao, instance.hashCode());
        
    }

    /**
     * Test of getLinha method, of class Localizacao.
     */
    @Test
    public void testGetLinha() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("A coluna foi devolvida corretamente");
        Class<Localizacao> instance = Localizacao.class;
         Field linha = instance.getDeclaredField("linha");
         linha.setAccessible(true);
         Localizacao instance2 = new Localizacao(10,10);
         assertEquals(linha.get(instance2), instance2.getLinha());
    }

    /**
     * Test of getColuna method, of class Localizacao.
     */
    @Test
    public void testGetColuna() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("A linha foi devolvida corretamente");
         Class<Localizacao> instance = Localizacao.class;
         Field coluna = instance.getDeclaredField("coluna");
         coluna.setAccessible(true);
         Localizacao instance2 = new Localizacao(10,10);
         assertEquals(coluna.get(instance2), instance2.getColuna());
    }
    
}
>>>>>>> 0da62794867b406a13927c286c91db8860e48fbd
