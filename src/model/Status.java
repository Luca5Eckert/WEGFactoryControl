package model;

import java.util.Random;

public enum Status {
    PRODUZIDO,
    EM_TESTE,
    REPROVADO;

    //Retorna status aleatorio.
    public static Status pegaAleatorio() {
        Random random = new Random();
        return Status.values()[random.nextInt(0,3)];
    }

    public static void main(String[] args) {
        System.out.println(pegaAleatorio());
    }

}
