package model.estoque;

import model.Status;

import java.util.HashMap;

public interface EstoqueMotor {

    void adicionar(String codigo, Status status);

    HashMap<String, Status> retornarMotores();

}
