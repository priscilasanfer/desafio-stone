package br.com.priscila;

import br.com.priscila.model.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Desafio {
    public static void main(String[] args) {
        List<Item> itens = new ArrayList<>();
        List<String> emails = new ArrayList<>();

        itens.add(new Item("caneta", 1, 100));
        itens.add(new Item("apontador", 3, 4033));

        emails.add("Priscila");
        emails.add("Malu");
        emails.add("Meg");
        emails.add("Rafael");

        try {
            Map<String, Integer> resultado = calculaValorPorEmail(itens, emails);
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Encerrando o programa devido a erro aritmético");
            System.exit(1);
        }
    }

    private static Map<String, Integer> calculaValorPorEmail(List<Item> itens, List<String> emails) {
        Map<String, Integer> resultado = new HashMap<>();

        int quantidadeDeEmails = emails.size();
        int valorTotalDaLista = valorTotalDaCompra(itens);
        int valorPorPessoa = valorIndividual(quantidadeDeEmails, valorTotalDaLista);
        int diferencaEmCentavos = valorTotalDaLista - (valorPorPessoa * quantidadeDeEmails);

        for (int i = 0; i < quantidadeDeEmails; i++) {
            resultado.put(emails.get(i), valorPorPessoa);
        }

        int contadorDeEmails = 0;
        while (diferencaEmCentavos > 0) {
            if (contadorDeEmails >= quantidadeDeEmails) {
                contadorDeEmails = 0;
            }
            resultado.put(emails.get(contadorDeEmails), valorPorPessoa + 1);
            diferencaEmCentavos--;
            contadorDeEmails++;
        }
        return resultado;
    }

    private static int valorIndividual(int quantidadeDeEmails, int valorTotolDaComrpra) {
        int valorIndividual = 0;
        try {
            valorIndividual = valorTotolDaComrpra / quantidadeDeEmails;
        } catch (ArithmeticException e) {
            System.out.println("Erro ao tentar dividir: " + e.getMessage());
            throw e;
        }
        return valorIndividual;
    }

    private static int valorTotalDaCompra(List<Item> itens) {
        int total = 0;
        for (Item item : itens) {
            int quantidade = item.getQuantidade();
            int valor = item.getValor();
            total += quantidade * valor;
        }
        return total;
    }
}
