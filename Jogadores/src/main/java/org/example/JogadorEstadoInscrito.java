package org.example;

public class JogadorEstadoInscrito  extends JogadorEstado{
    private static JogadorEstadoInscrito instance = new JogadorEstadoInscrito();
    public static JogadorEstado getInstance() {
        return instance;
    }
}
