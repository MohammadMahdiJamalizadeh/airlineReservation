package Project3;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Methods extends Colors {
    //-------------------------------------//
    private static int i;
    //--------------------------input--------------------//
    Scanner scanner = new Scanner(System.in);
    static Small_User small_user = new Small_User();
    static Users users = new Users();
    //--------------------------------//
    //    Password_Username password_username = new Password_Username();
    //----------------------METHODS-----------------------//
    public void print_menu_sing_in_sing_up() {//تابع چاپ منوی اول کار

        System.out.println(ANSI_RED + "1- Sing in" + ANSI_RESET + '\n' + ANSI_BLUE + "2- Sing up" +'\n' +ANSI_RESET+ANSI_BLACK_BOLD+"0- Exit" + ANSI_RESET);
    }
    public int Set_the_correct_input(){
         int number = 0;
        while (true){ // تنظیم کردن ورودی صحیح گرفتن
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
                if(number > -1 && number < 3){
                    break;
                }
            }
            System.out.println(ANSI_BLACK_BOLD+"! Please try again !"+ANSI_RESET);
            scanner = new Scanner(System.in);
        }
        return number;
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

    public void get_input_username_password_sing_up() {//تابع برای ورودی گرفتن منوی sing_up
        String username, password;
        int x;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(ANSI_WHITE_BOLD + "Please enter your username and password :" + ANSI_RESET);
            System.out.print(ANSI_WHITE_BOLD + "USERNAME : " + ANSI_RESET);
            username = scanner.next();
            small_user.setUserName(username);
//            Users.setUserss(username);
            System.out.print(ANSI_WHITE_BOLD + "PASSWORD : " + ANSI_RESET);
            password = scanner.next();
            small_user.setUserPassword(password);
//            Users.setPassword(password);
            Small_User small_user = new Small_User(username,password);
            users.setUsers(small_user);
            cls();
            System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD + "          Account successfully created :)" + ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
            Methods.wait(1);
            System.out.println(ANSI_RED + "Do you want to continue ?" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "1-YES            2-NO" + ANSI_RESET);
             x = scanner.nextInt();
            if (x == 2) {
                cls();
                break;
            }
        }
    }

    public void Description_sing_up() {//تابع برای توضیحات منوی sing_up
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(ANSI_YELLOW + "Dear user, please note that your username must contain English letters and" + ANSI_RESET + '\n' +
                "            " + ANSI_YELLOW + "your password must contain at least 6 numbers" + ANSI_RESET);
        System.out.println("--------------------------------------------------------------------------");
    }

    public int get_input_username_password_sing_in() {//تبع برای وروردی گرفتن منوی sing_in
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

    public int check(String username2, String password2) {//تابع برای چک کردن تطابق داشتن username و password در منو های sing_in  و sing_up
        cls();
        String username, password;
        username = username2;
        password = password2;
        while (true) {
            for (int i = 0; i < Users.getI(); i++) {
                if ((username.equals(users.users[i].getUserName())) && (password.equals(users.users[i].getUserPassword()))) {
                    cls();
                    System.out.println(ANSI_CYAN + "              WELCOME " + ANSI_RESET + ANSI_CYAN + username + ANSI_RESET);
                    Users.setJ(i);
                    return 1;
                }
            }
            if ((password.equals("Admin")) && (username.equals("Admin"))) {
                System.out.println(ANSI_CYAN + "              WELCOME Admin" + ANSI_RESET);
                wait(1);
                return 2;
            } else {
                System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
                System.out.println(ANSI_BLACK_BOLD + "          The desired user was not found!" + ANSI_RESET);
                System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
                wait(1);
            }

            return 3;
        }
    }
    public static void wait(int sec) {
        try {
            Thread.currentThread().sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void Passenger_menu_option(){//تابع برای چاپ منوی مسافر
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println("            PASSENGER MENU OPTION");
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        Date();
        System.out.println(ANSI_PURPLE+"1- Change password"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"2- Search flight tickets"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"3- Booking thicket"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"4- Ticket cancellation"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"5- Booked thickets"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"6- Add charge"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"7- Info"+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"0- sing out"+ANSI_RESET);
    }
    public static void Date() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss");
        System.out.println(ANSI_CYAN+"    Current Date: " + ft.format(dNow)+ANSI_RESET);
    }

    public static void print_Admin_menu_option(){
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println("            ADMIN MENU OPTION");
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_BLUE+"1- Add"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"2- Update"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"3- Remove"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"4- Flight schedules"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"0- sing out"+ANSI_RESET);
    }
    public static void changePassword(){//تابع برای عوض کردن password
        Scanner scanner = new Scanner(System.in);
        String password,username;
        Methods.cls();
        while (true) {
            System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "               Change Password" + ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
            Methods.wait(1);
            System.out.print(ANSI_CYAN_BOLD + "NEW USERNAME : " + ANSI_RESET);
            username = scanner.next();
            users.users[Users.getJ()].setUserName(username);
//            users.users[Users.getI1()] = small_user.getUserName();
            System.out.print(ANSI_CYAN_BOLD + "NEW PASSWORD : " + ANSI_RESET);
            password = scanner.next();
            users.users[Users.getJ()].setUserPassword(password);
            Methods.wait(1);
            System.out.println(ANSI_GREEN+"The password was changed Do you want to continue?"+ANSI_RESET);
            System.out.println(ANSI_BLUE+"1-YES       2-NO"+ANSI_RESET);
            int x = scanner.nextInt();
            if (x == 2){
                Methods.wait(1);
                break;
            }
        }
    }
    public static void Add_charge(Small_User user1){//تابع برای افزایش شارژ
        long charge;
        Methods.cls();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(ANSI_BLACK_BOLD+"Your current account balance : "+ANSI_RESET);
            System.out.printf("%,d%n",users.users[Users.getJ()].getCharge());
            Methods.wait(2);
            System.out.println(ANSI_RED+"Do you want to top up your account?"+ANSI_RESET);
            System.out.println(ANSI_BLUE+"1-YES       2-NO"+ANSI_RESET);
            int x = scanner.nextInt();
            if(x==2){
                Methods.wait(1);
                break;
            }
            Methods.wait(1);
            System.out.print("Please enter the desired amount(Toman) : ");
            charge = scanner.nextLong();
            charge = charge + user1.getCharge();
            user1.setCharge(charge);
            Methods.cls();
            Methods.wait(1);
            System.out.println(ANSI_GREEN+"Charging was done successfully. Do you want to continue?"+ANSI_RESET);
            System.out.println(ANSI_BLUE+"1-YES       2-NO"+ANSI_RESET);
            x = scanner.nextInt();
            if (x == 2){
                Methods.wait(1);
                break;
            }
            Methods.wait(1);
        }
    }
    public static void print_info(Small_User users){//تابع برای نمایش اطلاعات کاربر
        Methods.cls();
        System.out.println(ANSI_CYAN+"YOUR USERNAME : "+ANSI_RESET+ANSI_CYAN+users.getUserName()+ANSI_RESET);
        System.out.println(ANSI_CYAN+"YOUR PASSWORD : "+ANSI_RESET+ANSI_CYAN+users.getUserPassword()+ANSI_RESET);
        System.out.print(ANSI_BLACK_BOLD+"Your current account balance : "+ANSI_RESET);
        System.out.printf("%,d%n",users.getCharge());
        Methods.wait(3);
    }


    //----------------SETS && GETS-------------//


    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Methods.i = i;
    }
}


