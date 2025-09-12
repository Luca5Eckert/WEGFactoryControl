package model;

import service.CodigoProvider;


//Exemplo para iniciar interfaces
public class Producao {

    private final EstoqueMotor estoqueMotor;
    private final CodigoProvider codigoProvider;

    public Producao(EstoqueMotor estoqueMotor, CodigoProvider codigoProvider) {
        this.estoqueMotor = estoqueMotor;
        this.codigoProvider = codigoProvider;
    }

    public void rodarProducao(int quantidade){

    }

}
