import Menus.HotelServices;
import Menus.Input;

import java.awt.*;

public class Main {
    static void main(String[] args) {
        Input input = new Input();
        int cont = 0;
        int option;
        HotelServices hotel = new HotelServices(cont);

        while (true) {
            input.menu();
            option = input.option;
            switch (option) {
                case 1:
                    hotel.cadastroReserva();
                    break;
                case 2:
                    System.out.println("Digite o nome do cliente: ");
                    break;
            }

            break;
        }

    }
}
