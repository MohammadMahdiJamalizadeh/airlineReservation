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
        //--------------------------------------//
        while (true){
            methods.print_menu_sing_in_sing_up();// تابع چاپ منوی اول کار
            num = scanner.nextInt();
            methods.cls();
            if (num == 2){
                password_username.username_password_sing_up();// تابع چاپ توضیحات منویsing_up
                password_username.get_input_username_password_sing_up();// تابع ورودی گرفتن username  و passwordبرای منوی sing_up
                methods.cls();
            }
            else if (num==1){
                password_username.get_input_username_password_sing_in();//تابع ورودی گرفتن username و password برای منوی sing_in
                int x = password_username.check();// تابع چک کردن تظابق داشتن ورودی sing_in و sing_up
                if (x == 1){
                    break;
                }
                else if(x == 2){
                    methods.print_menu_admin();//تابع چاپ توضیحات ادمین

                }
                else if(x == 3){
                    methods.print_menu_passenger();//تابع چاپ توضیحات کاربر

                }
            }

        }
    }
}
