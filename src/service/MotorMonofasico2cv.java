package service;

import model.estoque.EstoqueMotor;
import model.Status;
import service.codigo.CodigoProvider;
import view.PrintUtil;

import java.time.LocalDateTime;

public class MotorMonofasico2cv implements  Runnable{

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
        PrintUtil.imprimaTexto("Inicia a linha de produção do motor Monofasico 2cv ");

        for(int i = 0; i < quantidade; i ++){
            String cod = codigoProvider.gerarCodigo("MM2");
           Status status = Status.pegaAleatorio();
            estoqueMotor.adicionar(cod, status);
        }
        PrintUtil.imprimaTexto("Encerra a linha de produção do motor Monofasico 2cv ");
    }


    @Override
    public void run() {
        iniciarProducao();
    }


}
