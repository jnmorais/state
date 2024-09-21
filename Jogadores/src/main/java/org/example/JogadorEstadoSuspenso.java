package org.example;

public class JogadorEstadoSuspenso  extends JogadorEstado{
    private JogadorEstadoSuspenso(){};
    private static JogadorEstadoSuspenso instance = new JogadorEstadoSuspenso();
    public static JogadorEstado getInstance() {
        return instance;
    }
    public String getEstado(){
        return "jogador suspenso";
    }
    public boolean disponibilizar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoDisponivel.getInstance());
        return true;
    }
}
