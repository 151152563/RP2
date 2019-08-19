<<<<<<< HEAD
import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/****
 * 
 * @author tadeu
 */
public class SimuladorTelaTest {
	static Class animalClass;
	static SimuladorTela sTela;
	static final Color COR_INDEFINIDA = Color.gray;
	static final Color COR_VAZIA = Color.white;
	static Map<Class, Color> cores;
	static int altura;
	static int largura;
	static Campo campo;
	static int etapa;
	static CampoEstatistica estatisticas;

	public SimuladorTelaTest() {
	}

	@BeforeClass
	public static void setUpClass() {
		altura = 100;
		largura = 100;
		sTela = new SimuladorTela(altura, largura);
		cores = new LinkedHashMap<Class, Color>();
		estatisticas = new CampoEstatistica();

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
	 * Test of setCor method, of class SimuladorTela.
	 */
	@Test
	public void testSetCorJavali() throws Exception {
		// System.out.println("Deifinindo Cor");
		SimuladorTela instance = new SimuladorTela(10, 10);
		Localizacao localizacao = new Localizacao(5, 5);
		Campo campo = new Campo(10, 10);
		Javali java1 = new Javali(true, campo, localizacao);
		cores.put(java1.getClass(), Color.BLUE);
		assertEquals(Color.BLUE, cores.put(java1.getClass(), Color.BLUE));

	}

	@Test
	public void testSetCorQueroQuero() throws Exception {
		// System.out.println("Deifinindo Cor");
		SimuladorTela instance = new SimuladorTela(10, 10);
		Localizacao localizacao = new Localizacao(5, 5);
		Campo campo = new Campo(10, 10);
		QueroQuero queroQuero = new QueroQuero(true, campo, localizacao);
		cores.put(queroQuero.getClass(), Color.YELLOW);
		assertEquals(Color.YELLOW, cores.put(queroQuero.getClass(), Color.YELLOW));

	}

	@Test
	public void testGetCor() throws Exception {
		SimuladorTela instance = new SimuladorTela(10, 10);
		Localizacao localizacao = new Localizacao(5, 5);
		Campo campo = new Campo(10, 10);
		QueroQuero queroQuero = new QueroQuero(true, campo, localizacao);
		Color coluna = cores.get(queroQuero);
		assertEquals(Color.YELLOW, cores.put(queroQuero.getClass(), coluna));

		SimuladorTela instance2 = new SimuladorTela(5, 5);
		Localizacao localizacao2 = new Localizacao(10, 10);
		Campo campo2 = new Campo(20, 20);
		Javali java1 = new Javali(true, campo2, localizacao2);
		Color coluna2 = cores.get(java1);
		assertEquals(Color.BLUE, cores.put(java1.getClass(), coluna2));

		SimuladorTela instance3 = new SimuladorTela(20, 20);
		Localizacao localizacao3 = new Localizacao(15, 15);
		Campo campo3 = new Campo(25, 25);
		Javali java2 = new Javali(true, campo3, localizacao3);
		java2.setMorte();
		if (java2.isVivo()) {
			cores.put(java1.getClass(), Color.BLUE);
		} else {
			cores.put(java1.getClass(), Color.gray);
		}
		Color coluna3 = cores.get(java2);
		assertEquals(Color.gray, cores.put(java2.getClass(), coluna3));

	}

	@Test
	public void testSimuladorTelaTamanho() {
		SimuladorTela test = new SimuladorTela(100, 100);
		assertEquals(test, test);
	}

	@Test
	public void testSimuladorTela() {

	}

	@Test
	public void testMostraStatus() throws NoSuchFieldException {
		System.out.println("Testando o estatus da tela");
		SimuladorTela instance = new SimuladorTela(10, 10);
		Localizacao localizacao = new Localizacao(5, 5);
		Campo campo = new Campo(10, 10);
		Javali java1 = new Javali(true, campo, localizacao);
		Field visaoCampo = instance.getClass().getDeclaredField("visaoCampo");
		visaoCampo.setAccessible(true);
		visaoCampo.isAccessible();
		instance.mostraStatus(0, campo);
		System.out.println("O metodo mostra Status funciona corretamente sem erros decopilaçao aparentes\n"
				+ "Não são esperados retornos para esse metodo, apenas teste de construção,sem devolução de\n"
				+ "parametros");
	}
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Color;
import static java.awt.Color.YELLOW;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tadeu
 */
public class SimuladorTelaTest {

    static Class animalClass;
    static SimuladorTela sTela;
    static final Color COR_INDEFINIDA = Color.gray;
    static final Color COR_VAZIA = Color.white;
    static Map<Class, Color> cores;
    static int altura;
    static int largura;
    static Campo campo;
    static int etapa;
    static CampoEstatistica estatisticas;

    public SimuladorTelaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        altura = 100;
        largura = 100;
        sTela = new SimuladorTela(altura, largura);
        cores = new LinkedHashMap<Class, Color>();
        estatisticas = new CampoEstatistica();

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
     * Test of setCor method, of class SimuladorTela.
     */
//    @Test
//    public void testSetCorJavali() throws Exception{
//        //System.out.println("Deifinindo Cor");
//        SimuladorTela instance = new SimuladorTela(10, 10);
//        Localizacao localizacao = new Localizacao(5,5);
//        Campo campo = new Campo(10, 10);
//        Javali java1 = new Javali(true, campo, localizacao);
//        cores.put(java1.getClass(), Color.BLUE);
//        assertEquals(Color.BLUE, cores.put(java1.getClass(), Color.BLUE));
//        
//        
//    }
    @Test
    public void testSetCorQueroQuero() throws Exception {
        System.out.println("Deifinindo Cor");
        SimuladorTela instance = new SimuladorTela(10, 10);
        Localizacao localizacao = new Localizacao(5, 5);
        Campo campo = new Campo(10, 10);
        QueroQuero queroQuero = new QueroQuero(true, campo, localizacao);
        Color cor1 = YELLOW;
        instance.setCor(queroQuero.getClass(), cor1);
        Class<SimuladorTela> instanceSimulador = SimuladorTela.class;
        Method getCor = instanceSimulador.getDeclaredMethod("getCor", Class.class);
        getCor.setAccessible(true);
        Color cor = (Color) getCor.invoke(instance, queroQuero.getClass());
        assertEquals(cor1, (Color) getCor.invoke(instance, queroQuero.getClass()));
//
//        

    }
//    @Test
//    public void testGetCor()throws Exception{
//        SimuladorTela instance = new SimuladorTela(10, 10);
//        Localizacao localizacao = new Localizacao(5,5);
//        Campo campo = new Campo(10, 10);
//        QueroQuero queroQuero = new QueroQuero(true, campo, localizacao);
//        Color coluna = cores.get(queroQuero);
//        assertEquals(Color.YELLOW, cores.put(queroQuero.getClass(), coluna));
//        
//        SimuladorTela instance2 = new SimuladorTela(5, 5);
//        Localizacao localizacao2 = new Localizacao(10, 10);
//        Campo campo2 = new Campo(20, 20);
//        Javali java1 = new Javali(true, campo2, localizacao2);
//        Color coluna2 = cores.get(java1);
//        assertEquals(Color.BLUE, cores.put(java1.getClass(), coluna2));
//        
//        SimuladorTela instance3 = new SimuladorTela(20, 20);
//        Localizacao localizacao3 = new Localizacao(15, 15);
//        Campo campo3  = new Campo(25, 25);
//        Javali java2 = new Javali(true, campo3, localizacao3);
//        java2.setMorte();
//        if(java2.isVivo()){
//            cores.put(java1.getClass(), Color.BLUE);
//        }
//        else{
//            cores.put(java1.getClass(), Color.gray);
//        }
//        Color coluna3 = cores.get(java2);
//        assertEquals(Color.gray, cores.put(java2.getClass(), coluna3));
//        
//        
//        
//    }
//    @Test
//    public void testSimuladorTelaTamanho(){
//        SimuladorTela test = new SimuladorTela(100, 100);
//        assertEquals(test, test);
//    }
//    @Test
//    public void testSimuladorTela(){
//        
//    }
//    @Test
//    public void testMostraStatus() throws NoSuchFieldException {
//        System.out.println("Testando o estatus da tela");
//        SimuladorTela instance = new SimuladorTela(10,10);
//        Localizacao localizacao = new Localizacao(5,5);
//        Campo campo = new Campo(10,10);
//        Javali java1 = new Javali(true, campo, localizacao);
//        Field visaoCampo = instance.getClass().getDeclaredField("visaoCampo");
//        visaoCampo.setAccessible(true);
//        visaoCampo.isAccessible();
//        instance.mostraStatus(0, campo);
//        System.out.println("O metodo mostra Status funciona corretamente sem erros de copilaÃ§ao aparentes\n"
//                + "NÃ£o sÃ£o esperados retornos para esse metodo, apenas teste de construÃ§Ã£o, sem devoluÃ§Ã£o de\n"
//                + "parametros");
//    }

    /**
     * Test of mostraStatus method, of class SimuladorTela.
     */
    /* @Test
    public void testMostraStatus() {
        System.out.println("Mostra Status");
        SimuladorTela instance = new SimuladorTela(10, 10);
        Campo campo = new Campo(10, 10);
        instance.mostraStatus(10, campo);
        assertEquals(sTela, );
        
        
    }

    /**
     * Test of ehViavel method, of class SimuladorTela.
     */
    @Test
    public void testEhViavel() {

    }

}
>>>>>>> 0da62794867b406a13927c286c91db8860e48fbd
