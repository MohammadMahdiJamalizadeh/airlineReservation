package Project3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //---------------------input--------------------//
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();
        //--------------Variable----------------//
        int num;
        //--------------------------------------//
        while (true) {
            methods.print_menu_sing_in_sing_up();// تابع چاپ منوی اول کار
            Methods.wait(1);
            num = scanner.nextInt();
            methods.cls();
            if (num == 2) {
                methods.cls();
                methods.Description_sing_up();// تابع چاپ توضیحات منوی sing_up
                Methods.wait(1);
                methods.get_input_username_password_sing_up();// تابع ورودی گرفتن username  و password برای منوی sing_up
            } else if (num == 1) {
                methods.cls();
                int x = methods.get_input_username_password_sing_in();//تابع ورودی گرفتن برای منوی sing_in
                Methods.wait(1);
                if (x == 1){
                    while (true) {
                        Methods.cls();
                        methods.Passenger_menu_option();//تابع چاپ منو برای مسافر
                        Methods.wait(1);
                        int n = scanner.nextInt();
                        if (n == 1){
                                Small_User.changePassword();//تابع برای عوض کردن پسورد
                            }
                        else if (n == 3) {
                                Tickets.Buy_tickets();//تابع برای خریدن بلیط
                            }
                        else if (n == 6){
                                Tickets.Add_charge();//تابع برای افزایش شارژ
                            }
                        else if (n == 7){
                                Small_User.info();//تابع برای مشاهده مشخصات و اطلاعات کاربر
                            }
                        }
                    }
                else if(x == 2){

                }
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



