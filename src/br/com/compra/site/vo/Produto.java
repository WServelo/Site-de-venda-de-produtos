package br.com.compra.site.vo;

import br.com.compra.site.enun.Categoria;

public class Produto {
    private String nome;
    private String marca;
    private double preco;
    private Categoria caregoria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCaregoria() {
        return caregoria;
    }

    public void setCaregoria(Categoria caregoria) {
        this.caregoria = caregoria;
    }
}
