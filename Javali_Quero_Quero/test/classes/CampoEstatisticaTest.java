<<<<<<< HEAD
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import static org.junit.Assert.*;

/**
 *
 * @author gabri
 */
public class CampoEstatisticaTest {
	private HashMap<Class, Contador> contadores;

	public CampoEstatisticaTest() {
		contadores = new HashMap<Class, Contador>();

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
	 * Test of getPopulationDetails method, of class CampoEstatistica.
	 */
	@Test
	public void testGetPopulationDetails() {
		CampoEstatistica instance = new CampoEstatistica();
		Campo campo = new Campo(10, 10);
		Localizacao local = new Localizacao(5, 5);
		Javali java1 = new Javali(true, campo, local);
		// Simulado um buffer temporario
		assertNotNull(instance.getPopulationDetails(campo));
	}

	/**
	 * Test of redefine method, of class CampoEstatistica.
	 * 
	 * @throws java.lang.NoSuchFieldException
	 * @throws java.lang.IllegalAccessException
	 */
	@Test
	public void testRedefine() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Class<CampoEstatistica> instance = CampoEstatistica.class;
		Field contadoresValidos = instance.getDeclaredField("contadoresValidos");
		contadoresValidos.setAccessible(true);
		CampoEstatistica campes = new CampoEstatistica();
		campes.redefine();
		System.out.println("contadoresValidos teve seu valor alterado para False");
		assertFalse((boolean) contadoresValidos.get(campes));
		// Verifica se est· atribuindo o valor false para a var
		// contadores validos, conforme o metodo indica

	}

	/**
	 * Test of incrementaContador method, of class CampoEstatistica.
	 * 
	 * @throws java.lang.NoSuchFieldException
	 * @throws java.lang.IllegalAccessException
	 */
	@Test
	public void testIncrementaContador() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Class<CampoEstatistica> instance = CampoEstatistica.class;
		Campo camp = new Campo(10, 10);
		Localizacao loc = new Localizacao(5, 5);
		Javali java1 = new Javali(true, camp, loc);
		camp.lugar(java1, loc);
		Field contadores = instance.getDeclaredField("contadores");
		contadores.setAccessible(true);
		CampoEstatistica campes = new CampoEstatistica();
		campes.incrementaContador(java1.getClass());
		System.out.println("O contadores est· sendo preenchido");
		assertNotNull(contadores.get(campes));
		// Testa se È incrementado um animal para o contador

	}

	/**
	 * Test of contadorFinalizado method, of class CampoEstatistica.
	 * 
	 * @throws java.lang.NoSuchFieldException
	 * @throws java.lang.IllegalAccessException
	 */
	@Test
	public void testContadorFinalizado() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Class<CampoEstatistica> instance = CampoEstatistica.class;
		Field contadoresValidos = instance.getDeclaredField("contadoresValidos");
		contadoresValidos.setAccessible(true);
		CampoEstatistica campes = new CampoEstatistica();
		campes.redefine();// Seta os contadores validos pra false..
		campes.contadorFinalizado();// Seta pra true <-Metodo a ser testado
		System.out.println("ContadoresValidos teve seu valor alterado para True");
		assertTrue((boolean) contadoresValidos.get(campes));
		// Verifica se o metodo est· definindo como true
	}

	/**
	 * Test of ehViavel method, of class CampoEstatistica.
	 */
	@Test
	public void testEhViavel() {
		CampoEstatistica instance = new CampoEstatistica();
		Campo campo = new Campo(20, 20);
		instance.ehViavel(campo);
		System.out.println("O campo foi atribuido como inviavel conforme o esperado");
		assertFalse(instance.ehViavel(campo));
	}

	@Test
	public void testGeraContadoress() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException,
			NoSuchMethodException, InvocationTargetException {
		Campo campo = new Campo(10, 10);
		// Cria um campo generico
		Class<CampoEstatistica> instance = CampoEstatistica.class;
		// Referencia para a classe class
		Field contadoresValidos = instance.getDeclaredField("contadoresValidos");
		contadoresValidos.setAccessible(true);
		// Recupera a variavel... e define como acessivel.
		Method geraContadores = instance.getDeclaredMethod("geraContadores", campo.getClass());
		geraContadores.setAccessible(true);
		// Recupera o metodo... e define como acessivel.
		CampoEstatistica campes = new CampoEstatistica();
		campes.redefine();// Seta os contadores validos pra false...
		geraContadores.invoke(campes, campo);
		// Se o metodo foi chamado corretamente ele deve definir os contadores para
		// True.
		System.out.println("O metodo est· trocando o valor de contadoresValidos corretamente");
		assertTrue((boolean) contadoresValidos.get(campes));
	}
}

