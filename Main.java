package Project3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //--------------------------input--------------------//
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();
        Password_Username password_username = new Password_Username();
        //--------------Variable----------------//
        int num;
        while (true){
            methods.print_menu_sing_in_sing_up();
            num = scanner.nextInt();
            methods.cls();
            if (num == 2){
                password_username.username_password_sing_up();
                password_username.get_input_username_password_sing_up();
                methods.cls();
            }
            else if (num==1){
                password_username.get_input_username_password_sing_in();
                int x = password_username.check();
                if (x == 1){
                    break;
                }
            }

        }
    }
}
