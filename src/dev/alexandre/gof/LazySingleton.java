package dev.alexandre.gof;
/**
*   Singleton "preguiçoso"
*  @author AlexandreBMelo
 */
public class LazySingleton {

    private static LazySingleton instacia;

    private LazySingleton(){
        super();
    }
    public static LazySingleton getInstacia() {
        if (instacia == null){
            instacia = new LazySingleton();

        }
        return instacia;
    }

}
