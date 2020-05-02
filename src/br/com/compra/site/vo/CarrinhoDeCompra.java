package br.com.compra.site.vo;

import java.util.List;

public class CarrinhoDeCompra {
    private List<Produto> produtos;
    private double preco;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double CalculaCompra() {
        for (int i = 0; i < produtos.size(); i++) {
            preco += getProdutos().get(i).getPreco();
        }
        return preco;
    }
}
