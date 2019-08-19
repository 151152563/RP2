package classes;

import java.util.List;
import java.util.Iterator;
import java.util.Random;

public class Javali extends Animal {

    private static final int IDADE_PROCRIACAO = 10;
    private static final int IDADE_MAXIMA = 150;
    private static final double PROBABILIDADE_PROCRIACAO = 0.75;
    private static final int TAMANHO_MAXIMO_NINHADA = 5;
    private static final int VALOR_FOME_QUEROQUERO = 7;
    private static final Random RAND = Randomizador.getRandom();

    private int idade;
//    private boolean vivo;
//    private Localizacao localizacao;
//    private Campo campo;
//    Não utilizados...
    private int nivelFome;

    public Javali(boolean idadeRandomica, Campo campo, Localizacao localizacao) {
//        this.campo = campo;
//        setLocalizacao(localizacao);
        super(campo, localizacao);//Referencia direta a classe pai campo, chamando ela e a localização
        if (idadeRandomica) {
            idade = RAND.nextInt(IDADE_MAXIMA);
            nivelFome = RAND.nextInt(VALOR_FOME_QUEROQUERO);
        } else {
            idade = 0;//Aqui está ok
            nivelFome = VALOR_FOME_QUEROQUERO;
        }
    }

    public void acao(List<Animal> novosJavalis) {//Agora recebe da classe animal
        //Não é mais caca e sim ação conforme a classe animal que agora generaliza

        incrementaIdade();
        incrementaFome();//Se faz caca sente mais fome...
        if (isVivo()) {
            daALuz(novosJavalis);
            Localizacao localizacao = getLocalizacao();//Para recuperar a localização
            Localizacao newLocalizacao = procuraComida(localizacao);
            if (newLocalizacao == null) {
                newLocalizacao = getCampo().localizacaoAdjacenteLivre(localizacao);
            }
            if (newLocalizacao != null) {
                setLocalizacao(newLocalizacao);
            } else {
                setMorte();
            }
        }
    }

    /*public boolean estaVivo()
    {
        return vivo;
    }

    public Localizacao getLocalizacao()
    {
        return localizacao;
    }
    retirado pois as informações agora herdam da classe mãe Animal
    private void setLocalizacao(Localizacao newLocalizacao)
    {
        if(localizacao != null) {
            campo.limpa(localizacao);
        }
        localizacao = newLocalizacao;
        campo.lugar(this, newLocalizacao);
    }*/
    private void incrementaIdade() {
        idade++;
        if (idade > IDADE_MAXIMA) {//Logica invertida
            setMorte();

        }
    }

    private void incrementaFome() {
//       nivelFome++;
        nivelFome--;
        //if(nivelFome <= VALOR_FOME_QUEROQUERO) { ????
        if (nivelFome <= 0) {//???
            setMorte();//Morre de fome
        }

    }

    private Localizacao procuraComida(Localizacao localizacao) {
        Campo campo = getCampo();//adicionado
        List<Localizacao> adjacente = campo.localizacoesAdjacentes(getLocalizacao());//mesmo critério usado no método abaixo
        Iterator<Localizacao> it = adjacente.iterator();
        while (it.hasNext()) {
            Localizacao onde = it.next();
            Object animal = campo.getObjectAt(onde);
            if(animal instanceof QueroQuero){//verifica se o Animal é do tipo QueroQuero 
                QueroQuero queroQuero = (QueroQuero) animal; 
                    if(queroQuero.isVivo()){//adicionado a condição para que os quero queros vivos que foram usado como refeição recebam setMorte
                        queroQuero.setMorte();
                        nivelFome = VALOR_FOME_QUEROQUERO;
                        return onde;
                    }
            }
        }
        return null;
    }

    private void daALuz(List<Animal> novosJavalis) {//alterado para List Animal.
        Campo campo = getCampo();//adicionado para pegar o campo de Animal
        List<Localizacao> livre = campo.localizacoesAdjacentesLivres(getLocalizacao());//retirado a localizacao e adicionado get
        int nascimentos = procria();
        for (int b = 0; b < nascimentos && livre.size()>0; b++) {//mesmo modo do quero quero
            Localizacao loc = livre.remove(0);
            Javali jovem = new Javali(false, campo, loc);
            novosJavalis.add(jovem);
        }
    }

    private int procria() {
        int nascimentos = 0;
        if (podeProcriar()&& RAND.nextDouble() <= PROBABILIDADE_PROCRIACAO) {//alterado para <=
            //Logica invertida
                nascimentos = RAND.nextInt(TAMANHO_MAXIMO_NINHADA) + 1;
            
        }
        return nascimentos;
    }

    private boolean podeProcriar() {
        return idade >= IDADE_PROCRIACAO;
    }

//    public void setMorte();
//    {
//        vivo = false;
//        if(localizacao != null) {
//            campo.limpa(localizacao);
//            localizacao = null;
//            campo = null;
//        }
//    }Já existe em animmal
}
