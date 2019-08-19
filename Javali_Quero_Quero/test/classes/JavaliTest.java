
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author natha
 */
public class JavaliTest {

	static Localizacao localizacao;
	static Campo campo;
	static Javali nivelFome;
	static Javali vivo;
	static Javali idade;
	static Animal animal;
	static Javali javali1;
	static Javali javali2;
	static Localizacao localizacaoNegativa;
	static List<Animal> novosJavalis;
	static Localizacao newLocalizacao;

	static final int IDADE_PROCRIACAO = 10;
	static final int IDADE_MAXIMAA = 150;
	static final double PROBABILIDADE_PROCRIACAO = 0.75;
	static final int TAMANHO_MAXIMO_NINHADA = 5;
	static final int VALOR_FOME_QUEROQUERO = 7;
	static final Random rand = Randomizador.getRandom();
	private static final Animal ArrayList = null;

	public JavaliTest() {
	}

	@BeforeClass
	public static void setUpClasss() {
		campo = new Campo(100, 100);
		localizacao = new Localizacao(50, 50);
		javali1 = new Javali(false, campo, localizacao);
		javali2 = new Javali(false, campo, localizacao);
		localizacaoNegativa = new Localizacao(-50, -50);
		newLocalizacao = new Localizacao(15, 15);
	}

	@Test
	public void testSetLocalizacao() throws Exception {

		javali2.setLocalizacao(newLocalizacao);

		Assert.assertNotEquals(localizacao, newLocalizacao);

	}

	@Test
	public void testGetLocalizacao() throws Exception {

		javali1.getLocalizacao();
		assertEquals(localizacao, javali1.getLocalizacao());

	}

	@Test
	public void incrementaIdade() throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchFieldException, SecurityException {

		Class cl = javali2.getClass();
		Method incrementaIdade = cl.getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);

		for (int i = 0; i < 150; i++) {
			incrementaIdade.invoke(javali2);
		}
		assertNotNull(javali2.isVivo());
	}

	@Test
	public void testIncrementaIdadeAcimaMax()
			throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method incrementaIdade = javali1.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);

		for (int i = 0; i <= 150; i++) {
			incrementaIdade.invoke(javali1);
		}
		assertNotNull(javali1.isVivo());
	}

	@Test
	public void incrementaFome()
			throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class javali = javali1.getClass();
		Method incrementaIdade = javali.getDeclaredMethod("incrementaFome");
		incrementaIdade.setAccessible(true);

		incrementaIdade.invoke(javali1);

	}

	@Test
	public void daALuzTest() throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, ClassNotFoundException {

		List<Animal> novosJavalis = new ArrayList<>();
		// List<Localizacao> livre = campo.localizacoesAdjacentesLivres(localizacao);

		Method incrementaIdade = javali2.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		for (int i = 0; i <= 150; i++) {
			incrementaIdade.invoke(javali2);
		}
		Method daALuz = javali2.getClass().getDeclaredMethod("daALuz", java.lang.Class.forName("java.util.List"));
		daALuz.setAccessible(true);
		daALuz.invoke(novosJavalis.add(javali2));
		Assert.assertNotNull(novosJavalis.add(javali2));
	}

	@Test
	public void procuraComidaTeste()
			throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Method procuraComida = javali1.getClass().getDeclaredMethod("procuraComida", Localizacao.class);
		procuraComida.setAccessible(true);
		procuraComida.invoke("procuraComida", javali1.getClass());
		assertEquals(localizacao, newLocalizacao);

	}

	@Test
	public void procriacaoTeste()
			throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class javali = javali1.getClass();
		Method procria = javali.getDeclaredMethod("procria");
		procria.setAccessible(true);
		for (int i = 0; i <= 10; i++) {
			procria.invoke(javali1);
		}
	}

	@Test
	public void podeProcriar()
			throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class javali = javali1.getClass();
		Method incrementaIdade = javali.getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		for (int i = 0; i <= 10; i++) {
			incrementaIdade.invoke(javali1);
		}
		Method podeProcriar = javali1.getClass().getDeclaredMethod("podeProcriar");
		podeProcriar.setAccessible(true);
		podeProcriar.invoke(javali1);
		assertTrue(true);
	}

	@Test
	public void testNaoPodeProcriar()
			throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Method incrementaIdade = javali2.getClass().getDeclaredMethod("incrementaIdade");
		incrementaIdade.setAccessible(true);
		for (int i = 0; i <= 3; i++) {
			incrementaIdade.invoke(javali2);
		}
		Method podeProcriar = javali2.getClass().getDeclaredMethod("podeProcriar");
		podeProcriar.setAccessible(true);
		podeProcriar.invoke(javali2);
		assertEquals(true, podeProcriar.invoke(javali2));
	}

	@Test
	public void setMorteTeste()
			throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		javali1.setMorte();
		assertEquals(false, javali1.isVivo());

	}

}
