package com.aluraONE;
import com.aluraONE.ConversorMoedas.ConversorMoeda;
import com.aluraONE.ConversorTemperatura.ConversorTemperatura;
import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        Ferramentas.Inicializacao();
        if (Ferramentas.tipoConversao().equalsIgnoreCase("Conversão de Moedas")){
            do{
                ConversorMoeda.Converter(ConversorMoeda.Escolha());
            } while (Ferramentas.iniciarConversao() != 1);
            JOptionPane.showMessageDialog(null, "Obrigado por usar o conversor de moedas!",
                    "Finalizando", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }else{
            do{
                ConversorTemperatura.iniciar();
            } while (Ferramentas.iniciarConversao() != 1);
                JOptionPane.showMessageDialog(null,
                "Obrigado por usar o conversor de temperatura!", "Finalizando",
                JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
        }
    }
}
