<<<<<<< HEAD
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
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
public class QueroQueroTest {

	// static List<QueroQuero> novosQueroQueros;
	static Campo campo;
	static Localizacao localizacao;
	static Localizacao newLocalizacao;
	static Localizacao localizacaoNegativa;
	static QueroQuero queroQuero;
	static QueroQuero queroQueroNulo;
	static QueroQuero queroQuero2;

	public QueroQueroTest() {
	}

	@BeforeClass
	public static void setUpClass() {
		campo = new Campo(50, 50);
		localizacao = new Localizacao(25, 25);
		newLocalizacao = new Localizacao(15, 15);
		queroQuero = new QueroQuero(false, campo, localizacao);
		// novosQueroQueros = new ArrayList<QueroQuero>();
		localizacaoNegativa = new Localizacao(-25, -25);
		queroQueroNulo = null;
		queroQuero2 = new QueroQuero(false, campo, localizacao);
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
	 * Test of voa method, of class QueroQuero.
	 */
	@Test
	public void testAcao() {

	}

	/**
	 * Test of setMorte method, of class QueroQuero.
	 */
	@Test
	public void testSetMorte() {
		queroQuero.setMorte();
		assertEquals(false, queroQuero.isVivo());
		// espera uma resposta falsa para queroQuero vivo

	}

	/**
	 * Test of getLocalizacao method, of class QueroQuero.
	 */
	@Test
	public void testGetLocalizacao() {
		assertEquals(localizacao, queroQuero.getLocalizacao());

	}

	@Test
	public void testSetLocalizacao() {

		QueroQuero q = new QueroQuero(false, campo, localizacao);
		q.setLocalizacao(newLocalizacao);
		// q.setLocalizacao(loc2);
		assertEquals(newLocalizacao, q.getLocalizacao());
	}

	@Test
	public void testIncrementaIdade() throws Exception {
		Method incrementaIdade = queroQuero2.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		for (int i = 0; i <= 35; i++) {
			// System.out.println(i);
			incrementaIdade.invoke(queroQuero2);
			// System.out.println(i);
		}
		/*
		 * int idade_Maxima = 40; for (int idade = 0; idade <= 40; idade++) { if (idade
		 * > idade_Maxima) { queroQuero2.setMorte(); } else { queroQuero2.isVivo(); }
		 * //System.out.println(idade); //System.out.println(queroQuero.isVivo()); }
		 */
		assertTrue(queroQuero2.isVivo());
		// Teste se o quero quero envelhece e continua vivo
	}

	@Test
	public void testIncrementaIdadeAcimaMax() throws Exception {
		Method incrementaIdade = queroQuero.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		for (int i = 0; i <= 38; i++) {
			// System.out.println(i);
			incrementaIdade.invoke(queroQuero);
			// System.out.println(i);
		}

		/*
		 * int idade_Maxima = 40; for (int idade = 0; idade <= 41; idade++) { if (idade
		 * < idade_Maxima) { queroQuero.setMorte(); } else { queroQuero.isVivo(); } }
		 */
		assertFalse(queroQuero.isVivo());
		// Teste para ver se o quero quero passa da idade e morre
	}

	@Test
	public void testPodeProcriar() throws Exception {
		Method incrementaIdade = queroQuero.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		for (int i = 0; i <= 5; i++) {
			incrementaIdade.invoke(queroQuero);
		}

		Method podeProcriar = queroQuero.getClass().getDeclaredMethod("podeProcriar");
		podeProcriar.setAccessible(true);
		podeProcriar.invoke(queroQuero);
		assertEquals(true, podeProcriar.invoke(queroQuero));

	}

	@Test
	public void testNãoPodeProcriar() throws Exception {
		Method incrementaIdade = queroQuero2.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		for (int i = 0; i <= 3; i++) {
			incrementaIdade.invoke(queroQuero2);
		}

		Method podeProcriar = queroQuero2.getClass().getDeclaredMethod("podeProcriar");
		podeProcriar.setAccessible(true);
		podeProcriar.invoke(queroQuero2);
		assertEquals(false, podeProcriar.invoke(queroQuero2));

	}

	@Test
	public void testChocaOvos() throws Exception {
		// novosQueroQueros.add(queroQuero2);
		List<QueroQuero> novosQueroQueros = new ArrayList<>();
		QueroQuero q2 = new QueroQuero(true, campo, localizacao);
		novosQueroQueros.add(q2);
		Method incrementaIdade = q2.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		for (int i = 0; i <= 5; i++) {
			incrementaIdade.invoke(q2);
		}

		Method chocaOvos = q2.getClass().getDeclaredMethod("chocaOvos", List.class);
		chocaOvos.setAccessible(true);
		chocaOvos.invoke(q2, novosQueroQueros);
		// List<QueroQuero> novosQueroQueros = (List) chocaOvos.invoke(q2.getClass());
		// Color cor = (Color) getCor.invoke(instance, q.getClass());

		Method procria = q2.getClass().getDeclaredMethod("procria");
		procria.setAccessible(true);
		int retorno = (int) procria.invoke(q2);

		assertEquals(0, retorno);
	}

}
// import java.lang.reflect.Method;
// import java.util.ArrayList;
// import java.util.List;
// import org.junit.After;
// import org.junit.AfterClass;
// import org.junit.Before;
// import org.junit.BeforeClass;
// import org.junit.Test;
// import static org.junit.Assert.*;
//
/// **
// *
// * @author tadeu
// */
// public class QueroQueroTest {
//
// static List<Animal> novosQueroQueros;
// static Campo campo;
// static Localizacao localizacao;
// static Localizacao newLocalizacao;
// static Localizacao localizacaoNegativa;
// static QueroQuero queroQuero;
// static QueroQuero queroQueroNulo;
// static QueroQuero queroQuero2;
//
// public QueroQueroTest() {
// }
//
// @BeforeClass
// public static void setUpClass() {
// campo = new Campo(50, 50);
// localizacao = new Localizacao(25, 25);
// newLocalizacao = new Localizacao(15, 15);
// queroQuero = new QueroQuero(false, campo, localizacao);
// novosQueroQueros = new ArrayList<Animal>();
// localizacaoNegativa = new Localizacao(-25, -25);
// queroQueroNulo = null;
// queroQuero2 = new QueroQuero(false, campo, localizacao);
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
// * Test of voa method, of class QueroQuero.
// */
// @Test
// public void testAcao() {
//
// }
//
// /**
// * Test of setMorte method, of class QueroQuero.
// */
// @Test
// public void testSetMorte() {
// queroQuero.setMorte();
// assertEquals(false, queroQuero.isVivo());
// // espera uma resposta falsa para queroQuero vivo
//
// }
//
// /**
// * Test of getLocalizacao method, of class QueroQuero.
// */
// @Test
// public void testGetLocalizacao() {
// assertEquals(localizacao, queroQuero.getLocalizacao());
//
// }
//
// @Test
// public void testIncrementaIdade() throws Exception {
// Method incrementaIdade =
// queroQuero2.getClass().getDeclaredMethod("incrementaIdade");
// incrementaIdade.setAccessible(true);
// for (int i = 0; i <= 35; i++) {
// // System.out.println(i);
// incrementaIdade.invoke(queroQuero2);
// // System.out.println(i);
// }
// /*
// * int idade_Maxima = 40; for (int idade = 0; idade <= 40; idade++) { if
// (idade
// * > idade_Maxima) { queroQuero2.setMorte(); } else { queroQuero2.isVivo(); }
// * //System.out.println(idade); //System.out.println(queroQuero.isVivo()); }
// */
// assertTrue(queroQuero2.isVivo());
// // Teste se o quero quero envelhece e continua vivo
// }
//
// @Test
// public void testIncrementaIdadeAcimaMax() throws Exception {
// Method incrementaIdade =
// queroQuero.getClass().getDeclaredMethod("incrementaIdade");
// incrementaIdade.setAccessible(true);
// for (int i = 0; i <= 38; i++) {
// // System.out.println(i);
// incrementaIdade.invoke(queroQuero);
// // System.out.println(i);
// }
//
// /*
// * int idade_Maxima = 40; for (int idade = 0; idade <= 41; idade++) { if
// (idade
// * < idade_Maxima) { queroQuero.setMorte(); } else { queroQuero.isVivo(); } }
// */
// assertFalse(queroQuero.isVivo());
// // Teste para ver se o quero quero passa da idade e morre
// }
//
// @Test
// public void testPodeProcriar() throws Exception {
// Method incrementaIdade =
// queroQuero.getClass().getDeclaredMethod("incrementaIdade");
// incrementaIdade.setAccessible(true);
// for (int i = 0; i <= 5; i++) {
// incrementaIdade.invoke(queroQuero);
// }
//
// Method podeProcriar =
// queroQuero.getClass().getDeclaredMethod("podeProcriar");
// podeProcriar.setAccessible(true);
// podeProcriar.invoke(queroQuero);
// assertEquals(true, podeProcriar.invoke(queroQuero));
//
// }
//
// @Test
// public void testNãoPodeProcriar() throws Exception {
// Method incrementaIdade =
// queroQuero2.getClass().getDeclaredMethod("incrementaIdade");
// incrementaIdade.setAccessible(true);
// for (int i = 0; i <= 3; i++) {
// incrementaIdade.invoke(queroQuero2);
// }
//
// Method podeProcriar =
// queroQuero2.getClass().getDeclaredMethod("podeProcriar");
// podeProcriar.setAccessible(true);
// podeProcriar.invoke(queroQuero2);
// assertEquals(false, podeProcriar.invoke(queroQuero2));
//
// }
//
// @Test
// public void testChocaOvos() throws Exception {
// // novosQueroQueros.add(queroQuero2);
// List<QueroQuero> novosQueroQueros = new ArrayList<>();
// QueroQuero q2 = new QueroQuero(true, campo, localizacao);
// novosQueroQueros.add(q2);
// Method incrementaIdade = q2.getClass().getDeclaredMethod("incrementaIdade");
// incrementaIdade.setAccessible(true);
// for (int i = 0; i <= 5; i++) {
// incrementaIdade.invoke(q2);
// }
//
// Method chocaOvos = q2.getClass().getDeclaredMethod("chocaOvos", List.class);
// chocaOvos.setAccessible(true);
// chocaOvos.invoke(q2, novosQueroQueros);
// // List<QueroQuero> novosQueroQueros = (List)
// chocaOvos.invoke(q2.getClass());
// // Color cor = (Color) getCor.invoke(instance, q.getClass());
//
// Method procria = q2.getClass().getDeclaredMethod("procria");
// procria.setAccessible(true);
// int retorno = (int) procria.invoke(q2);
//
// assertEquals(0, retorno);
// }
// // @Test
// // public void testChocaOvos() throws Exception {
// // // novosQueroQueros.add(queroQuero2);
// // List<Animal> novosQueroQueros = new ArrayList<>();
// // // novosQueroQueros.add(queroQuero2);
// // QueroQuero q2 = new QueroQuero(true, campo, localizacao);
// // Method incrementaIdade =
// q2.getClass().getDeclaredMethod("incrementaIdade");
// // incrementaIdade.setAccessible(true);
// // for (int i = 0; i <= 5; i++) {
// // incrementaIdade.invoke(q2);
// // }
// //
// // Method chocaOvos = q2.getClass().getDeclaredMethod("chocaOvos",
// // java.lang.Class.forName("java.util.List"));
// // chocaOvos.setAccessible(true);
// // chocaOvos.invoke(q2.getClass(), novosQueroQueros.add(q2));
// //
// //
// //// Method procria = queroQuero2.getClass().getDeclaredMethod("procria");
// //// procria.setAccessible(true);
// //// int retorno = (int) procria.invoke(queroQuero2);
// ////
// //// assertEquals(1, retorno);
// // }
//
// // @Test
// // public void testChocaOvos() throws Exception {
// // novosQueroQueros.add(queroQuero2);
// // Method incrementaIdade =
// // queroQuero2.getClass().getDeclaredMethod("incrementaIdade");
// // incrementaIdade.setAccessible(true);
// // for (int i = 0; i <= 5; i++) {
// // incrementaIdade.invoke(queroQuero2);
// // }
// //
// // Method chocaOvos = queroQuero2.getClass().getDeclaredMethod("chocaOvos",
// // java.lang.Class.forName("java.util.List"));
// // chocaOvos.setAccessible(true);
// // System.out.println("novosQueroQueros eh instancia de " +
// // novosQueroQueros.getClass().getName() + " params = "
// // + chocaOvos.getParameters().length);
// // for (java.lang.reflect.Parameter par : chocaOvos.getParameters()) {
// // System.out.println(par.getName() + ": " + par.getType().getName());
// // }
// // chocaOvos.invoke((ArrayList<Animal>) novosQueroQueros);
// //
// // Method procria = queroQuero2.getClass().getDeclaredMethod("procria");
// // procria.setAccessible(true);
// // int retorno = (int) procria.invoke(queroQuero2);
// //
// // assertEquals(1, retorno);
// // }
//
// }
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import static classes.QueroQueroTest.novosQueroQueros;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
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
public class QueroQueroTest {

