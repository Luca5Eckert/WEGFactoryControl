package view;

import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);

    public int quantidadeMT3(){
        System.out.println("----------------------------------");
        System.out.print("Digite a quantidade que deseja produzir do Motor Trifásico 3cv: ");

        return scan.nextInt();
    }

    public int quantidadeMT5(){
        System.out.println("----------------------------------");
        System.out.print("Digite a quantidade que deseja produzir do Motor Trifásico 5cv: ");

        return scan.nextInt();
    }

    public int quantidadeMM2(){
        System.out.println("----------------------------------");
        System.out.print("Digite a quantidade que deseja produzir do Motor Monofásico 2cv: ");

        return scan.nextInt();
    }
}
