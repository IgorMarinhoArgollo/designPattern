package org.designPattern.strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("movendo-se ofensivamente");
    }
}
