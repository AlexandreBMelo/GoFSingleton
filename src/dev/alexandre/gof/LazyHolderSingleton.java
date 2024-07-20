package dev.alexandre.gof;
/**
 *  Singleton "LazyHolder"
 *  @author AlexandreBMelo
 */
public class LazyHolderSingleton {

    private static class Detentor {
        public static LazyHolderSingleton instacia = new LazyHolderSingleton();
    }
    private LazyHolderSingleton(){
        super();
    }
    public static LazyHolderSingleton getInstacia() {
        return Detentor.instacia;
    }

}