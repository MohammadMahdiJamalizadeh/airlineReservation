package Project3;

import java.util.Scanner;

public class Tickets extends Colors{
    //--------------Variable----------------//
    private static String[] Origins = {"Yazd","Mashhad","Shiraz"};
    private static String[] Destinations = {"Tehran","Ahvaz","Tabriz"};
    private static String[] FlightIds = {"WX-12","WZ-15","BG-22"};
    private static int[] Prices = {700000,900000,1100000};
    private static String[] Times = {"12:30","08:00","22:30"};
    private static String[] Dates = {"1402-12-10","1402-12-11","1402-12-12"};
    private static int[] Seatss = {51,245,12};
    private static String Origin;
    private static String Destination;
    private static String FlightId;
    private static String Time;
    private static String Date;
    private  static int Price;
    private  static int Seats;
    static int sum;
    //-----------------Methods--------------//
    public static void print_flight_list(){
        Methods.cls();
        System.out.println(ANSI_GREEN+"|FlightId|"+'\t'+'\t'+"|Origin|"+'\t'+"|Destination|"+'\t'+"|Date|"+'\t'+'\t'+'\t'+"|Time|"+'\t'+'\t'+"|Price|"+'\t'+'\t'+"|Seats|"+ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD+"................................................................................................"+ANSI_RESET);
        for (int i = 0; i < Origins.length; i++) {
            System.out.print(Colors.colors[i]+(i+1)+"-"+"|"+FlightIds[i]+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Origins[i]+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Destinations[i]+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Dates[i]+"|"+ANSI_RESET+'\t');
            System.out.print(Colors.colors[i]+"|"+Times[i]+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Prices[i]+"|"+ANSI_RESET+'\t');
            System.out.println(Colors.colors[i]+"|"+Seatss[i]+"|"+ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD+"................................................................................................"+ANSI_RESET);
        }
        Methods.wait(2);
    }
    public static void Buy_tickets(){// تابع خرید بلیط
        Scanner scanner = new Scanner(System.in);
        Methods.cls();
        int x;
        while (true) {
            Tickets.print_flight_list();//منوی چاپ مشخصات بلیط ها
            System.out.print("desired number : ");
            x = scanner.nextInt();
            Methods.wait(1);
            if (Small_User.getValidity() > Prices[x - 1]) {
                if (Seatss[x - 1] > 0) {
                    Small_User.setValidity(Small_User.getValidity()-Prices[x-1]);
                    Seatss[x-1]--;
                    Methods.cls();
                    System.out.println(ANSI_WHITE_BOLD + "Your ticket purchase was successful" + ANSI_RESET);
                    sum++;
                    //ریختن مشخصات بلیط خریداری شده در متغییرهای مخصوص
                    //----------------------------//
                    Origin = Origins[x-1];
                    FlightId= FlightIds[x-1];
                    Destination = Destinations[x-1];
                    Date = Dates[x-1];
                    Price = Prices[x-1];
                    Time = Times[x-1];
                    Seats = Seatss[x-1];
                    Tickets tickets = new Tickets(Origin,Destination,FlightId,Time,Date,Price,Seats);
                    Users.setTickets(tickets);
                    //---------------------------//

                    System.out.println(ANSI_RED + "Do you want to continue?" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "1-YES     2-NO" + ANSI_RESET);
                    x = scanner.nextInt();
                    if(x == 2){
                        Methods.wait(1);
                        break;
                    }
                } else {
                    Methods.cls();
                    System.out.println(ANSI_BLACK_BOLD + "!Unfortunately, there is no empty capacity!" + ANSI_RESET);
                    Methods.wait(2);
                    break;
                }
            } else {
                Methods.cls();
                System.out.println(ANSI_BLACK_BOLD + "!Your account balance is insufficient!" + ANSI_RESET);
                Methods.wait(2);
                break;
            }
        }
    }
    public static void Ticket_cancellation(){//تابع برای حذف بلیط
        Scanner scanner = new Scanner(System.in);
        Methods.cls();
        Methods.wait(1);
        Methods.Purchased_tickets();
        System.out.println(ANSI_CYAN+"Please select the desired number"+ANSI_RESET);
        int x = scanner.nextInt();
        Users.Tickets[x-1] = Users.Tickets[x];
        Methods.wait(1);
        System.out.println(ANSI_CYAN+" * mission accomplished * "+ANSI_RESET);
        sum--;
        Methods.wait(2);
    }
    //---------------SETS && GETS--------------//
    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getFlightId() {
        return FlightId;
    }

    public void setFlightId(String flightId) {
        FlightId = flightId;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }


    public int getSeats() {
        return Seats;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }
    //----------------CONSTRUCTORS--------------//


    public Tickets(String origin, String destination, String flightId, String time, String date, int price, int seats) {
        Origin = origin;
        Destination = destination;
        FlightId = flightId;
        Time = time;
        Date = date;
        Price = price;
        Seats = seats;
    }
}
