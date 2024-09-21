package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class JogadorTest {
    Jogador jogador;
    @BeforeEach
    public void setUp() {
        jogador = new Jogador();
    }

    //Jogador Disponivel

    @Test
    public void naoDeveDisponibilizarJogadorDisponivel() {
        jogador.setEstado(JogadorEstadoDisponivel.getInstance());
        assertFalse(jogador.disponibilizar());
    }

    @Test
    public void deveAposentarJogadorDisponivel() {
        jogador.setEstado(JogadorEstadoDisponivel.getInstance());
        assertTrue(jogador.aposentar());
        assertEquals(JogadorEstadoAposentado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveConvocarJogadorDisponivel() {
        jogador.setEstado(JogadorEstadoDisponivel.getInstance());
        assertTrue(jogador.convocar());
        assertEquals(JogadorEstadoConvocado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveMachucarJogadorDisponivel() {
        jogador.setEstado(JogadorEstadoDisponivel.getInstance());
        assertTrue(jogador.machucar());
        assertEquals(JogadorEstadoMachucado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveSuspenderJogadorDisponivel() {
        jogador.setEstado(JogadorEstadoDisponivel.getInstance());
        assertTrue(jogador.suspender());
        assertEquals(JogadorEstadoSuspenso.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveTransferirJogadorDisponivel() {
        jogador.setEstado(JogadorEstadoDisponivel.getInstance());
        assertTrue(jogador.transferir());
        assertEquals(JogadorEstadoTransferido.getInstance(), jogador.getEstado());
    }

    //Jogador Aposentado

    @Test
    public void naoDeveDisponibilizarJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.disponibilizar());
    }

    @Test
    public void naoDeveConvocarJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.convocar());
    }

    @Test
    public void naoDeveMachucarJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.machucar());
    }

    @Test
    public void naoDeveSuspenderJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.suspender());
    }

    @Test
    public void naoDeveTransferirJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.transferir());
    }

    @Test
    public void naoDeveAposentarJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.aposentar());
    }

    //Jogador convocado

    @Test
    public void naoDeveConvocarJogadorConvocado() {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.convocar());
    }

    @Test
    public void naoDeveSuspenderJogadorConvocado() {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.suspender());
    }

    @Test
    public void naoDeveTransferirJogadorConvocado() {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.transferir());
    }

    @Test
    public void naoDeveAposentarJogadorConvocado() {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.aposentar());
    }

    @Test
    public void deveMachucarJogadorConvocado() {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertTrue(jogador.machucar());
        assertEquals(JogadorEstadoMachucado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveDisponibilizarJogadorConvocado() {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertTrue(jogador.disponibilizar());
        assertEquals(JogadorEstadoDisponivel.getInstance(), jogador.getEstado());
    }

    //Jogador Machucado

    @Test
    public void naoDeveMachucarJogadorMachucado() {
        jogador.setEstado(JogadorEstadoMachucado.getInstance());
        assertFalse(jogador.machucar());
    }

    @Test
    public void naoDeveConvocarJogadorMachucado() {
        jogador.setEstado(JogadorEstadoMachucado.getInstance());
        assertFalse(jogador.convocar());
    }

    @Test
    public void naoDeveSuspenderJogadorMachucado() {
        jogador.setEstado(JogadorEstadoMachucado.getInstance());
        assertFalse(jogador.suspender());
    }

    @Test
    public void naoDeveTransferirJogadorMachucado() {
        jogador.setEstado(JogadorEstadoMachucado.getInstance());
        assertFalse(jogador.transferir());
    }

    @Test
    public void deveDisponibilizarJogadorMachucado() {
        jogador.setEstado(JogadorEstadoMachucado.getInstance());
        assertTrue(jogador.disponibilizar());
        assertEquals(JogadorEstadoDisponivel.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveAposentarJogadorMachucado() {
        jogador.setEstado(JogadorEstadoMachucado.getInstance());
        assertTrue(jogador.aposentar());
        assertEquals(JogadorEstadoAposentado.getInstance(), jogador.getEstado());
    }

    //Jogador Suspenso

    @Test
    public void naoDeveSuspenderJogadorSuspenso() {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertFalse(jogador.suspender());
    }

    @Test
    public void naoDeveAposentarJogadorSuspenso() {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertFalse(jogador.aposentar());
    }

    @Test
    public void naoDeveMachucarJogadorSuspenso() {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertFalse(jogador.machucar());
    }

    @Test
    public void naoDeveTransferirJogadorSuspenso() {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertFalse(jogador.transferir());
    }

    @Test
    public void naoDeveConvocarJogadorSuspenso() {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertFalse(jogador.convocar());
    }

    @Test
    public void deveDisponibilizarJogadorSuspenso() {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertTrue(jogador.disponibilizar());
        assertEquals(JogadorEstadoDisponivel.getInstance(), jogador.getEstado());
    }

    //Jogador transferido

    @Test
    public void naoDeveDisponibilizarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.disponibilizar());
    }

    @Test
    public void naoDeveConvocarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.convocar());
    }

    @Test
    public void naoDeveMachucarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.machucar());
    }

    @Test
    public void naoDeveSuspenderJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.suspender());
    }

    @Test
    public void naoDeveTransferirJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.transferir());
    }

    @Test
    public void naoDeveAposentarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.aposentar());
    }
}