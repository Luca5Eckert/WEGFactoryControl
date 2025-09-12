package service;

import model.estoque.EstoqueMotor;
import model.Status;

import service.codigo.CodigoProvider;
import view.PrintUtil;

import java.time.LocalDateTime;

public class MotorTrifasico3cv implements Runnable {

    private final EstoqueMotor estoqueMotor;
    private final CodigoProvider codigoProvider;
    private final int quantidade;

    public MotorTrifasico3cv(EstoqueMotor estoqueMotor, CodigoProvider codigoProvider, int quantidade) {
        this.estoqueMotor = estoqueMotor;
        this.codigoProvider = codigoProvider;
        this.quantidade = quantidade;
    }

    public void iniciarProducao(){
        PrintUtil.imprimaTexto("Inicia a linha de produção do motor Trifasico 3cv ");

        for (int i = 0 ; i < quantidade; i++){
            String cod = codigoProvider.gerarCodigo("MT3");
            Status status = Status.pegaAleatorio();
            estoqueMotor.adicionar(cod, status);
        }

        PrintUtil.imprimaTexto("Encerra a linha de produção do motor Trifasico 3cv");

    }

    @Override
    public void run() {
        iniciarProducao();
    }


}
