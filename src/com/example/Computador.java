package com.example;

public class Computador {

    public String marca;
    public float preco;
    public HardwareBasico[] hardwareBasico;
    public SistemaOperacional sistemaOperacional;
    public MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, HardwareBasico[] hardwareBasico, SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.hardwareBasico = hardwareBasico;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome);
        System.out.println("Sistema Operacional Tipo: " + sistemaOperacional.tipo + "bit");

        for (HardwareBasico hardware : this.hardwareBasico) {
            System.out.println("Hardware Básico: " + hardware.nome);
            System.out.println("Hardware Básico Capacidade: " + hardware.capacidade);
        }

        if (memoriaUSB != null) {
            System.out.println("Memória USB: " + memoriaUSB.nome);
            System.out.println("Memória USB Capacidade: " + memoriaUSB.capacidade + "GB");
        } else {
            System.out.println("Memória USB: Não configurada");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }
}
