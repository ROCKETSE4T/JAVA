package modules.module1.poo.essentials.encapsulamento;

import java.util.UUID;

public class ContaBancaria {

    private double saldo;
    private String conta;
    private String nome;

    public ContaBancaria(String nome) {
        this.saldo = 0;
        this.conta = UUID.randomUUID().toString();
        this.nome = nome;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {

        if (this.saldo - valor < 0){
            System.out.println("Saldo insuficiente");
        }

        this.saldo -= valor;

    }

    public String getNome() {
        return nome;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
