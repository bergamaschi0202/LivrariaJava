package br.com.etechoracio.livraria.test;
import br.com.etechoracio.livraria.enums.TipoCapa;
import br.com.etechoracio.livraria.model.Editora;
import br.com.etechoracio.livraria.model.Kindle;
import br.com.etechoracio.livraria.model.LivroImpresso;
import br.com.etechoracio.livraria.SacolaCompras;

public class CriaLivro {

        public static void main(String[] args) {

                Editora editora1 = new Editora();
                editora1.nome = "Rafiq";
                editora1.site = "petelincar.com.www.br";

                LivroImpresso primeiroLivro = new LivroImpresso();
                primeiroLivro.setTitulo("Jamal abordo");
                primeiroLivro.setAutor("Arthur Bergamaschi");
                primeiroLivro.setTipoCapa(TipoCapa.DURA);
                primeiroLivro.setEditora(editora1);
                primeiroLivro.setPreco(100);
                primeiroLivro.exibir();



        {/*
        br.com.etechoracio.livraria.model.Livro segundoLivro = new br.com.etechoracio.livraria.model.Livro();
        segundoLivro.autor = "Arthur Bergamaschi";
        System.out.println("\nAutor : " + segundoLivro.autor);
        */}
                Editora editora2 = new Editora();
                editora2.nome = "Rafiq";
                editora2.site = "petelincar.com.www.br";


                Kindle segundoLivro = new Kindle();
                segundoLivro.setTitulo("Diego e os bichos da floresta");
                segundoLivro.setEditora(editora2);
                segundoLivro.setTipoCapa(TipoCapa.PERSONALIZADA);
                segundoLivro.setResumo("Este Livro relata a História de um rapaz ");


                SacolaCompras sacolaCompras2304 = new SacolaCompras();

    }
}