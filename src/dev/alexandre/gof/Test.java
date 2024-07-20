package dev.alexandre.gof;

import java.sql.SQLOutput;

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
