package br.com.compra.site.vo;

import java.util.List;

public class CarrinhoDeCompra {
    private List<Produto> produtos;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
