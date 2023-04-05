package Project3;

import java.util.Scanner;

public class Tickets extends Colors{
    //--------------Variable----------------//
    private static String[] Origin = {"Yazd","Mashhad","Shiraz"};
    private static String[] Destination = {"Tehran","Ahvaz","Tabriz"};
    private static String[] FlightId = {"WX-12","WZ-15","BG-22"};
    private static int[] Price = {700000,900000,1100000};
    private static String[] Time = {"12:30","08:00","22:30"};
    private static String[] Date = {"1402-12-10","1402-12-11","1402-12-12"};
    private static int[] Seats = {51,245,12};
    //-----------------Methods--------------//
    public static void print_flight_list(){
        Methods.cls();
        System.out.println(ANSI_GREEN+"|FlightId|"+'\t'+'\t'+"|Origin|"+'\t'+"|Destination|"+'\t'+"|Date|"+'\t'+'\t'+'\t'+"|Time|"+'\t'+'\t'+"|Price|"+'\t'+'\t'+"|Seats|"+ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD+"................................................................................................"+ANSI_RESET);
        for (int i = 0; i < Origin.length; i++) {
            System.out.print(Colors.colors[i]+(i+1)+"-"+"|"+FlightId[i]+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Origin[i]+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Destination[i]+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Date[i]+"|"+ANSI_RESET+'\t');
            System.out.print(Colors.colors[i]+"|"+Time[i]+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Price[i]+"|"+ANSI_RESET+'\t');
            System.out.println(Colors.colors[i]+"|"+Seats[i]+"|"+ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD+"................................................................................................"+ANSI_RESET);
        }
        Methods.wait(2);
    }
    public static void Buy_tickets(){
        Scanner scanner = new Scanner(System.in);
        Methods.cls();
        int x;
        while (true) {
            Tickets.print_flight_list();//منوی چاپ مشخصات بلیط ها
            System.out.print("desired number : ");
            x = scanner.nextInt();
            Methods.wait(1);
            if (Small_User.getValidity() > Price[x - 1]) {
                if (Seats[x - 1] > 0) {
                    Small_User.setValidity(Small_User.getValidity()-Price[x-1]);
                    Seats[x-1]--;
                    System.out.println(ANSI_WHITE_BOLD + "Your ticket purchase was successful" + ANSI_RESET);
                    Methods.wait(1);
                    System.out.println(ANSI_RED + "Do you want to continue?" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "1-YES     2-NO" + ANSI_RESET);
                    x = scanner.nextInt();
                    if(x == 2){
                        Methods.wait(1);
                        break;
                    }
                } else {
                    System.out.println(ANSI_BLACK_BOLD + "!Unfortunately, there is no empty capacity!" + ANSI_RESET);
                    Methods.wait(2);
                    break;
                }
            } else {
                System.out.println(ANSI_BLACK_BOLD + "!Your account balance is insufficient!" + ANSI_RESET);
                Methods.wait(2);
                break;
            }
        }
    }
    public static void Add_charge(){
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
}
