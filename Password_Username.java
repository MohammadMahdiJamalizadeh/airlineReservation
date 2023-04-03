package Project3;

import java.util.ArrayList;
import java.util.Scanner;

public class Password_Username extends Calers{
    Scanner scanner = new Scanner(System.in);
    Methods methods = new Methods();
    ArrayList <String>password_list = new ArrayList();
    ArrayList <String>username_list = new ArrayList();
    private int num;
    private int i;
    private String username;
    private String password;
//    private String[] username_list = new String[1000];
//    private String[] password_list = new String[1000];
    //---------------------------METHODS---------------------//
    public void username_password_sing_up(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(ANSI_YELLOW+"Dear user, please note that your username must contain English letters and"+ANSI_RESET+'\n'+
                     "            "+ ANSI_YELLOW+ "your password must contain at least 6 numbers"+ANSI_RESET);
        System.out.println("--------------------------------------------------------------------------");
    }
    public void get_input_username_password(){
        for ( i = 0; i < 1000; i++) {
            System.out.print("USERNAME : ");
            setUsername(scanner.next());
            username_list.add(i,getUsername());
            System.out.print("PASSWORD : ");
            password = scanner.next();
            password_list.add(i,getPassword());
            System.out.println(ANSI_WHITE_BOLD+"New user created successfully\n" +ANSI_RESET+
            " "+ ANSI_WHITE_BOLD+"Do you want to continue?"+ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD+"1-YES"+ANSI_RESET+ '\n' +ANSI_BLACK_BOLD+ "2-NO"+ANSI_RESET);
            num = scanner.nextInt();
            methods.cls();
            if (num == 2){
                break;
            }
        }
    }
    //------------------------GETS & SETS-----------------------//

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String[] getUsername_list() {
//        return username_list;
//    }
//
//    public void setUsername_list(String[] username_list) {
//        this.username_list = username_list;
//    }
//
//    public String[] getPassword_list() {
//        return password_list;
//    }
//
//    public void setPassword_list(String[] password_list) {
//        this.password_list = password_list;
//    }
}
