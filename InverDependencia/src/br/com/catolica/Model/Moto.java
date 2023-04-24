package br.com.catolica.Model;

import br.com.catolica.Interface.Veiculo;

public class Moto implements Veiculo {
    @Override
    public void dirigingo() {
        System.out.println("Dirigindo a moto");
    }
}
