package org.example;

public abstract class  JogadorEstado {

    public boolean convocar(Jogador jogador){
        return false;
    }
    public boolean machucar(Jogador jogador){
        return false;
    }
    public boolean aposentar(Jogador jogador){return false;}
    public boolean suspender(Jogador jogador){
        return false;
    }
    public boolean transferir(Jogador jogador){
        return false;
    }
    public boolean disponibilizar(Jogador jogador){return false;}
}


