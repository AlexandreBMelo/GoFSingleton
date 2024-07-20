package dev.alexandre.gof;
/**
 *  Singleton "apressado"
 *  @author AlexandreBMelo
 */
public class EagerSingleton {

    private static EagerSingleton instacia = new EagerSingleton();

    private EagerSingleton(){
        super();
    }
    public static EagerSingleton getInstacia() {
        return instacia;
    }

}