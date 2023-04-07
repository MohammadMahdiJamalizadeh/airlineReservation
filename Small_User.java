package Project3;

import java.util.Scanner;

public class Small_User extends Colors{
    //--------------Variable----------------//
    private static String userName;
    private static String userPassword;
    private static long Validity;
    //----------------Methods---------------//
    public static void changePassword(){//تابع برای عوض کردن password
        Scanner scanner = new Scanner(System.in);
        Methods.cls();
        while (true) {
            System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "               Change Password" + ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
            Methods.wait(1);
            System.out.print(ANSI_CYAN_BOLD + "NEW USERNAME : " + ANSI_RESET);
            userName = scanner.next();
            Users.users[Users.getI1()] = userName;
            setUserName(userName);
            System.out.print(ANSI_CYAN_BOLD + "NEW PASSWORD : " + ANSI_RESET);
            userPassword = scanner.next();
            Users.password[Users.getI1()] = userPassword;
            setUserName(userPassword);
            Methods.wait(1);
            System.out.println(ANSI_GREEN+"Do you want to continue?"+ANSI_RESET);
            System.out.println(ANSI_BLUE+"1-YES       2-NO"+ANSI_RESET);
            int x = scanner.nextInt();
            if (x == 2){
                Methods.wait(1);
                break;
            }
        }
    }
    public static void print_info(){//تابع برای نمایش اطلاعات کاربر
        Methods.cls();
        System.out.println(ANSI_CYAN+"YOUR USERNAME : "+ANSI_RESET+ANSI_CYAN+Small_User.getUserName()+ANSI_RESET);
        System.out.println(ANSI_CYAN+"YOUR PASSWORD : "+ANSI_RESET+ANSI_CYAN+Small_User.getUserPassword()+ANSI_RESET);
        System.out.print(ANSI_BLACK_BOLD+"Your current account balance : "+ANSI_RESET);
        System.out.printf("%,d%n",Small_User.getValidity());
        Methods.wait(3);
    }
    public static void Add_charge(){//تابع برای افزایش شارژ
        Methods.cls();
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_BLACK_BOLD+"Your current account balance : "+ANSI_RESET);
        System.out.printf("%,d%n",Small_User.getValidity());
        Methods.wait(2);
        while (true){
            System.out.println(ANSI_RED+"Do you want to top up your account?"+ANSI_RESET);
            System.out.println(ANSI_BLUE+"1-YES       2-NO"+ANSI_RESET);
            int x = scanner.nextInt();
            if(x==2){
                Methods.wait(1);
                break;
            }
            Methods.wait(1);
            System.out.print("Please enter the desired amount(Toman) : ");
            Small_User.setValidity(scanner.nextLong()+Small_User.getValidity());
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
    //-------------Sets && Gets------------//


    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        Small_User.userName = userName;
    }

    public static String getUserPassword() {
        return userPassword;
    }

    public static void setUserPassword(String userPassword) {
        Small_User.userPassword = userPassword;
    }

    public static Long getValidity() {
        return Validity;
    }

    public static void setValidity(Long validity) {
        Validity = validity;
    }
}
