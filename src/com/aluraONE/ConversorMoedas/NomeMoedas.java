package com.aluraONE.ConversorMoedas;

public enum NomeMoedas {

    BRLtoUSD(Moedas.BRLtoUSD.valor, "De Reais a Dólares"),
    BRLtoEUR(Moedas.BRLtoEUR.valor, "De Reais a Euros"),
    BRLtoPESOS(Moedas.BRLtoPESOS.valor, "De Reais a Pesos Argentinos"),
    BRLtoYUAN(Moedas.BRLtoYUAN.valor, "De Reais a Yuan"),
    BRLtoBITCOIN(Moedas.BRLtoBITCOIN.valor, "De Reais a Bitcoin"),
    USDtoBRL(Moedas.USDBRL.valor, "De Dólares a Reais"),
    EURtoBRL(Moedas.EURBRL.valor, "De Euros a Reais"),
    PESOStoBRL(Moedas.PESOSBRL.valor, "De Pesos Argentinos a Reais"),
    YUANtoBRL(Moedas.YUANBRL.valor, "De Yuan a Reais"),
    BITCOINtoBRL(Moedas.BITCOINBRL.valor, "De Bitcoin a Reais");

    final String nome;
    final double valor;
    NomeMoedas(Double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }
}

