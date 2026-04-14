package Menus;
import java.util.Scanner;

public class HotelServices {
    String nomeCliente;
    String tipoQuarto;
    Integer numeroDias;
    Double valorDiaria;
    Double valorTotal;
    Integer contC = -1;
    public String[][] listarReservas= new String[4][10];


    public void cadastroReserva(){
        if (contC < listarReservas[0].length - 1){
            Scanner sc = new Scanner(System.in);
            contC++;
            System.out.println("Digite o nome do cliente: ");
            nomeCliente = sc.nextLine();
            listarReservas[0][contC] = nomeCliente;

            System.out.println("Digite o tipo de quarto: ");
            while (true) {
                System.out.println("Standard \n Premium \n The Lux");
                String input = sc.nextLine();
                input = input.toUpperCase();
                if (input.equals("STANDARD") || input.equals("PREMIUM") || input.equals("THE LUX")) {
                    tipoQuarto = input;
                    listarReservas[1][contC] = tipoQuarto;
                    break;
                }else {
                    System.out.println("Quarto inválido!");
                }
            }

            System.out.println("Digite o número de dias: ");
            while (true) {
                if (!sc.hasNextInt()) {
                    System.out.println("Número inválido!");
                    sc.nextLine();
                }else{
                    numeroDias = sc.nextInt();
                    listarReservas[2][contC] = numeroDias.toString();
                    break;
                }
            }

            System.out.println("Digite o valor da diária: ");
            while (true) {
                if (!sc.hasNextDouble()) {
                    System.out.println("Valor inválido!");
                    sc.nextLine();
                }else {
                    valorDiaria = sc.nextDouble();
                    valorTotal = valorDiaria * numeroDias;
                    listarReservas[3][contC] = valorTotal.toString();
                    break;
                }
            }
        }else {
            System.out.println("Limite de reservas excedidos.");
        }


    }

    public void listarReservas(){
        for (int i = 0; i <= contC; i++) {
            System.out.println("Reserva " + (i + 1));
            System.out.println("Nome: " + listarReservas[0][i]);
            System.out.println("Quarto: " + listarReservas[1][i]);
            System.out.println("Dias: " + listarReservas[2][i]);
            System.out.println("Valor: " + listarReservas[3][i]);
            System.out.println("----------------------");
        }
    }

    public void buscarReserva(){
        Scanner sc = new Scanner(System.in);
        String nomeReserva;
        boolean encontrou = false;

        System.out.print("Digite o nome do cliente: ");
        nomeReserva = sc.nextLine();

        if(nomeReserva == null || nomeReserva.isEmpty()){
            System.out.println("Nome incorreto!");
            return;
        }

        nomeReserva = nomeReserva.toLowerCase();

        for (int i = 0; i <= contC; i++) {
            String nome = listarReservas[0][i];
            if (nome != null && nome.toLowerCase().contains(nomeReserva)) {
                System.out.println("Reserva encontrada:");
                System.out.println("Nome: " + listarReservas[0][i]);
                System.out.println("Quarto: " + listarReservas[1][i]);
                System.out.println("Dias: " + listarReservas[2][i]);
                System.out.println("Valor: " + listarReservas[3][i]);
                System.out.println("----------------------");

                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma reserva encontrada.");
        }

    }

    public void orderReservasDias(){

        for (int i = 0; i <= contC; i++) {
            for (int j = 0; j < contC; j++) {

                if (listarReservas[2][j] == null || listarReservas[2][j + 1] == null) {
                    continue;
                }

                int dias1 = Integer.parseInt(listarReservas[2][j]);
                int dias2 = Integer.parseInt(listarReservas[2][j + 1]);

                if (dias1 < dias2) {
                    for (int k = 0; k < listarReservas.length; k++) {
                        String temp = listarReservas[k][j];
                        listarReservas[k][j] = listarReservas[k][j + 1];
                        listarReservas[k][j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Ordenado!");
    }
}
