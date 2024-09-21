package org.example;

public class JogadorEstadoMachucado  extends JogadorEstado{
    private JogadorEstadoMachucado(){};
    private static JogadorEstadoMachucado instance = new JogadorEstadoMachucado();
    public static JogadorEstado getInstance() {
        return instance;
    }
    public String getEstado(){
        return "jogador machucado";
    }
    public boolean disponibilizar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoDisponivel.getInstance());
        return true;
    }
    public boolean aposentar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        return true;
    }
}