    static List<Animal> novosQueroQueros;
    static Campo campo;
    static Localizacao localizacao;
    static Localizacao newLocalizacao;
    static Localizacao localizacaoNegativa;
    static QueroQuero queroQuero;
    static QueroQuero queroQueroNulo;
    static QueroQuero queroQuero2;
    

    public QueroQueroTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        campo = new Campo(50, 50);
        localizacao = new Localizacao(25, 25);
        newLocalizacao = new Localizacao(15, 15);
        queroQuero = new QueroQuero(false, campo, localizacao);
        novosQueroQueros = new ArrayList<Animal>();
        localizacaoNegativa = new Localizacao(-25, -25);
        queroQueroNulo = null;
        queroQuero2 = new QueroQuero(false, campo, localizacao);
        
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
     * Test of voa method, of class QueroQuero.
     */
    @Test
    public void testAcao() {

    }

    /**
     * Test of setMorte method, of class QueroQuero.
     */
//    @Test
//    public void testSetMorte() {
//        queroQuero.setMorte();
//        assertEquals(false, queroQuero.isVivo());
//        //espera uma resposta falsa para queroQuero vivo 
//
//    }
//
//    /**
//     * Test of getLocalizacao method, of class QueroQuero.
//     */
//    @Test
//    public void testGetLocalizacao() {
//        assertEquals(localizacao, queroQuero.getLocalizacao());
//
//    }
//
//    @Test
//    public void testIncrementaIdade() throws Exception {
//        Method incrementaIdade = queroQuero2.getClass().getDeclaredMethod("incrementaIdade");
//        incrementaIdade.setAccessible(true);
//        for(int i = 0; i<=35; i++){
//            //System.out.println(i);
//            incrementaIdade.invoke(queroQuero2);
//            //System.out.println(i);
//        }
//        /*int idade_Maxima = 40;
//        for (int idade = 0; idade <= 40; idade++) {
//            if (idade > idade_Maxima) {
//                queroQuero2.setMorte();
//            } else {
//                queroQuero2.isVivo();
//            }
//            //System.out.println(idade);
//            //System.out.println(queroQuero.isVivo());
//        }*/
//        assertTrue(queroQuero2.isVivo());
//        //Teste se o quero quero envelhece e continua vivo
//    }
//
//    @Test
//    public void testIncrementaIdadeAcimaMax() throws Exception {
//        Method incrementaIdade = queroQuero.getClass().getDeclaredMethod("incrementaIdade");
//        incrementaIdade.setAccessible(true);
//        for(int i = 0; i<=38; i++){
//            //System.out.println(i);
//            incrementaIdade.invoke(queroQuero);
//            //System.out.println(i);
//        }
//        
//        /*int idade_Maxima = 40;
//        for (int idade = 0; idade <= 41; idade++) {
//            if (idade < idade_Maxima) {
//                queroQuero.setMorte();
//            } else {
//                queroQuero.isVivo();
//            }
//        }*/
//        assertFalse(queroQuero.isVivo());
//        //Teste para ver se o quero quero passa da idade e morre
//    }
//
//    @Test
//    public void testPodeProcriar() throws Exception {
//        Method incrementaIdade = queroQuero.getClass().getDeclaredMethod("incrementaIdade");
//        incrementaIdade.setAccessible(true);
//        for (int i = 0; i <= 5; i++) {
//            incrementaIdade.invoke(queroQuero);
//        }
//
//        Method podeProcriar = queroQuero.getClass().getDeclaredMethod("podeProcriar");
//        podeProcriar.setAccessible(true);
//        podeProcriar.invoke(queroQuero);
//        assertEquals(true, podeProcriar.invoke(queroQuero));
//
//    }
//
//    @Test
//    public void testNÃ£oPodeProcriar() throws Exception {
//        Method incrementaIdade = queroQuero2.getClass().getDeclaredMethod("incrementaIdade");
//        incrementaIdade.setAccessible(true);
//        for (int i = 0; i <= 3; i++) {
//            incrementaIdade.invoke(queroQuero2);
//        }
//
//        Method podeProcriar = queroQuero2.getClass().getDeclaredMethod("podeProcriar");
//        podeProcriar.setAccessible(true);
//        podeProcriar.invoke(queroQuero2);
//        assertEquals(false, podeProcriar.invoke(queroQuero2));
//
//    }