// import org.junit.After;
// import org.junit.AfterClass;
// import org.junit.Before;
// import org.junit.BeforeClass;
// import org.junit.Test;
// import java.lang.reflect.Field;
// import java.lang.reflect.InvocationTargetException;
// import java.lang.reflect.Method;
// import java.util.HashMap;
// import static org.junit.Assert.*;
//
/// **
// *
// * @author gabri
// */
// public class CampoEstatisticaTest {
// private HashMap<Class, Contador> contadores;
//
// public CampoEstatisticaTest() {
// contadores = new HashMap<Class, Contador>();
//
// }
//
// @BeforeClass
// public static void setUpClass() {
// }
//
// @AfterClass
// public static void tearDownClass() {
// }
//
// @Before
// public void setUp() {
// }
//
// @After
// public void tearDown() {
// }
//
// /**
// * Test of getPopulationDetails method, of class CampoEstatistica.
// */
// @Test
// public void testGetPopulationDetailsContadoresValidos() {
// CampoEstatistica instance = new CampoEstatistica();
// Campo campo = new Campo(10, 10);
// Localizacao local = new Localizacao(5, 5);
// Javali java1 = new Javali(true, campo, local);
// // Simulado um buffer temporario
// StringBuffer buffer = new StringBuffer();
// for (Class chave : contadores.keySet()) {
// Contador info = contadores.get(chave);
// buffer.append(info.getName());
// buffer.append(": ");
// buffer.append(info.getCount());
// buffer.append(' ');
//
// }
// // Verifica se a saida original cobre a regra do buffer
// assertEquals(instance.getPopulationDetails(campo), buffer.toString());
//
// }
//
// /**
// * Test of redefine method, of class CampoEstatistica.
// *
// * @throws java.lang.NoSuchFieldException
// * @throws java.lang.IllegalAccessException
// */
// @Test
// public void testRedefine() throws NoSuchFieldException,
// IllegalArgumentException, IllegalAccessException {
// Class<CampoEstatistica> instance = CampoEstatistica.class;
// Field contadoresValidos = instance.getDeclaredField("contadoresValidos");
// contadoresValidos.setAccessible(true);
// CampoEstatistica campes = new CampoEstatistica();
// campes.redefine();
// assertFalse((boolean) contadoresValidos.get(campes));
// // Verifica se est· atribuindo o valor false para a var
// // contadores validos, conforme o metodo indica
//
// }
//
// /**
// * Test of incrementaContador method, of class CampoEstatistica.
// */
// @Test
// public void testIncrementaContador() throws NoSuchFieldException,
// IllegalArgumentException, IllegalAccessException {
//
// Class<CampoEstatistica> instance = CampoEstatistica.class;
// Campo camp = new Campo(10, 10);
// Localizacao loc = new Localizacao(5, 5);
// Javali java1 = new Javali(true, camp, loc);
// camp.lugar(java1, loc);
// Field contadores = instance.getDeclaredField("contadores");
// contadores.setAccessible(true);
// CampoEstatistica campes = new CampoEstatistica();
// campes.incrementaContador(java1.getClass());
// assertNotNull(contadores.get(campes));
// // Testa se È incrementado um animal para o contador
// }
//
// /**
// * Test of contadorFinalizado method, of class CampoEstatistica.
// *
// * @throws java.lang.NoSuchFieldException
// */
// @Test
// public void testContadorFinalizado() throws NoSuchFieldException,
// IllegalArgumentException, IllegalAccessException {
// Class<CampoEstatistica> instance = CampoEstatistica.class;
// Field contadoresValidos = instance.getDeclaredField("contadoresValidos");
// contadoresValidos.setAccessible(true);
// CampoEstatistica campes = new CampoEstatistica();
// campes.redefine();// Seta os contadores validos pra false..
// campes.contadorFinalizado();// Seta pra true <-Metodo a ser testado
// assertTrue((boolean) contadoresValidos.get(campes));
// // Verifica se o metodo est· definindo como true
// }
//
// /**
// * Test of ehViavel method, of class CampoEstatistica.
// */
// @Test
// public void testEhViavel() {
// CampoEstatistica instance = new CampoEstatistica();
// Campo campo = new Campo(20, 20);
// instance.ehViavel(campo);
// assertFalse(instance.ehViavel(campo));
// }
//
// @Test
// public void testGeraContadoress() throws NoSuchFieldException,
// IllegalArgumentException, IllegalAccessException,
// NoSuchMethodException, InvocationTargetException {
// Campo campo = new Campo(10, 10);
// // Cria um campo generico
// Class<CampoEstatistica> instance = CampoEstatistica.class;
// // Referencia para a classe class
// Field contadoresValidos = instance.getDeclaredField("contadoresValidos");
// contadoresValidos.setAccessible(true);
// // Recupera a variavel... e define como acessivel.
// Method geraContadores = instance.getDeclaredMethod("geraContadores",
// campo.getClass());
// geraContadores.setAccessible(true);
// // Recupera o metodo... e define como acessivel.
// CampoEstatistica campes = new CampoEstatistica();
// campes.redefine();// Seta os contadores validos pra false...
// geraContadores.invoke(campes, campo);
// // Se o metodo foi chamado corretamente ele deve definir os contadores para
// // True.
// assertTrue((boolean) contadoresValidos.get(campes));
// }
// }
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
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import static org.junit.Assert.*;

