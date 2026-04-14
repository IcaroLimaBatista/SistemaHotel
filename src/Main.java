import Menus.HotelServices;
import Menus.Input;

import java.awt.*;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Input input = new Input();
        int option;
        Boolean end = false;
        HotelServices hotel = new HotelServices();;

        while (!end) {
            input.menu();
            option = input.option;

            switch (option) {
                case 1:
                    hotel.cadastroReserva();
                    break;
                case 2:
                    hotel.listarReservas();
                    break;
                case 3:
                    hotel.buscarReserva();
                    break;
                case 4:
                    hotel.orderReservasDias();
                    hotel.listarReservas();
                    break;
                case 5:
                    end = true;
            }

        }

    }
}
