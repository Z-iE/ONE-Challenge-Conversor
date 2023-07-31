package com.aluraONE.ConversorMoedas;
import javax.swing.*;

public class ConversorMoeda {
    static String valor;
    static Object[] lista = {"De Reais a Dólares", "De Reais a Euros", "De Reais a Pesos Argentinos",
            "De Reais a Yuan", "De Reais a Bitcoin", "De Dólares a Reais", "De Euros a Reais",
            "De Pesos Argentinos a Reais", "De Yuan a Reais", "De Bitcoin a Reais"};
    public static String Escolha(){
        try{
            String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda para a qual você deseja converter seu dinheiro ", "Opções", JOptionPane.PLAIN_MESSAGE,
                null, lista, "")).toString();
            return opcao;
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Programa finalizado.", "Finalizando", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);}
        return null;
    }

    public static void resultado(Double m, String n){
        try {
            valor = JOptionPane.showInputDialog(null, "Digite o valor que você deseja converter: ", "Conversor de Moedas", JOptionPane.PLAIN_MESSAGE);
            Double total = (m * Double.parseDouble(valor) * 100) / 100;
            JOptionPane.showMessageDialog(null, "O resultado da conversão " + n.toLowerCase() + " é de: " + total);
        } catch (NumberFormatException | NullPointerException e) {
            if (e instanceof NullPointerException){
                JOptionPane.showMessageDialog(null, "Programa finalizado.", "Finalizando", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            } else {
            JOptionPane.showMessageDialog(null, "Digite um valor válido", "Erro", JOptionPane.ERROR_MESSAGE);
            resultado(m, n);
            }
        }
    }

    public static void Converter(String escolha) {
        for (NomeMoedas moeda : NomeMoedas.values()
        ) {
            if (moeda.nome.equals(escolha)) {
                resultado(moeda.valor, moeda.nome);
            }
        }
    }
}