    @Test
    public void testChocaOvos() throws Exception {
        
        
       Class<QueroQuero> instanceQuero = QueroQuero.class;
       ArrayList<Animal> novosQueroQueros2;
       novosQueroQueros2 = new ArrayList<Animal>();
        Campo campo = new Campo (10,10);
        Localizacao local= new Localizacao (4,4);
        QueroQuero instance = new QueroQuero(false, campo, local);
        Method chocaOvos = instanceQuero.getDeclaredMethod("chocaOvos", List.class);
        Method procria = instanceQuero.getDeclaredMethod("procria");
        Method podeProcriar = instanceQuero.getDeclaredMethod("podeProcriar");
        Method incrementaIdade = instanceQuero.getDeclaredMethod("incrementaIdade");
        chocaOvos.setAccessible(true);
        incrementaIdade.setAccessible(true);
        podeProcriar.setAccessible(true);
        procria.setAccessible(true);
        incrementaIdade.invoke(instance);
        incrementaIdade.invoke(instance);
        incrementaIdade.invoke(instance);
        incrementaIdade.invoke(instance);
        incrementaIdade.invoke(instance);
        incrementaIdade.invoke(instance);
        procria.invoke(instance);
        podeProcriar.invoke(instance);
        chocaOvos.invoke(instance,novosQueroQueros2);
        assertNotNull(novosQueroQueros2);

        
        
    }

}
>>>>>>> 0da62794867b406a13927c286c91db8860e48fbd
