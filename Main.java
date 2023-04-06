package Project3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //---------------------input--------------------//
        Scanner scanner = new Scanner(System.in);
        //--------------Variable----------------//
        int num;
        //--------------------------------------//
        while (true) {
            Methods.print_menu_sing_in_sing_up();// تابع چاپ منوی اول کار
            Methods.wait(1);
            num = scanner.nextInt();
            Methods.cls();
            if (num == 2) {
                Methods.cls();
                Methods.Description_sing_up();// تابع چاپ توضیحات منوی sing_up
                Methods.wait(1);
                Methods.get_input_username_password_sing_up();// تابع ورودی گرفتن username  و password برای منوی sing_up
            } else if (num == 1) {
                Methods.cls();
                int x = Methods.get_input_username_password_sing_in();//تابع ورودی گرفتن برای منوی sing_in
                Methods.wait(1);
                if (x == 1){//وارد قسمت مربوط به مسافر میشود
                    while (true) {
                        Methods.cls();
                        Methods.Passenger_menu_option();//تابع چاپ منو برای مسافر
                        Methods.wait(1);
                        int n = scanner.nextInt();
                        if (n == 1){
                                Small_User.changePassword();//تابع برای عوض کردن پسورد
                            }
                        else if (n == 3) {
                                Tickets.Buy_tickets();//تابع برای خریدن بلیط
                            }
                        else if (n == 6){
                                Small_User.Add_charge();//تابع برای افزایش شارژ
                            }
                        else if (n == 7){
                                Small_User.info();//تابع برای مشاهده مشخصات و اطلاعات کاربر
                            }
                        else if (n == 0){
                            Methods.cls();
                            break;
                        }
                        else if (n == 5){
                            Methods.cls();
                            Methods.Purchased_tickets();
                        }
                        else if (n == 4){
                            Tickets.Ticket_cancellation();
                        }
                    }
                }
                else if(x == 2){//وارد قسمت مربوط به ادمین میشود

                }
            }
        }
    }
}



