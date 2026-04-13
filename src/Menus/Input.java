package Menus;

import java.util.Scanner;

public class Input {
    // Variable
    Scanner sc = new Scanner(System.in);
    public int option;

    public void menu() {
        System.out.print("Olá, tudo bem? Bem-vindo ao nosso hotel. O que deseja fazer?");
        System.out.println("\n 1. Nova Reserva \n 2. Listar reservas\n 3. Buscar reserva por nome do hóspede\n " +
                "4. Ordenar reservas por número de dias (decrescente)\n 5. Sair");

        //Choose User
        while(true){
            if(!sc.hasNextInt()){
                System.out.println("Opção inválida!");
                sc.nextLine();
            }else{
                int input = sc.nextInt();
                if(input < 1|| input > 5){
                    System.out.println("Opção inválida!");
                }else {
                    option = input;
                    break;
                }
            }
        }
    }






}
