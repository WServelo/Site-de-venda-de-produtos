package br.com.compra.site;

import br.com.compra.site.enun.Categoria;
import br.com.compra.site.vo.CarrinhoDeCompra;
import br.com.compra.site.vo.Produto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        List<Produto> produtos1 = new ArrayList<>();
        String imprimir = "";
        double preco = 0.0;
        String imprimir1 = "";
        double preco1 = 0.0;

        Produto produto1 = new Produto();
        produto1.setNome("1 Arroz branco");
        produto1.setCaregoria(Categoria.ALIMENTO);
        produto1.setMarca("Camil");
        produto1.setPreco(5.50);
        produtos.add(produto1);
        produtos1.add(produto1);

        Produto produto2 = new Produto();
        produto2.setNome("2 Pasta dental");
        produto2.setCaregoria(Categoria.HIGIENE);
        produto2.setMarca("Oral B");
        produto2.setPreco(7.50);
        produtos.add(produto2);
        produtos1.add(produto2);

        Produto produto3 = new Produto();
        produto3.setNome("3 Celular");
        produto3.setCaregoria(Categoria.ELETRODOMESTICOS);
        produto3.setMarca("LG");
        produto3.setPreco(600.0);
        produtos.add(produto3);
        produtos1.add(produto3);

        Produto produto4 = new Produto();
        produto4.setNome("4 Feijão carioca");
        produto4.setCaregoria(Categoria.ALIMENTO);
        produto4.setMarca("Tio João");
        produto4.setPreco(7.00);
        produtos.add(produto4);
        produtos1.add(produto4);

        Produto produto5 = new Produto();
        produto5.setNome("5 Sabonete líquido");
        produto5.setCaregoria(Categoria.HIGIENE);
        produto5.setMarca("Protex");
        produto5.setPreco(10.00);
        produtos.add(produto5);
        produtos1.add(produto5);

        Produto produto6 = new Produto();
        produto6.setNome("6 Fone de ouvido");
        produto6.setCaregoria(Categoria.ELETRODOMESTICOS);
        produto6.setMarca("JBL");
        produto6.setPreco(200.0);
        produtos.add(produto6);
        produtos1.add(produto6);


        //*******************Carrinho 0 *******************
        CarrinhoDeCompra compra = new CarrinhoDeCompra();
        compra.setProdutos(produtos);
        produtos.remove(produto1);
        produtos.remove(produto2);
        produtos.remove(produto4);
        produtos.remove(produto5);
        for (int i = 0; i < produtos.size(); i++) {
            imprimir += compra.getProdutos().get(i).getNome() + "\n";
        }
        JOptionPane.showMessageDialog(null, "Carrinho de compras 0: \n" + imprimir);

        preco = compra.CalculaCompra();
        JOptionPane.showMessageDialog(null, "Seu carrinho de compras 0 tem os seguintes produtos: \n"
                + imprimir + "\n O valor da sua compra é de R$" + preco);
        //*******************Carrinho 1 *******************
        CarrinhoDeCompra compra1 = new CarrinhoDeCompra();
        compra1.setProdutos(produtos1);
        produtos1.remove(produto3);
        produtos1.remove(produto6);
        for (int i = 0; i < produtos1.size(); i++) {
            imprimir1 += compra1.getProdutos().get(i).getNome() + "\n";
        }
        JOptionPane.showMessageDialog(null, "Carrinho de compras 1: \n" + imprimir1);

        preco1 = compra1.CalculaCompra();
        JOptionPane.showMessageDialog(null, "Seu carrinho de compras 1 tem os seguintes produtos: \n"
                + imprimir1 + "\n O valor da sua compra é de R$" + preco1);
        //##################################################

    }
}
