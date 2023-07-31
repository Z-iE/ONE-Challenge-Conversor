package com.aluraONE.ConversorTemperatura;

import javax.swing.*;

public class ConversorTemperatura {
    public static String escolha;
    public static void iniciar(){
        Object[] lista = {"De Celsius para Fahrenheit", "De Fahrenheit para Celsius", "De Celsius para Kelvin",
            "De Kelvin para Celsius", "De Fahrenheit para Kelvin", "De Kelvin para Fahrenheit"};
            escolha = (JOptionPane.showInputDialog(null,
            "Escolha a temperatura para a qual você deseja converter: ", "Opções", JOptionPane.PLAIN_MESSAGE,
            null, lista, "0")).toString();
            iniciarConversao();
    }
    public static void iniciarConversao(){
        try{
            switch (escolha){
                case "De Celsius para Fahrenheit": {
                    TemperaturaNome.CelsiusFahrenheit();
                    break;}
                case "De Fahrenheit para Celsius": {
                    TemperaturaNome.FahrenheitCelsius();
                    break;}
                case "De Celsius para Kelvin": {
                    TemperaturaNome.CelsiusKelvin();
                    break;}
                case "De Kelvin para Celsius": {
                    TemperaturaNome.KelvinCelsius();
                    break;}
                case "De Fahrenheit para Kelvin": {
                    TemperaturaNome.FahrenheitKelvin();
                    break;}
                case "De Kelvin para Fahrenheit": {
                    TemperaturaNome.KelvinFahrenheit();
                    break;
                }
            }
        }catch(NumberFormatException | NullPointerException e){
            if (e instanceof NumberFormatException){
                JOptionPane.showMessageDialog(null, "Entrada Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                iniciarConversao();
            }
            else if (e instanceof NullPointerException)
                JOptionPane.showMessageDialog(null, "Programa Finalizado.", "Finalizando", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
        }
    }
}



