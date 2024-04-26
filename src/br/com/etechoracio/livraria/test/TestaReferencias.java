package br.com.etechoracio.livraria.test;
import br.com.etechoracio.livraria.model.Editora;
import br.com.etechoracio.livraria.model.Kindle;
import br.com.etechoracio.livraria.model.LivroImpresso;

public class TestaReferencias {
    public static void main(String[] args) {
        Editora editoraA = new Editora();
        editoraA.nome = "Petelincar";
        editoraA.site = "petelincar.com.www.br";

        LivroImpresso livroA = new LivroImpresso();
        livroA.setTitulo("Teste de Referência");
        String titulo;
        System.out.println("livro A = " + livroA.getTitulo());
        System.out.println("br.com.etechoracio.livraria.model.Editora = " + editoraA.nome + "| site = " + editoraA.site);


        Kindle livroB = new Kindle();
        livroB.setTitulo ("Teste de Referência");
        System.out.println("livro B = " + livroB.getTitulo());

        livroB.setTitulo ("Teste de Referência II");
        System.out.println("br.com.etechoracio.livraria.model.Livro A = " + livroA);

        System.out.println("br.com.etechoracio.livraria.model.Livro B = " + livroB);

        System.out.println(livroA);
        System.out.println(livroA);
    }
}
