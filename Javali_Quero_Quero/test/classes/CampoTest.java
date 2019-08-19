<<<<<<< HEAD
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

>>>>>>> 0da62794867b406a13927c286c91db8860e48fbd
import java.util.Collections;
import java.util.LinkedList;
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
public class CampoTest {
    private final Random rand = Randomizador.getRandom();
    private int profundidade;
    private int largura;
    public static Localizacao localizacao;
    public static Animal animal;
    private Object[][] campo;
    public static Campo campo1;
    public static Campo campo2;
    public CampoTest() {
        campo = new Object[profundidade][largura];
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
     * Test of limpa method, of class Campo.
     */
 @Test
    public void testLimpa_0args() {
        System.out.println("O campo foi limpo e devolveu o resultado esperado");
        Campo instance = new Campo (50, 50);
        instance.limpa();
        assertEquals(null,instance.getObjectAt(largura, profundidade) );
        //Verifica se o campo é preenchido com valores null
    }

    @Test
    public void testLimpa_Localizacao() {
        Campo instance = new Campo (50, 50);
        Localizacao localizacao = new Localizacao(10,10);
        instance.lugar(animal, localizacao);
        instance.limpa(localizacao);
        assertEquals(false,localizacao.equals(animal));
        System.out.println("As localizacoes foram limpas conforme o esperado");
        //Verifica se um objeto é removido da posição especifica
        
        
    }

    @Test
    public void testLugar_3args() {
        System.out.println("O lugar foi definido sem problemas");
        Campo instance = new Campo (50, 50);
        instance.lugar(animal, largura, profundidade);
        //Verifica a inserção de um animal na posição definida
    }
 
    @Test
    public void testLugar_Object_Localizacao() {
       System.out.println("O lugar contem um animal");
        Campo instance = new Campo (50, 50);
        Localizacao localizacao = new Localizacao(10,10);
        instance.lugar(animal, localizacao);
        assertEquals(animal,instance.getObjectAt(10, 10));
        //Verifica se existe um animal na posição informada
    }

    @Test
    public void testGetObjectAt_Localizacao() {
        System.out.println("A localização retorna um animal");
        Campo instance = new Campo (50, 50);
        Localizacao localizacao = new Localizacao(10,10);
        Javali java1 = new Javali(true, instance, localizacao);
        instance.lugar(java1, localizacao);
        assertEquals(java1,instance.getObjectAt(localizacao));
        //Verifica se um objeto é devolvido para a posição especifica
    }

    @Test
    public void testGetObjectAt_int_int() {
       System.out.println("O lugar contem um animal na posição 10 10");
        Campo instance = new Campo (50, 50);
        Localizacao localizacao = new Localizacao(10,10);
        instance.lugar(animal, localizacao);
        assertEquals(animal,instance.getObjectAt(10, 10));
        //Testa se a Recebe um animal em uma posição instanciada
    }
   
    @Test
    public void testGetProfundidade() {
        System.out.println("A profundidade foi devolvida");
        Campo instance = new Campo (1, 0);
        instance.getProfundidade();
        assertEquals(1,instance.getProfundidade() );  
        //Testa se snaquela posição
    }

    @Test
    public void testGetLargura() {
        System.out.println("A largura foi devolvida");
        Campo instance = new Campo (0, 1);
        instance.getLargura();
        assertEquals(1,instance.getLargura() );
        //Testa se a largura é devolvida naquela posição
    }
    
    @Test
    public void testLocalizacaoAdjacenteRandomica() {
<<<<<<< HEAD
        System.out.println("A localizacao adjacente é diferente da localizacao informada");
=======
        System.out.println("A localizacao adjacente Ã© diferente da localizacao informada");
>>>>>>> 0da62794867b406a13927c286c91db8860e48fbd
        Campo instance = new Campo (20, 20);
        Localizacao localizacao = new Localizacao (11,11);
        instance.localizacaoAdjacenteRandomica(localizacao);
        assertNotEquals(localizacao, instance.localizacaoAdjacenteRandomica(localizacao));
        
    }
    
    @Test
    public void testLocalizacoesAdjacentesLivres() {
<<<<<<< HEAD
        System.out.println("A localizacao adjacente é diferente da localizacao informada");
=======
        System.out.println("A localizacao adjacente Ã© diferente da localizacao informada");
>>>>>>> 0da62794867b406a13927c286c91db8860e48fbd
        Campo instance = new Campo (20, 20);
        Localizacao localizacao = new Localizacao (11,11);
        instance.localizacoesAdjacentesLivres(localizacao);
        assertNotEquals(localizacao, instance.localizacoesAdjacentesLivres(localizacao));
        
        
    }
    
    
   @Test
    public void testLocalizacaoAdjacenteLivre() {
<<<<<<< HEAD
        System.out.println("A localização adjacente é diferente da localizaçao definida para o animal");
=======
        System.out.println("A localizaÃ§Ã£o adjacente Ã© diferente da localizaÃ§ao definida para o animal");
>>>>>>> 0da62794867b406a13927c286c91db8860e48fbd
    Campo instance = new Campo(20,20);
    Localizacao localizacao = new Localizacao(11,11);
    instance.lugar(animal, localizacao);
    instance.localizacaoAdjacenteLivre(localizacao);
    assertNotEquals(instance.getObjectAt(localizacao), instance.localizacoesAdjacentesLivres(localizacao));
    }
   
    
<<<<<<< HEAD
    @Test
    public void testLocalizacoesAdjacentes() {
        System.out.println("A localização adjacente é diferente da localizaçao definida para o animal");
=======
    
    
    
    
    @Test
    public void testLocalizacoesAdjacentes() {
        System.out.println("A localizaÃ§Ã£o adjacente Ã© diferente da localizaÃ§ao definida para o animal");
>>>>>>> 0da62794867b406a13927c286c91db8860e48fbd
    Campo instance = new Campo(20,20);
    Localizacao localizacao = new Localizacao(11,11);
    instance.lugar(animal, localizacao);
    instance.localizacaoAdjacenteLivre(localizacao);
    assertNotEquals(localizacao, instance.localizacoesAdjacentesLivres(localizacao));
    }
   
<<<<<<< HEAD
}
=======
}
>>>>>>> 0da62794867b406a13927c286c91db8860e48fbd
