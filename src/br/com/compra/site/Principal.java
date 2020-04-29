package br.com.compra.site;

import br.com.compra.site.vo.CarrinhoDeCompra;
import br.com.compra.site.enun.Categoria;
import br.com.compra.site.vo.Produto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        String imprimir = "";
        double preco = 0.0;

        Produto produto1 = new Produto();
        produto1.setNome("Arroz branco");
        produto1.setCaregoria(Categoria.ALIMENTO);
        produto1.setMarca("Camil");
        produto1.setPreco(5.50);
        produtos.add(produto1);

        Produto produto2 = new Produto();
        produto2.setNome("Pasta dental");
        produto2.setCaregoria(Categoria.HIGIENE);
        produto2.setMarca("Oral B");
        produto2.setPreco(7.50);
        produtos.add(produto2);

        Produto produto3 = new Produto();
        produto3.setNome("Celular");
        produto3.setCaregoria(Categoria.ELETRODOMESTICOS);
        produto3.setMarca("LG");
        produto3.setPreco(600.0);
        produtos.add(produto3);

        CarrinhoDeCompra compra1 = new CarrinhoDeCompra();
        compra1.setProdutos(produtos);
        produtos.remove(1);

        for (int i = 0; i < produtos.size(); i++) {
            imprimir += compra1.getProdutos().get(i).getNome() + "\n";
        }
        JOptionPane.showMessageDialog(null, imprimir);
        System.out.println(imprimir);

        for (int i = 0; i < produtos.size(); i++) {
            preco += compra1.getProdutos().get(i).getPreco();
            System.out.println(compra1.getProdutos().get(i).getPreco());
        }
        JOptionPane.showMessageDialog(null, "Seu carrinho de compras tem os seguintes produtos: \n"
                + imprimir + "\n O valor da sua compra é de R$" + preco);


/*
System.out.println(imprimir);
for (Produto s : produtos) {
            System.out.println(compra1.getProdutos.getnomes);
        }
 System.out.println(compra1.getProdutos().get(0).getNome());
         CarrinhoDeCompra compra1 = new CarrinhoDeCompra();
        compra1.setProdutos(produtos);
        compra1.setProdutos(outrosprodutos);
        List<String> tst = new ArrayList<>();
        tst.add("carne");
        tst.add("ovo");
        tst.add("farinha");
        System.out.println("Carrinho 1 " + produto1.getNome());
        System.out.println(produtos);
        System.out.println("Carrinho 1 " + tst);
        */
    }
}
