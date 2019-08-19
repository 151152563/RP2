
import java.lang.reflect.Field;
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
public class RandomizadorTest {

	private static final int SEED = 1111;
	private static final Random rand = new Random(SEED);
	private static final boolean useShared = true;

	public RandomizadorTest() {
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

	@Test
	public void testGetRandom() {

		Randomizador randomizador = new Randomizador();
		randomizador.getRandom();

		Assert.assertNotNull(randomizador.getRandom());

	}

	@Test
	public void testReset() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Class<Randomizador> rando = Randomizador.class;
		Field rand = rando.getDeclaredField("rand");
		rand.setAccessible(true);
		Randomizador instance = new Randomizador();

		java.util.Random rd = (java.util.Random) rand.get(instance);
		instance.reset();

		int a = instance.getRandom().nextInt();
		int b = rd.nextInt();
		System.out.println(a);
		System.out.println(b);
		assertNotEquals(a, b);

	}
}
