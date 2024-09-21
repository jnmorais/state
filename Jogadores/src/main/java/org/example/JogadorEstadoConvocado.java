package org.example;

public class JogadorEstadoConvocado extends JogadorEstado {

    private JogadorEstadoConvocado(){};
    private static JogadorEstadoConvocado instance = new JogadorEstadoConvocado();
    public static JogadorEstado getInstance() {
        return instance;
    }
    public String getEstado(){
        return "jogador convocado";
    }
    public boolean disponibilizar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoDisponivel.getInstance());
        return true;
    }
    public boolean machucar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoMachucado.getInstance());
        return true;
    }
}
