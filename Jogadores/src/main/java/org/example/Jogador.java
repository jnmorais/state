package org.example;

public class Jogador {
    private String nome;
    private JogadorEstado estado;

    public Jogador(){
        this.estado = JogadorEstadoInscrito.getInstance();
    }
    public void setEstado(){
        this.estado = estado;
    }
    public boolean inscrever(){
        return estado.inscrever(this);
    }
    public boolean convocar(){
        return estado.convocar(this);
    }
    public boolean machucar(){
        return estado.machucar(this);
    }
    public boolean aposentar(){
        return estado.aposentar(this);
    }
    public boolean suspender(){
        return estado.suspender(this);
    }
    public boolean transferir(){
        return estado.transferir(this);
    }
    public boolean disponibilizar(){
        return estado.disponibilizar(this);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
