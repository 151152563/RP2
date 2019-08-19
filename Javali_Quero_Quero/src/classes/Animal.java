package classes;
import java.util.List;
/**
 *
 * @author gabri
//Classe animal abstrata que unifica tanto javali quanto quero-quero
* serve apenas para modelar ambos
 */
public abstract class Animal {//Classe do tipo abstrata
    private boolean vivo; //Verifica o estado do animal
    private Campo campo; //Adciona o campo
    private Localizacao localizacao;//Posiciona o animal no tabuleiro
    
    public Animal (Campo campo, Localizacao localizacao){
        vivo = true;
        this.campo = campo;
        setLocalizacao(localizacao);
    }
    
    abstract public void acao(List<Animal> novoAnimal);//Obriga animal ter um array list pelo contrutor
    
    public boolean isVivo(){//Verifica se o animal está vivo, valida, na verdade
        return vivo;
    }
    
    public void setMorte(){//Mata o animal e remove ele do tabuleiro
        vivo = false;
        if (localizacao !=null){
            campo.limpa(localizacao);
            localizacao = null;
            campo = null;
        }
    }
    
    public Localizacao getLocalizacao () {
        return localizacao;
    }
    public void setLocalizacao(Localizacao newLocalizacao){
        if (localizacao != null) {
            campo.limpa(localizacao);
        }
        localizacao = newLocalizacao;
        campo.lugar(this, newLocalizacao);//alterado de localizacao para newLocalizacao
    }
    
    public Campo getCampo(){
        return campo;
    }
    
    
}
