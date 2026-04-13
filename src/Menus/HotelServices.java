package Menus;
import java.util.Scanner;

public class HotelServices {
    String nomeCliente;
    String tipoQuarto;
    Integer numeroDias;
    Double valorDiaria;
    Integer contC;
    String[][] listarReservas= new String[3][9];

    //Constructor void
    public HotelServices(Integer cont) {
        this.contC = cont;
    }

    public void cadastroReserva(){
        Scanner sc = new Scanner(System.in);
        contC++;

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.nextLine();
        listarReservas[contC][0] = nomeCliente;

        System.out.println("Digite o tipo de quarto: ");
        while (true) {
            System.out.println("Standard \n Premium \n The Lux");
            String input = sc.nextLine();
            input = input.toUpperCase();
            if (input.equals("STANDARD") || input.equals("PREMIUM") || input.equals("THE LUX")) {
                tipoQuarto = input;
                listarReservas[contC][1] = tipoQuarto;
                break;
            }else {
                System.out.println("Quarto inválido!");
            }
        }
        sc.nextLine();

        System.out.println("Digite o número de dias: ");
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Número inválido!");
                sc.nextLine();
            }else{
                numeroDias = sc.nextInt();
                listarReservas[contC][2] = numeroDias.toString() + " dias";
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
                listarReservas[contC][3] = valorDiaria.toString();
            }
        }

    }

}
