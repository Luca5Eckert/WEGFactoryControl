package service;

import model.Status;
import model.estoque.EstoqueMotor;
import service.codigo.CodigoProvider;

public class MotorTrifasico5cv implements Runnable{

    private final EstoqueMotor estoqueMotor;
    private final CodigoProvider codigoProvider;
    private final int quantidade;

    public MotorTrifasico5cv(EstoqueMotor estoqueMotor, CodigoProvider codigoProvider, int quantidade) {
        this.estoqueMotor = estoqueMotor;
        this.codigoProvider = codigoProvider;
        this.quantidade = quantidade;
    }

    @Override
    public void run() {
        for (int i = 0; i < quantidade; i++){
            String codigo = codigoProvider.gerarCodigo("MT5");
            Status status = Status.pegaAleatorio();
            estoqueMotor.adicionar(codigo, status);
        }
    }
}
