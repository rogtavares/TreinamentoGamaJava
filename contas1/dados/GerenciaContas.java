package dados;

import java.util.ArrayList;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaEspecial;
import modelo.ContaPoupanca;

public class GerenciaContas {
    private ArrayList<Conta> contas;

    public GerenciaContas() {
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        // ContaCorrente cc = null;
        // cc = new ContaCorrente(numeroConta);
        // contas.add(cc);
        contas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        // ce = new ContaEspecial(numeroConta, limite);
        // contas.add(ce);
        contas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        // cp = new ContaPoupanca(numeroConta);
        // contas.add(cp);
        contas.add(new ContaPoupanca(numeroConta));

    }

    public String getSaldo(int numeroConta) {
        for (Conta conta : contas) { // Para cada "conta" que está na estrutura "contas"
            if (conta.getNumero() == numeroConta) {
                System.out.println(conta);
                return conta.toString();
            }
        }
        return "Conta não encontrada.";
    }

    public Boolean deposito(int numeroConta, double valor) {
        for (Conta  conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta.deposito(valor);
            }
        }
        return false; // conta não encontrada
    }

    public Boolean saque(int numeroConta, double valor) {
        for (Conta  conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta.saque(valor);
            }
        }
        return false; // conta não encontrada
    }

}