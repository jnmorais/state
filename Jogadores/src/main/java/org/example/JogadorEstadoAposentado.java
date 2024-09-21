package org.example;

public class JogadorEstadoAposentado extends JogadorEstado{
    private JogadorEstadoAposentado(){};
    private static JogadorEstadoAposentado instance = new JogadorEstadoAposentado();
    public static JogadorEstado getInstance() {
        return instance;
    }
    public String getEstado(){
        return "jogador aposentado";
    }

}
