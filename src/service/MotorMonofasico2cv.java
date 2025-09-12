package service;

import model.estoque.EstoqueMotor;
import model.Status;
import service.codigo.CodigoProvider;

public abstract class MotorMonofasico2cv implements  Runnable{

    private EstoqueMotor estoqueMotor;
    private CodigoProvider codigoProvider;
    private final int quantidade;

    public void motorMonofasico(EstoqueMotor estoqueMotor, CodigoProvider codigoProvider){
        this.estoqueMotor = estoqueMotor;
        this.codigoProvider = codigoProvider;
    }

    public MotorMonofasico2cv(EstoqueMotor estoqueMotor, CodigoProvider codigoProvider, int quantidade) {
        this.estoqueMotor = estoqueMotor;
        this.codigoProvider = codigoProvider;
        this.quantidade = quantidade;
    }

    public void iniciarProducao (){
        for(int i = 0; i <= quantidade; i ++){
            String cod = codigoProvider.gerarCodigo("MM2");
           Status status = Status.pegaAleatorio();
            estoqueMotor.adicionar(cod, status);
        }
    }


    @Override
    public void run() {
        iniciarProducao();
    }


}
