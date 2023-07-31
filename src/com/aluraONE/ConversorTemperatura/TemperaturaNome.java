package com.aluraONE.ConversorTemperatura;
import javax.swing.*;
public class TemperaturaNome {
    public static void CelsiusFahrenheit(){
        double celsius = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a temperatura em Celsius: ", "Celsius para Fahrenheit", JOptionPane.PLAIN_MESSAGE));
        double fahrenheit = (celsius * 9/5) + 32;
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + fahrenheit + "°F", "Celsius para Fahrenheit", JOptionPane.PLAIN_MESSAGE);
    }
    public static void FahrenheitCelsius(){
        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a temperatura em Fahrenheit: ", "Fahrenheit para Celsius", JOptionPane.PLAIN_MESSAGE));
        double celsius = (fahrenheit - 32) * 5/9;
        JOptionPane.showMessageDialog(null, "A temperatura em Celsius é: " + celsius + "°C", "Fahrenheit para Celsius", JOptionPane.PLAIN_MESSAGE);
    }
    public static void CelsiusKelvin(){
        double celsius = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a temperatura em Celsius: ", "Celsius para Kelvin", JOptionPane.PLAIN_MESSAGE));
        double kelvin = celsius + 273.15;
        JOptionPane.showMessageDialog(null, "A temperatura em Kelvin é: " + kelvin + "K", "Celsius para Kelvin", JOptionPane.PLAIN_MESSAGE);
    }
    public static void KelvinCelsius(){
        double kelvin = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a temperatura em Kelvin: ", "Kelvin para Celsius", JOptionPane.PLAIN_MESSAGE));
        double celsius = kelvin - 273.15;
        JOptionPane.showMessageDialog(null, "A temperatura em Celsius é: " + celsius + "°C", "Kelvin para Celsius", JOptionPane.PLAIN_MESSAGE);
    }
    public static void FahrenheitKelvin(){
        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a temperatura em Fahrenheit: ", "Fahrenheit para Kelvin", JOptionPane.PLAIN_MESSAGE));
        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        JOptionPane.showMessageDialog(null, "A temperatura em Kelvin é: " + kelvin + "K", "Fahrenheit para Kelvin", JOptionPane.PLAIN_MESSAGE);
    }
    public static void KelvinFahrenheit(){
        double kelvin = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a temperatura em Kelvin: ", "Kelvin para Fahrenheit", JOptionPane.PLAIN_MESSAGE));
        double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + fahrenheit + "°F", "Kelvin para Fahrenheit", JOptionPane.PLAIN_MESSAGE);
    }

}
