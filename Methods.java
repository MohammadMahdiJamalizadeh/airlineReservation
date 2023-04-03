package Project3;

import java.io.IOException;
import java.util.Scanner;


public class Methods extends Calers {
    //--------------------------input--------------------//
    Scanner scanner = new Scanner(System.in);

    //    Password_Username password_username = new Password_Username();
    //----------------------METHODS-----------------------//
    public void print_menu_sing_in_sing_up() {
        System.out.println(ANSI_RED + "1-Sing in" + ANSI_RESET + '\n' + ANSI_BLUE + "2-Sing up" + ANSI_RESET);
    }

    public void cls() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {
        }
    }

    public void print_menu_admin() {
        System.out.println(ANSI_WHITE_BOLD + "Admin menu option" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "1- Add" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "2- Update" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "3- Remove" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "4- Flight schedules" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "0- Sing out" + ANSI_RESET);

    }

    public void print_menu_passenger() {
        System.out.println(ANSI_WHITE_BOLD + "Passenger menu option" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "1-Change password" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "2- Search flight tickets" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "3- Booking ticket" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "4- Ticket cancellation" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "5- Booked tickets" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "6- Add charge" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "0- Sing out" + ANSI_RESET);
    }

    public void Get_input_for_the_user_menu() {
        int num;
        num = (scanner.nextInt());
        switch (num) {
            case '1': {

            }
            case '2': {

            }
            case '3': {

            }
            case '4': {

            }
            case '5': {

            }
            case '6': {

            }
            case '0': {

            }
            default: {
                break;
            }
        }
    }
}
