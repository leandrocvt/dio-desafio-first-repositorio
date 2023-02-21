package br.com.dio;

import br.com.dio.model.Gato;

public class FirstProgram {
    public static void main(String[] args) {

        Gato gato = new Gato();

        System.out.println(gato);

        Book book = new Book("Racionais", 350);
        System.out.println(book);

       /* int a = 5;
        int b = 2;

        System.out.println("Hello World! " + (a+b));*/
    }
}

class Book {

    private String name;
    private Integer numberPages;

    public Book(String name, Integer numberPages) {
        this.name = name;
        this.numberPages = numberPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(Integer numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Livro: " + name + "\nNumber pages: " + numberPages;
    }
}
