package Project3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //--------------------------input--------------------//
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();
        //--------------Variable----------------//
        int num;
        //--------------------------------------//
        while (true) {
            methods.print_menu_sing_in_sing_up();// تابع چاپ منوی اول کار
            num = scanner.nextInt();
            methods.cls();
            if (num == 2) {
                methods.cls();
                methods.Description_sing_up();// تابع چاپ توضیحات منوی sing_up
                methods.get_input_username_password_sing_up();// تابع ورودی گرفتن username  و password برای منوی sing_up
                methods.cls();
            } else if (num == 1) {
                methods.cls();
            }
//                if (x == 1){
//                    break;
//                }
//                else if(x == 2){
//                    methods.print_menu_admin();//تابع چاپ توضیحات ادمین
//
//                }
//                else if(x == 3){
//                    methods.print_menu_passenger();//تابع چاپ توضیحات کاربر
//                    methods.Get_input_for_the_user_menu();
//
//                }
//            }
        }
    }
}



