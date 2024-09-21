package org.example;

public class JogadorEstadoTransferido extends JogadorEstado{
    private JogadorEstadoTransferido(){};
    private static JogadorEstadoTransferido instance = new JogadorEstadoTransferido();
    public static JogadorEstado getInstance() {
        return instance;
    }
    public String getEstado(){
        return "jogador transferido";
    }
}
