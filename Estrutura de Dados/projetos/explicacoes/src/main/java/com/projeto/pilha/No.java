package com.projeto.pilha;

public class No {

    private Integer dado;
    private No refNo = null;

    public No() {
    }

    public No(Integer dado) {
        this.dado = dado;
    }

    public Integer getDado() {
        return dado;
    }

    public void setDado(Integer dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
