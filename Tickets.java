package Project3;

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
    }

}
