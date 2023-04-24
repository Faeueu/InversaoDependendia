package br.com.catolica.Model;

import br.com.catolica.Interface.Veiculo;

public class Carro implements Veiculo {
    @Override
    public void dirigingo() {
        System.out.println("Dirigindo o carro");
    }
}
