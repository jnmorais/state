package org.example;

public class Jogador {
    private String nome;
    private JogadorEstado estado;

    public Jogador(){
        this.setEstado(JogadorEstadoDisponivel.getInstance());
    }
    public boolean convocar(){
        return getEstado().convocar(this);
    }
    public boolean machucar(){
        return getEstado().machucar(this);
    }
    public boolean aposentar(){
        return getEstado().aposentar(this);
    }
    public boolean suspender(){
        return getEstado().suspender(this);
    }
    public boolean transferir(){
        return getEstado().transferir(this);
    }
    public boolean disponibilizar(){
        return getEstado().disponibilizar(this);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JogadorEstado getEstado() {
        return estado;
    }

    public void setEstado(JogadorEstado estado) {
        this.estado = estado;
    }
}
