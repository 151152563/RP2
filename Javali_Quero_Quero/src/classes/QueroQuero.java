package classes;

import java.util.List;
import java.util.Random;

public class QueroQuero extends Animal {

    private static final int IDADE_PROCRIACAO = 5;
    private static final int IDADE_MAXIMA = 40;
    private static final double PROBABILIDADE_PROCRIACAO = 0.15;
    private static final int TAMANHO_MAXIMO_NINHADA = 4;
    private static final Random RAND = Randomizador.getRandom();

    private int idade;
    /*private boolean vivo;
    private Localizacao localizacao;
    private Campo campo;retirado pois importa da classe Animal
    */
    public QueroQuero(boolean randomAge, Campo campo, Localizacao localizacao) {
        super(campo, localizacao);//chama direto da classe Pai
        //idade = 0;
        //vivo = true;retirados
        //this.campo = campo;
        //setLocalizacao(localizacao);
        if (randomAge) {//sem necessidade de true
            idade = RAND.nextInt(IDADE_MAXIMA);
            
        }
        else{
            idade = 0;
        }
    }

    public void acao(List<Animal> novosQueroQueros) {//alterado para List animal e alterado para acao
        incrementaIdade();
        if (isVivo()) {
            chocaOvos(novosQueroQueros);
            Localizacao newLocalizacao = getCampo().localizacaoAdjacenteLivre(getLocalizacao()); //alterado para gets
            if (newLocalizacao != null) {//alterado de == para !=
                setLocalizacao(newLocalizacao);

            } else {
                setMorte();
            }
        }
    }

    /*public boolean estaViva() {
        return vivo;
    
    retirados, pois agora herda da classe Animal
    public void setMorte() {
        vivo = false;
        if (localizacao == null) { // foi adicionado o ==.
            campo.limpa(localizacao);
            localizacao = null;
            campo = null;
        }
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    private void setLocalizacao(Localizacao newLocalizacao) {
        if (localizacao == null) { // n�o � diferente de null, mas sim igual a null.
            //campo.limpa(localizacao); // foi retirado
            localizacao = newLocalizacao;
            campo.lugar(this, newLocalizacao);
        }

    }*/

    private void incrementaIdade() {
        idade++;//retirado de dentro da condição para fora, simplicando o código
        //System.out.println(idade);
        if (idade > IDADE_MAXIMA) {
            

            // Foi adicionado o <=. alteração para <  se deixar igual, quando chegar a idade maxima vai passar 1 ano.
            // se a idade for menor que a idade m�xima, vai incrementando
            // Bom s� para ficar incrementando a idade
         // foi adicionado o else if com >=
            setMorte();

        }

    }

    private void chocaOvos(List<Animal> novosQueroQueros) {
        Campo campo = getCampo();//adicionado
        List<Localizacao> livre = campo.localizacoesAdjacentesLivres(getLocalizacao());//herda localizaçao da superclass
        int nascimentos = procria();
        for (int b = 0; b < nascimentos && livre.size() > 0; b++) {
            Localizacao loc = livre.remove(0);
            QueroQuero jovem = new QueroQuero(false, campo, loc); // foi trocado para falso.
            novosQueroQueros.add(jovem);

        }
    }

    private int procria() {
        int nascimentos = 0;
        if (podeProcriar()&&RAND.nextDouble() <= PROBABILIDADE_PROCRIACAO) {//trocado de maior para menor e igual
            
                nascimentos = RAND.nextInt(TAMANHO_MAXIMO_NINHADA) + 1;//add
            //apagado
        }
        return nascimentos;
    }

    /*int nascimentos = 0;
        if (podeProcriar() && rand.nextDouble() > PROBABILIDADE_PROCRIACAO) { // foi trocado de || para &&
            nascimentos = rand.nextInt(TAMANHO_MAXIMO_NINHADA);
        }
        return nascimentos;
    }*/
    private boolean podeProcriar() {

        return idade >= IDADE_PROCRIACAO;
    }
}
