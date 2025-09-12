package model;

import java.util.Random;

public enum Status {
    PRODUZIDO,
    EM_TESTE,
    REPROVADO;

    //Retorna status aleatorio.
    public static Status pegaAleatorio() {
        return PRODUZIDO;
    }

}
