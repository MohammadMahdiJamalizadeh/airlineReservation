package Project3;

import java.io.IOException;

public class Methods extends Calers{
    //----------------------METHODS-----------------------//
    public void print_menu_sing_in_sing_up(){
        System.out.println(ANSI_RED+"1-Sing in"+ANSI_RESET+'\n'+ANSI_BLUE+"2-Sing up"+ANSI_RESET);
    }
    public  void cls() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {
        }
    }
}
