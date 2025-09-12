package model.estoque;

import model.Status;

public interface EstoqueMotor {

    void adicionar(String codigo, Status status);

}
