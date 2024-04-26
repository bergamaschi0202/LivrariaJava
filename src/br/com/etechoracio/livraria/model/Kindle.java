package br.com.etechoracio.livraria.model;

public class Kindle extends Livro {
    private String marcaDagua;

    public double desconto(double percentual) {
        if (percentual > 0.1) {
            System.out.println("Desconto não pode ser maior que 10%");
        } else {
            preco = preco - (preco * percentual);
        }

        return percentual;
    }
}
