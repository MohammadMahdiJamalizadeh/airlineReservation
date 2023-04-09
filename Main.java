package Project3;
import java.util.Scanner;
public class Main extends Colors{
    public static void main(String[] args) {
        //---------------------input--------------------//
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();
        //--------------Variable----------------//
        int num;
        //--------------------------------------//
        Tickets.save_fly();
        while (true) {
            methods.print_menu_sing_in_sing_up();// تابع چاپ منوی اول کار
            Methods.wait(1);
            while (true){
                if(scanner.hasNextInt()){
                    num = scanner.nextInt();
                    if(num > -1 && num < 3){
                        break;
                    }
                }
                System.out.println(ANSI_BLACK_BOLD+"! Please try again !"+ANSI_RESET);
                scanner = new Scanner(System.in);
            } // تنظیم کردن ورودی صحیح گرفتن
            methods.cls();
            if (num == 0){
                return;
            }
            if (num == 2) {//ورورد برای قسمت sing_up
                methods.cls();
                methods.Description_sing_up();// تابع چاپ توضیحات منوی sing_up
                Methods.wait(1);
                methods.get_input_username_password_sing_up();// تابع ورودی گرفتن username  و password برای منوی sing_up
            } else if (num == 1) {//ورود برای قسمت sing_in
                methods.cls();
                int x = methods.get_input_username_password_sing_in();//تابع ورودی گرفتن برای منوی sing_in
                Methods.wait(1);
                if (x == 1){// قسمت کاربر سایت
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
                                Small_User.Add_charge();//تابع برای افزایش شارژ
                            }
                        else if (n == 7){
                                Small_User.print_info();//تابع برای مشاهده مشخصات و اطلاعات کاربر
                            }
                        else if(n == 5){//تابع برای مشاهده بلیط های خریداری شده
                            Tickets.Booked_thickets();
                        }
                        else if (n == 4){
                            Tickets.Ticket_cancellation();//تابع برای کنسل کردن بلیط
                        }
                        else if (n == 0){
                            Methods.cls();
                            Methods.wait(1);
                            break;
                        }
                    }
                }
                else if(x == 2) {// قسمت ادمین سایت
                    while (true) {
                        Methods.cls();
                        Methods.print_Admin_menu_option();//چاپ منو برای ادمین
                        int n = scanner.nextInt();
                        if (n == 1){
                            Admin.Add_fly();//تابع برای اضافه کردن بلیط توسط ادمین سایت
                        }
                        else if(n == 2){
                        }
                        else if(n == 3){
                            Admin.Remove_Ticket();
                        }
                        else if (n == 4) {
                            Flies.print_list_fly();//تابع برای نشان دادن لیست پرواز ها
                        }
                        else if (n == 0){
                            Methods.cls();
                            break;
                        }
                    }
                }
            }
        }
    }
}



