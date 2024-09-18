package com.learning;

public class Gen<T> {
    private T data;
    public void setData(T e){
        data = e;
    }
    public T get(){return data;}

    public <G> G func(G a){
        return a;
    }

    public static void main(String[] args) {
        Gen<Integer> gen = new Gen();
        gen.setData(4);
        Integer a = gen.get();
        System.out.println(gen.get());
        String b = gen.func("2");
    }
}
