import model.estoque.EstoqueMotor;
import model.estoque.EstoqueMotorImpl;
import service.MotorMonofasico2cv;
import service.MotorTrifasico3cv;
import service.MotorTrifasico5cv;
import service.codigo.CodigoProvider;
import service.codigo.CodigoProviderImpl;
import view.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.telaInicial();

        int mm2 = menu.quantidadeMM2();
        int mt3 = menu.quantidadeMT3();
        int mt5 = menu.quantidadeMT5();

        CodigoProvider codigoProvider = new CodigoProviderImpl();
        EstoqueMotor estoqueMotor = new EstoqueMotorImpl();

        MotorTrifasico5cv motorTrifasico5cv = new MotorTrifasico5cv(estoqueMotor, codigoProvider, mt5);
        MotorTrifasico3cv motorTrifasico3cv = new MotorTrifasico3cv(estoqueMotor, codigoProvider, mt3);
        MotorMonofasico2cv motorMonofasico2cv = new MotorMonofasico2cv(estoqueMotor, codigoProvider, mm2);

        try(ExecutorService executorService = new ScheduledThreadPoolExecutor(3)){

            executorService.execute(motorTrifasico5cv);
            executorService.execute(motorTrifasico3cv);
            executorService.execute(motorMonofasico2cv);

        } catch (Exception e) {
            System.out.println("Ocorreu um errinho");
        }

        menu.listarMotores(estoqueMotor.retornarMotores());

    }
}