package com.learning.creational.singleton;

import java.util.Objects;

public class Singleton {
    private Singleton(){}
    private static Singleton instance;
    public static Singleton getInstance(){
        if(Objects.isNull(instance)){
            synchronized (Singleton.class){
                if(Objects.isNull(instance)) {
                    return new Singleton();
                }else{
                    return instance;
                }
            }
        }else{
            return instance;
        }
    }
}
