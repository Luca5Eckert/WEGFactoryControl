package service;

import model.Status;
import model.estoque.EstoqueMotor;
import service.codigo.CodigoProvider;
import view.PrintUtil;

import java.time.LocalDateTime;

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
        PrintUtil.imprimaTexto("Inicia a linha de produção do motor Trifasico 5cv ");

        for (int i = 0; i < quantidade; i++){
            String codigo = codigoProvider.gerarCodigo("MT5");
            Status status = Status.pegaAleatorio();
            estoqueMotor.adicionar(codigo, status);
        }

        PrintUtil.imprimaTexto("Encerra a linha de produção do motor Trifasico 5cv");

    }
}
