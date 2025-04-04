package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float matricula = 617f;

        // Promocao 1
        HardwareBasico[] hardwares1 = {
            new HardwareBasico("Pentium Core i3", 2200),
            new HardwareBasico("Memoria RAM", 8),
            new HardwareBasico("HD", 500),};

        SistemaOperacional sistemaOperacional1 = new SistemaOperacional("Linux Ubuntu", 32);
        MemoriaUSB memoriaUSB1 = new MemoriaUSB("Pen-drive", 16);
        Computador computador1 = new Computador("Apple", matricula, hardwares1, sistemaOperacional1);
        computador1.addMemoriaUSB(memoriaUSB1);

        // Promocao 2
        HardwareBasico[] hardwares2 = {
            new HardwareBasico("Pentium Core i5", 3370),
            new HardwareBasico("Memoria RAM", 16),
            new HardwareBasico("HD", 1000),};

        SistemaOperacional sistemaOperacional2 = new SistemaOperacional("Windows 8", 64);
        MemoriaUSB memoriaUSB2 = new MemoriaUSB("Pen-drive", 32);
        Computador computador2 = new Computador("Samsung", matricula + 1234f, hardwares2, sistemaOperacional2);
        computador2.addMemoriaUSB(memoriaUSB2);

        // Promocao 3
        HardwareBasico[] hardwares3 = {
            new HardwareBasico("Pentium Core i7", 4500),
            new HardwareBasico("Memoria RAM", 32),
            new HardwareBasico("HD", 2000),};

        SistemaOperacional sistemaOperacional3 = new SistemaOperacional("Windows 10", 64);
        MemoriaUSB memoriaUSB3 = new MemoriaUSB("HD Externo", 1000);
        Computador computador3 = new Computador("Dell", matricula + 5678f, hardwares3, sistemaOperacional3);
        computador3.addMemoriaUSB(memoriaUSB3);

        Cliente cliente = new Cliente("Lucas de Souza Magalhães", 123456789);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à loja de computadores PCMania!");
        while (true) {
            System.out.println("\nOpções disponíveis:");

            if (cliente.compras[0] == null) {
                System.out.println("1 - Computador Apple");
            }
            if (cliente.compras[1] == null) {
                System.out.println("2 - Computador Samsung");
            }
            if (cliente.compras[2] == null) {
                System.out.println("3 - Computador Dell");
            }

            System.out.println("\n0 - Finalizar compra");
            System.out.print("\nDigite o número do computador desejado: ");

            int escolha = scanner.nextInt();
            if (escolha == 0) {
                break;
            }

            switch (escolha) {
                case 1:
                    if (cliente.compras[0] != null) {
                        System.out.println("Você já escolheu o computador Apple.");
                        break;
                    }
                    cliente.compras[0] = computador1;
                    System.out.println("Você escolheu o computador Apple, Preco: R$ " + computador1.preco);
                    break;
                case 2:
                    if (cliente.compras[1] != null) {
                        System.out.println("Você já escolheu o computador Samsung.");
                        break;
                    }
                    cliente.compras[1] = computador2;
                    System.out.println("Você escolheu o computador Samsung, Preco: R$ " + computador2.preco);
                    break;
                case 3:
                    if (cliente.compras[2] != null) {
                        System.out.println("Você já escolheu o computador Dell.");
                        break;
                    }

                    cliente.compras[2] = computador3;
                    System.out.println("Você escolheu o computador Dell, Preco: R$ " + computador3.preco);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());
        System.out.println("Obrigado por comprar conosco!");
        scanner.close();
    }
}
