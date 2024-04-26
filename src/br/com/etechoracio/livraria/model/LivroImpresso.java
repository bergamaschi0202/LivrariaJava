package br.com.etechoracio.livraria.model;
import br.com.etechoracio.livraria.enums.TipoCapa;

public class LivroImpresso extends Livro {
    private TipoCapa TipoCapa;



    public LivroImpresso(TipoCapa tipoCapa) {
        this.TipoCapa = tipoCapa;
    }

    void cobrarCapa(TipoCapa tipoCapa) {
        if (tipoCapa == TipoCapa.DURA) {
            preco += 5;
        }
        if (tipoCapa == TipoCapa.PERSONALIZADA) {
            preco += 10;
        }
    }

    double getTaxaEnvio() {
        return preco * 0.05;
    }


}
