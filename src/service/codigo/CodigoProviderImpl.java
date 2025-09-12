package service.codigo;

import java.util.concurrent.atomic.AtomicInteger;

public class CodigoProviderImpl implements CodigoProvider {

    private final static AtomicInteger CONTADOR = new AtomicInteger(0);


    @Override
    public String gerarCodigo(String sigla) {
        String codigo = sigla + CONTADOR;

        CONTADOR.addAndGet(1);

        return codigo;
    }

}
