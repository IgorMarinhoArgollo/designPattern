package org.designPattern;

import org.designPattern.facede.Facade;
import org.designPattern.singleton.EagerSingleton;
import org.designPattern.singleton.LazyHolderSingleton;
import org.designPattern.singleton.LazySingleton;
import org.designPattern.strategy.Comportamento;
import org.designPattern.strategy.ComportamentoAgressivo;
import org.designPattern.strategy.ComportamentoDefensivo;
import org.designPattern.strategy.ComportamentoNormal;
import org.designPattern.strategy.Robo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        // Singleton
        LazySingleton lazy = LazySingleton.getInstancia();
        System.out.println(lazy);
        lazy = LazySingleton.getInstancia();
        System.out.println(lazy);

        EagerSingleton eager = EagerSingleton.getInstancia();
        System.out.println(eager);
        eager = EagerSingleton.getInstancia();
        System.out.println(eager);

        LazyHolderSingleton lazyHolder = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("nomeDoCliente", "123456");
    }
}