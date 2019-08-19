package classes;

import java.awt.Color;

public class Contador
{
    private String name;
    private int count;

    public Contador(String name)//adicionado parametro do tipo int
    {
        this.name = name;
        //this.count = count;//removido count = 0 recebe o count
        
        this.count = 0;
        //this.count++;//adicionado count ++
    }

    /*public void setName(String name) {//adicionado
        this.name = name;
    }*/
    //retirados pois os valores não precisam ser setados.
    /*public void setCount(int count) {//adicionado
        this.count = count;
    }*/
    
    public String getName()
    {
        return this.name;//adicionado o this.
    }

    public int getCount()
    {
        return this.count;//adicionado o this.
    }

    public void increment()
    {
        count++;
    }
    
    public void reset()
    {
        count = 0;
    }
}