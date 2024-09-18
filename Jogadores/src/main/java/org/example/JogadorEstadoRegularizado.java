package org.example;

public class JogadorEstadoRegularizado  extends JogadorEstado{

    private JogadorEstadoRegularizado(){};
    private static JogadorEstadoRegularizado instance = new JogadorEstadoRegularizado();
    public static JogadorEstado getInstance() {
        return instance;
    }
}