/**
 *
 * @author gabri
 */
public class CampoEstatisticaTest {
     private HashMap<Class, Contador> contadores;
     
     
    public CampoEstatisticaTest() {
        contadores = new HashMap<Class, Contador>();
        
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
     * Test of getPopulationDetails method, of class CampoEstatistica.
     */
    @Test
    public void testGetPopulationDetails() {
        CampoEstatistica instance= new CampoEstatistica();
        Campo campo = new Campo(10,10);
        Localizacao local = new Localizacao(5,5);
        Javali java1 = new Javali(true,campo,local);
        //Simulado um buffer temporario
        assertNotNull(instance.getPopulationDetails(campo));
    }
    
    
    /**
     * Test of redefine method, of class CampoEstatistica.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testRedefine() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Class<CampoEstatistica> instance = CampoEstatistica.class;
         Field contadoresValidos = instance.getDeclaredField("contadoresValidos");
         contadoresValidos.setAccessible(true);
        CampoEstatistica campes = new CampoEstatistica();
        campes.redefine();
        System.out.println("contadoresValidos teve seu valor alterado para False");
        assertFalse((boolean) contadoresValidos.get(campes));
        //Verifica se est√° atribuindo o valor false para a var
        //contadores validos, conforme o metodo indica
        
    }

    /**
     * Test of incrementaContador method, of class CampoEstatistica.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testIncrementaContador() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Class<CampoEstatistica> instance = CampoEstatistica.class;
        Campo camp = new Campo (10,10);
        Localizacao loc = new Localizacao (5,5);
        Javali java1 = new Javali (true, camp, loc);
        camp.lugar(java1, loc);
        Field contadores = instance.getDeclaredField("contadores");
         contadores.setAccessible(true);
        CampoEstatistica campes = new CampoEstatistica();
        campes.incrementaContador(java1.getClass());
        System.out.println("O contadores est√° sendo preenchido");
        assertNotNull(contadores.get(campes));
        //Testa se √© incrementado um animal para o contador
        
        
        
        
    }

    /**
     * Test of contadorFinalizado method, of class CampoEstatistica.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testContadorFinalizado() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Class<CampoEstatistica> instance = CampoEstatistica.class;
         Field contadoresValidos = instance.getDeclaredField("contadoresValidos");
         contadoresValidos.setAccessible(true);
        
        CampoEstatistica campes = new CampoEstatistica();
        campes.redefine();//Seta os contadores validos pra false..
        campes.contadorFinalizado();//Seta pra true <-Metodo a ser testado
        System.out.println("ContadoresValidos teve seu valor alterado para True");
        assertTrue((boolean) contadoresValidos.get(campes));
        //Verifica se o metodo est√° definindo como true
    }

    /**
     * Test of ehViavel method, of class CampoEstatistica.
     */
    @Test
    public void testEhViavel() {
       CampoEstatistica instance = new CampoEstatistica();
       Campo campo = new Campo(20, 20);
       instance.ehViavel(campo);
       System.out.println("O campo foi atribuido como inviavel conforme o esperado");
       assertFalse(instance.ehViavel(campo));
    }
    
    @Test
   public void testGeraContadoress() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException{
       Campo campo = new Campo(10,10);
       //Cria um campo generico
       Class<CampoEstatistica> instance = CampoEstatistica.class;
       //Referencia para a classe class
        Field contadoresValidos = instance.getDeclaredField("contadoresValidos");
        contadoresValidos.setAccessible(true);
        //Recupera a variavel... e define como acessivel.
        Method geraContadores = instance.getDeclaredMethod("geraContadores",campo.getClass());
        geraContadores.setAccessible(true);
        //Recupera o metodo... e define como acessivel.
        CampoEstatistica campes = new CampoEstatistica();
        campes.redefine();//Seta os contadores validos pra false...
        geraContadores.invoke(campes, campo);
        //Se o metodo foi chamado corretamente ele deve definir os contadores para True.
        System.out.println("O metodo est√° trocando o valor de contadoresValidos corretamente");
        assertTrue((boolean) contadoresValidos.get(campes));
    }
}
>>>>>>> 0da62794867b406a13927c286c91db8860e48fbd
