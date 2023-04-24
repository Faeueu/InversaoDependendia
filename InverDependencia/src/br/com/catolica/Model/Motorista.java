package br.com.catolica.Model;

import br.com.catolica.Interface.Veiculo;

public class Motorista {

    public Veiculo veiculo;

    public Motorista(){}

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void dirigir(){
        this.veiculo.dirigingo();
    }
}
