package view;

import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);

    public int quantidadeMT3(){
        System.out.printf("----------------------------------");
        System.out.printf("Digite a quantidade que deseja produzir do Motor Trifásico 3cv: ");
        int quntidade = scan.nextInt();

        return quntidade;
    }

    public int quantidadeMT5(){
        System.out.printf("----------------------------------");
        System.out.printf("Digite a quantidade que deseja produzir do Motor Trifásico 5cv: ");
        int quntidade = scan.nextInt();

        return quntidade;
    }

    public int quantidadeMM2(){
        System.out.printf("----------------------------------");
        System.out.printf("Digite a quantidade que deseja produzir do Motor Monofásico 2cv: ");
        int quntidade = scan.nextInt();

        return quntidade;
    }
}
