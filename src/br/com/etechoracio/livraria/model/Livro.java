package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapa;

public abstract class Livro {
    private String titulo;
    private String resumo;
    private String autor;
    protected double preco;
    private Editora editora;


    void cobrarCapa(TipoCapa tipoCapa) {
        if (tipoCapa == TipoCapa.DURA) {
            preco += 5;
        }
        if (tipoCapa == TipoCapa.PERSONALIZADA) {
            preco += 10;
        }
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }


    public void exibir() {
        System.out.println("Título : " + titulo);
        System.out.println("Autor : " + autor);
        //System.out.println("Tipo da Capa : " + TipoCapa);
        System.out.println("Preço: " + formatarValor(preco));
        //System.out.println("Taxa de envio: " + formatarValor(getTaxaEnvio()));
        editora.exibirEditora();

    }

    String formatarValor(double param) {
        return String.format("R$ %.2f", param);
    }

    void aplicaDesconto(double percentual) {
        preco = preco - (preco * percentual);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String setTipoCapa(br.com.etechoracio.livraria.enums.TipoCapa dura) { return setTipoCapa(br.com.etechoracio.livraria.enums.TipoCapa.DURA);}

    public String getTitulo() {
        return titulo;
    }
}

