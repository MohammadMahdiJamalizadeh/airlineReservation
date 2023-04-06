package Project3;

import java.io.IOException;
import java.util.Scanner;


public class Methods extends Colors {
    //--------------------------input--------------------//
    static Scanner scanner = new Scanner(System.in);

    //    Password_Username password_username = new Password_Username();
    //----------------------METHODS-----------------------//
    public static void print_menu_sing_in_sing_up() {//تابع چاپ منوی اول کار
        System.out.println(ANSI_RED + "1-Sing in" + ANSI_RESET + '\n' + ANSI_BLUE + "2-Sing up" + ANSI_RESET);
    }

    public static void cls() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {
        }
    }

    public static void get_input_username_password_sing_up() {//تابع ورودی گرفتن بای منوی sing_up
        String username, password;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(ANSI_WHITE_BOLD + "Please enter your username and password :" + ANSI_RESET);
            System.out.print(ANSI_WHITE_BOLD + "USERNAME : " + ANSI_RESET);
            username = scanner.next();
            Small_User.setUserName(username);
            Users.setUserss(username);
            System.out.print(ANSI_WHITE_BOLD + "PASSWORD : " + ANSI_RESET);
            password = scanner.next();
            Small_User.setUserPassword(password);
            Users.setPassword(password);
            cls();
            System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD + "          Account successfully created :)" + ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
            Methods.wait(1);
            System.out.println(ANSI_RED + "Do you want to continue ?" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "1-YES                  2-NO" + ANSI_RESET);
            int x = scanner.nextInt();
            if (x == 2) {
                cls();
                break;
            }
        }
    }
    public static void Description_sing_up() {//تابع توضیحات منوی sing_up
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(ANSI_YELLOW + "Dear user, please note that your username must contain English letters and" + ANSI_RESET + '\n' +
                "            " + ANSI_YELLOW + "your password must contain at least 6 numbers" + ANSI_RESET);
        System.out.println("--------------------------------------------------------------------------");
    }

    public static int get_input_username_password_sing_in() {//تابع ورودی گرفتن برای منوی sing_in
        String username, password;
        cls();
        System.out.println(ANSI_WHITE_BOLD + "Please enter your username and password :" + ANSI_RESET);
        System.out.print(ANSI_BLACK_BOLD + "USERNAME : " + ANSI_RESET);
        username = scanner.next();
        System.out.print(ANSI_BLACK_BOLD + "PASSWORD : " + ANSI_RESET);
        password = scanner.next();
        int x = check(username, password);
        return x;
    }

    public static int check(String username2, String password2) {//تابع چک کردن برای تطابق username  و password منو های sing_up و sing_in
        cls();
        String username, password;
        username = username2;
        password = password2;
        for (int i = 0; i < Users.getI(); i++) {
            if ((Users.password[i].equals(password)) && (Users.users[i].equals(username))) {
                cls();
                System.out.println(ANSI_CYAN+"              WELCOME "+ANSI_RESET + ANSI_CYAN+username+ANSI_RESET);
                return 1;
            } else if ((password.equals("Admin")) && (username.equals("Admin"))) {
                System.out.println(ANSI_CYAN+"WELCOME Admin"+ANSI_RESET);
                return 2;
            }
            else {
                System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
                System.out.println(ANSI_BLACK_BOLD+"          The desired user was not found!"+ANSI_RESET);
                System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
            }
        }
        return 3;
    }
    public static void wait(int sec) {
        try {
            Thread.currentThread().sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void Passenger_menu_option(){//تابع چاپ منوی مسافر
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println("            PASSENGER MENU OPTION");
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_PURPLE+"1- Change password"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"2- Search flight tickets"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"3- Booking thicket"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"4- Ticket cancellation"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"5- Booked thickets"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"6- Add charge"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"7- Info"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"0- sing out"+ANSI_RESET);
    }
    public static void Purchased_tickets(){//تابع چاپ بلیط های خریداری شده
        Methods.wait(1);
        if (Tickets.sum == 0){
            System.out.println(ANSI_GREEN+"* Your shopping list is empty *"+ANSI_RESET);
            Methods.wait(2);
            return;
        }
        System.out.println(ANSI_BLACK_BOLD+".........................................................."+ANSI_RESET);
        for (int i = 0; i < Users.getK(); i++) {
            System.out.print(Colors.colors[i]+(i + 1)+"- "+Users.Tickets[i]+ANSI_RESET+'\t');
            System.out.print(Colors.colors[i]+Users.Tickets[i]+ANSI_RESET+'\t');
            System.out.print(Colors.colors[i]+Users.Tickets[i]+ANSI_RESET+'\t');
            System.out.print(Colors.colors[i]+Users.Tickets[i]+ANSI_RESET+'\t');
            System.out.print(Colors.colors[i]+Users.Tickets[i]+ANSI_RESET+'\t');
            System.out.println(Colors.colors[i]+Users.Tickets[i]+ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD+".........................................................."+ANSI_RESET);
        }
        Methods.wait(2);
    }
}


