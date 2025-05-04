package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singleton.*;
import one.digitalinnovation.gof.strategy.*;
import one.digitalinnovation.gof.facade.Facade;

public class Test {
    public static void main(String[] args) {
        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("Matheus", "12345678");
    }
}
