package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {

    List<Produto> produtos = new ArrayList<>();

    public TabelaProdutos() {
        Produto caneta = new Produto(1, "Caneta BIC", "Caneta BIC na cor azul", 1.99);
        Produto borracha = new Produto(2, "Borracha branca", "Borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lápis Faber Castel", "Lápis Faber Castel comum", 2.99);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    public List<Produto> buscarTodosOsProdutos(){
        return this.getProdutos();
    }
}
