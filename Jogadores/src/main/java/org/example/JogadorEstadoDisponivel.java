package org.example;

public class JogadorEstadoDisponivel extends JogadorEstado{
    private JogadorEstadoDisponivel(){};
    private static JogadorEstadoDisponivel instance = new JogadorEstadoDisponivel();
    public static JogadorEstado getInstance() {
        return instance;
}
    public String getEstado(){
        return "jogador disponivel";
    }
    public boolean aposentar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        return true;
    }
    public boolean convocar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        return true;
    }
    public boolean machucar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoMachucado.getInstance());
        return true;
    }
    public boolean suspender(Jogador jogador) {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        return true;
    }
    public boolean transferir(Jogador jogador) {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        return true;
    }

}
