package com.example;

public class Cliente {

    public String nome;
    public long cpf;
    public Computador[] compras = new Computador[3];

    Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (Computador c : compras) {
            if (c != null) {
                total += c.preco;
            }
        }
        return total;
    }
}
