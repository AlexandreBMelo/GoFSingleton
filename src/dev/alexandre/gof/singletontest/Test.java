package dev.alexandre.gof.singletontest;

public class Test
{
    public static void main(String[] args) {
        LazySingleton lazy = LazySingleton.getInstacia();
        System.out.println(lazy);
        EagerSingleton eager = EagerSingleton.getInstacia();
        System.out.println(eager);
        LazyHolderSingleton lazyHolder = LazyHolderSingleton.getInstacia();
        System.out.println(lazyHolder);
    }
}
