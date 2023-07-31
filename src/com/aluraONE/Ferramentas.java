package com.aluraONE;

import javax.swing.*;

public class Ferramentas {
        public static void Inicializacao(){
            JOptionPane.showMessageDialog(null, "Iniciando a conversão!",
            "Conversor", JOptionPane.INFORMATION_MESSAGE);
        }

        public static String tipoConversao(){
            try{
                String opcao = (JOptionPane.showInputDialog(null, "Escolha qual conversão deseja fazer: ",
                "Opções", JOptionPane.PLAIN_MESSAGE,
                null, new Object[]{"Conversão de Moedas", "Conversão de Temperatura"},
                "")).toString();
                return opcao;
            } catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "Programa finalizado.", "Finalizando", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }return null;
        }

    public static int iniciarConversao(){
        int iniciar = JOptionPane.showOptionDialog(null, "Deseja continuar a conversão?",
                "Continuar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Sim", "Não"}, 0);
        return iniciar;
    }
}
