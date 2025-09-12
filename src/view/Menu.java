package view;

import model.Status;

import java.util.Map;
import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);

    public void telaInicial(){
        System.out.println("==================================================");
        System.out.println("           INICIADOR DE LINHA DE PRODUÇÃO         ");
        System.out.println("==================================================");
        System.out.println(" Insira a quantidade por linha de produção: ");
    }


    public int quantidadeMT3(){
        System.out.println("--------------------------------------------------");
        System.out.print("Digite a quantidade que deseja produzir do Motor Trifásico 3cv: ");

        return scan.nextInt();
    }

    public int quantidadeMT5(){
        System.out.println("--------------------------------------------------");
        System.out.print("Digite a quantidade que deseja produzir do Motor Trifásico 5cv: ");

        return scan.nextInt();
    }

    public int quantidadeMM2(){
        System.out.println("--------------------------------------------------");
        System.out.print("Digite a quantidade que deseja produzir do Motor Monofásico 2cv: ");

        return scan.nextInt();
    }

    public void listarMotores (Map<String, Status> motores){
        System.out.println("==================================================");
        System.out.println("               PRODUÇÃO DE MOTORES");
        System.out.println("==================================================");

        for (Map.Entry<String, Status> entrada : motores.entrySet()){
            System.out.println("Código: " + entrada.getKey() + " | Status: " + entrada.getValue());
        }

    }


}
