package Project3;
import java.util.Scanner;
public class Main extends Colors{
    public static void main(String[] args) {
        //---------------------input--------------------//
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();
        Tickets tickets = new Tickets();
//        Users users = new Users();
        //--------------Variable----------------//
        int num;
        int x = 0;
        //--------------------------------------//
        tickets.save_fly();
        while (true) {
            while (true) {
                methods.print_menu_sing_in_sing_up();// تابع چاپ منوی اول کار
                Methods.wait(1);

                num = methods.Set_the_correct_input(); // تنظیم ورودی صحیح گرفتن
                methods.cls();
                if (num == 0) {
                    return;
                }
                if (num == 2) {//ورورد برای قسمت sing_up
                    methods.cls();
                    methods.Description_sing_up();// تابع چاپ توضیحات منوی sing_up
                    Methods.wait(1);
                    methods.get_input_username_password_sing_up();// تابع ورودی گرفتن username  و password برای منوی sing_up
                } else if (num == 1) {//ورود برای قسمت sing_in
                    methods.cls();
                    x = methods.get_input_username_password_sing_in();//تابع ورودی گرفتن برای منوی sing_in
                    Methods.wait(1);
                    break;
                }
            }
                if (x == 1){// قسمت کاربر سایت
                    while (true) {
                        Methods.cls();
                        methods.Passenger_menu_option();//تابع چاپ منو برای مسافر
                        Methods.wait(1);
                        int n = scanner.nextInt();
                        if (n == 1){
                                methods.changePassword();//تابع برای عوض کردن پسورد
                            }
                        else if (n == 3) {
                            Tickets.Buy_tickets(Users.users[Users.getJ()]);//تابع برای خریدن بلیط
                            }
                        else if (n == 6){
                                methods.Add_charge(Users.users[Users.getJ()]);//تابع برای افزایش شارژ
                            }
//                        else if (n == 7){
//                                Small_User.print_info();//تابع برای مشاهده مشخصات و اطلاعات کاربر
//                            }
                        else if(n == 5){//تابع برای مشاهده بلیط های خریداری شده
                            Tickets.Booked_thickets(Users.users[Users.getJ()]);
                        }
//                        else if (n == 4){
//                            Tickets.Ticket_cancellation();//تابع برای کنسل کردن بلیط*/
//                        }
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
                            Tickets.print_flight_list();//تابع برای نشان دادن لیست پرواز ها
                            methods.wait(2);
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



