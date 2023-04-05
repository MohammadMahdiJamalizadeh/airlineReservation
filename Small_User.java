package Project3;

import java.util.Scanner;

public class Small_User extends Calers{
    //--------------Variable----------------//
    private static String userName;
    private static String userPassword;
    private static String userTicket;
    //----------------Methods---------------//
    public static void changePassword(){
        Scanner scanner = new Scanner(System.in);
        Methods.cls();
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "               Change Password" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.print(ANSI_CYAN_BOLD+"NEW USERNAME : "+ANSI_RESET);
        userName = scanner.next();
        Users.users[Users.getI1()] = userName;
        setUserName(userName);
        System.out.print(ANSI_CYAN_BOLD+"NEW PASSWORD : "+ANSI_RESET);
        userPassword = scanner.next();
        Users.password[Users.getI1()] = userPassword;
        setUserName(userPassword);
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
}
