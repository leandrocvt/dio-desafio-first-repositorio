package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = a;

        System.out.println("a: " + a + " b = " + b);
        a = 2;
        System.out.println("a: " + a + " b = " + b);


        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("\nObjA: " + objA + " ObjB: " + objB);
        objA.setNum(2);
        System.out.println("ObjA: " + objA + " ObjB: " + objB);
    }
}
