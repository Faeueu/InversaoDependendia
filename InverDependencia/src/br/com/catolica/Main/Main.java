package br.com.catolica.Main;

import br.com.catolica.Model.Carro;
import br.com.catolica.Model.Moto;
import br.com.catolica.Model.Motorista;

public class Main {
    public static void main(String[] args) {

        Motorista motorista = new Motorista();
        motorista.setVeiculo(new Carro());
        motorista.dirigir();

        Motorista motorista1 = new Motorista();
        motorista1.setVeiculo(new Moto());
        motorista1.dirigir();
    }
}