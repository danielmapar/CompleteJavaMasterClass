package com.timbuchalka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Dog {
    private String name;
    private int idade;

    public Dog(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.idade;
    }

    @Override
    public Dog clone()  {
        Dog d = new Dog(new String(this.name), this.idade);
        return d;
    }
}

interface F<A, B> {
    B maiorQueDez(A a);
}


class daniel implements F<Integer, Boolean> {
    public Boolean maiorQueDez(Integer a) {
        return a > 10;
    }
}

public class Main {

    public static int value = 0;


    public static <T> T primeiroMatch(final List<T> ts, final F<T, Boolean> f, T z) {
        for (T t : ts)
            if (f.maiorQueDez(t))
                return t;
        return z;
    }


    public static void main(String[] args) {

        /*Dog um = new Dog("um", 1);

        List<Dog> lista = new ArrayList<>();

        lista.add(um);
        lista.add(new Dog("dois", 2));
        lista.add(new Dog("tres", 3));


        // Shallow copy
        List<Dog> lista2 = new ArrayList<>(lista);

        um.setName("cinco");
        um.setIdade(5);

        System.out.println("List 1: " + lista.get(0));
        System.out.println("List 2: " + lista2.get(0));

        // Deep copy

        List<Dog> lista2 = new ArrayList<>();

        for(Dog dog : lista) {
            lista2.add(dog.clone());
        }

        um.setName("cinco");
        um.setIdade(5);

        System.out.println("Primeiro item lista 1: " + lista.get(0));
        System.out.println("Primeiro item lista 2: " + lista2.get(0));*/


        // anonymous inner class
        F<Integer, Boolean> maiorQueDez = new F<Integer, Boolean>() {
            public Boolean maiorQueDez(final Integer n) {
                return n > 10;
            }
        };

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(20);


        int falha = -1;

        int moreThanMyFingersCanCount = primeiroMatch(numeros, maiorQueDez, falha);

        System.out.println("moreThanMyFingersCanCount: " + moreThanMyFingersCanCount);
    }


}





































