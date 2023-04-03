package Project3;

import java.util.ArrayList;
import java.util.Scanner;

public class Password_Username extends Calers{
    //---------------------input--------------------//
    Scanner scanner = new Scanner(System.in);
    Methods methods = new Methods();
    ArrayList <String>password_list = new ArrayList();
    ArrayList <String>username_list = new ArrayList();
    //--------------Variable----------------//
    private int num;
    private int sum = 0;
    private int i;
    private String username_up;
    private String password_up;
    private String username_in;
    private String password_in;
    //---------------------------METHODS---------------------//
    public void username_password_sing_up(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(ANSI_YELLOW+"Dear user, please note that your username must contain English letters and"+ANSI_RESET+'\n'+
                     "            "+ ANSI_YELLOW+ "your password must contain at least 6 numbers"+ANSI_RESET);
        System.out.println("--------------------------------------------------------------------------");
    }
    public void get_input_username_password_sing_in(){
        System.out.println(ANSI_WHITE_BOLD + "Please enter your username and password :" + ANSI_RESET);
        System.out.print(ANSI_WHITE_BOLD+"USERNAME : "+ANSI_RESET);
        setUsername_in(scanner.next());
        System.out.print(ANSI_WHITE_BOLD+"PASSWORD : "+ANSI_RESET);
        setPassword_in(scanner.next());
        methods.cls();
    }
    public int check(){

            if((password_list.contains(password_in)) && (username_list.contains(username_in))){
                System.out.println(ANSI_CYAN_BOLD+"WELCOME "+ANSI_RESET+ ANSI_CYAN_BOLD+username_in+ANSI_RESET);
                sum++;
                return 3;
            }
            else if ((password_in.equals("admin")) && username_in.equals("admin")){
                System.out.println(ANSI_CYAN_BOLD+"WELCOME admin"+ANSI_RESET);
                sum++;
                return 2;
            }
            else {
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("                  "+ANSI_BLACK_BOLD+"! The intended user was not identified !\n"
                       +ANSI_RESET+"                         "+ ANSI_BLACK_BOLD+"! Please register first !"+ANSI_RESET);
                System.out.println("--------------------------------------------------------------------------");
                return 1;
            }
    }
    public void get_input_username_password_sing_up(){
        for ( i = 0; i < 1000; i++) {
            System.out.print("USERNAME : ");
            setUsername_up(scanner.next());
            username_list.add(i,getUsername_up());
            System.out.print("PASSWORD : ");
            setPassword_up(scanner.next());
            password_list.add(i,getPassword_up());
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
    public void Set_a_new_username_and_password(){
        System.out.println(ANSI_PURPLE+"NEW USERNAME : "+ANSI_RESET);
        setPassword_up(scanner.next());
        password_list.set(sum,getPassword_up());
        System.out.println(getPassword_up());
    }
    //------------------------GETS & SETS-----------------------//


    public ArrayList<String> getPassword_list() {
        return password_list;
    }

    public void setPassword_list(ArrayList<String> password_list) {
        this.password_list = password_list;
    }

    public ArrayList<String> getUsername_list() {
        return username_list;
    }

    public void setUsername_list(ArrayList<String> username_list) {
        this.username_list = username_list;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getUsername_up() {
        return username_up;
    }

    public void setUsername_up(String username_up) {
        this.username_up = username_up;
    }

    public String getPassword_up() {
        return password_up;
    }

    public void setPassword_up(String password_up) {
        this.password_up = password_up;
    }

    public String getUsername_in() {
        return username_in;
    }

    public void setUsername_in(String username_in) {
        this.username_in = username_in;
    }

    public String getPassword_in() {
        return password_in;
    }

    public void setPassword_in(String password_in) {
        this.password_in = password_in;
    }
}
