package org.example;

public class Jogador {
    private String nome;
    private JogadorEstado estado;

    public Jogador(){
        this.estado = JogadorEstadoRegularizado.getInstance();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
