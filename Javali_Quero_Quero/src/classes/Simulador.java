package classes;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Color;

public class Simulador {

    private static final int LARGURA_PADRAO = 50;
    private static final int PROFUNDIDADE_PADRAO = 50;
    private static final double PROBABILIDADE_CRIACAO_JAVALI = 0.02;
    private static final double PROBABILIDADE_CRIACAO_QUEROQUERO = 0.28;

//    private List<QueroQuero> queroQueros;
//    private List<Javali> javalis;
    private List<Animal> animais;
    private Campo campo;
    private int etapa;
    private SimuladorTela tela;

    public Simulador() {
        this(PROFUNDIDADE_PADRAO, LARGURA_PADRAO);
    }

    public Simulador(int profundidade, int largura) {
        if (largura <= 0 || profundidade <= 0) { //alterado de e para ou.
            System.out.println("As dimensões devem ser maior do que zero.");
            System.out.println("Usando valores padrões.");
            profundidade = PROFUNDIDADE_PADRAO;
            largura = LARGURA_PADRAO;
        }

//        queroQueros = new ArrayList<QueroQuero>();
//        javalis = new ArrayList<Javali>();
        animais = new ArrayList<Animal>();
        campo = new Campo(profundidade, largura);

        tela = new SimuladorTela(profundidade, largura);
        tela.setCor(QueroQuero.class, Color.orange);
        tela.setCor(Javali.class, Color.blue);
        redefine();

    }

    public void executaLongaSimulacao() {
        simulacao(500);
        System.out.println("Execução até a etapa: "+etapa);
    }

    public void simulacao(int numEtapas) {
        for (int etapa = 1; etapa <= numEtapas && tela.ehViavel(campo); etapa++) {//alterado de numetapa para etapa
            simulacaoUmaEtapa();

        }
    }

    public void simulacaoUmaEtapa() {
        etapa++;//adionado para fazer a contagem no painel
        //QueroQuero queroQueros
        List<Animal> novosAnimais = new ArrayList<Animal>();//Agora recebe de aniamal
        for (Iterator<Animal> it = animais.iterator(); it.hasNext();) {
            Animal animal = it.next();
            animal.acao(novosAnimais);
            if (!animal.isVivo()) {
                it.remove();
            }
        }
        animais.addAll(novosAnimais);

        tela.mostraStatus(etapa, campo);
    }
    //Reaproveitei o codigo que existia do Javali e susbstitui por animal.

    public void redefine() {
        etapa = 0;
        animais.clear();
        povoa();//adicionado o povoa para dar inicio ao sistema
        tela.mostraStatus(etapa, campo);
    }

    private void povoa() {
        Random rand = Randomizador.getRandom();
        campo.limpa();
        for (int linha = 0; linha < campo.getProfundidade(); linha++) {
            for (int coluna = 0; coluna < campo.getLargura(); coluna++) {
                if (rand.nextDouble() <= PROBABILIDADE_CRIACAO_JAVALI) {//Inversão condição
                    Localizacao localizacao = new Localizacao(linha, coluna);
                    Javali javali = new Javali(true, campo, localizacao);
                    animais.add(javali);//Agora herda de animais
                } else if (rand.nextDouble() <= PROBABILIDADE_CRIACAO_QUEROQUERO) {
                    Localizacao localizacao = new Localizacao(linha, coluna);
                    QueroQuero queroQuero = new QueroQuero(true, campo, localizacao);
                    animais.add(queroQuero);//Agora herda de animais
                }
            }
        }
    }
}
