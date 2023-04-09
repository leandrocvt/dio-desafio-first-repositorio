package com.projeto.lista;

public class No<T> {

    private T conteudo;
    private No proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }
}
