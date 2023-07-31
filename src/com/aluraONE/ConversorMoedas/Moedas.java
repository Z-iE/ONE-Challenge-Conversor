package com.aluraONE.ConversorMoedas;
public enum Moedas {

    USDBRL(4.73),
    EURBRL(5.22),
    PESOSBRL(0.017),
    YUANBRL(0.66),
    BITCOINBRL(139016.58),
    BRLtoUSD(0.21),
    BRLtoEUR(0.19),
    BRLtoPESOS(57.73),
    BRLtoYUAN(1.51),
    BRLtoBITCOIN(0.0000072);

    final double valor;
    Moedas(Double valor) {
        this.valor = valor;
    }
}