package model.estoque;

import model.Status;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class EstoqueMotorImpl implements EstoqueMotor {

    private final static ConcurrentMap<String, Status> estoque = new ConcurrentHashMap<>();

    @Override
    public void adicionar(String codigo, Status status) {
        estoque.put(codigo, status);
    }

    @Override
    public HashMap<String, Status> retornarMotores() {
        return new HashMap<>(estoque);
    }
}
