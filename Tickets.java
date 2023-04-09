package Project3;

import java.util.Scanner;

public class Tickets extends Colors{
    //--------------Variable----------------//
    public static String[] Origins = {"Yazd","Mashhad","Shiraz","","",""};
    public static String[] Destinations = {"Tehran","Ahvaz","Tabriz","","",""};
    public static String[] FlightIds = {"WX-12","WZ-15","BG-22","","",""};
    public static long[] Prices = {700000,900000,1100000,0,0,0};
    public static int[] Hours = {12,8,22,0,0,0};
    public static int[] Minutes = {30,00,30,0,0,0};
    public static int[] Years = {1402,1402,1402,0,0,0};
    public static int[] Months = {12,10,11,0,0,0};
    public static int[] Days = {10,27,12,0,0,0};
    public static int[] Seats = {51,245,12,0,0,0};
    public static void save_fly(){
        for (int i = 0; i < 3; i++) {
            if (Years[i] != 0){
            Tickets ticket1 = new Tickets(FlightIds[i],Origins[i],Destinations[i],Years[i],Months[i],Days[i],Hours[i],Minutes[i],Prices[i],Seats[i]);
            Flies.setFlies(ticket1);
            }
            else {
                break;
            }
        }
    }
    //------------------------------//
    private  static String Origin;
    private  static String Destination;
    private  static String FlightId;
    private  static long Price;
    private  static int Hour;
    private  static int Minute;
    private  static int Year;
    private  static int Month;
    private  static int Day;
    private  static int Seat;
    //-----------------Methods--------------//
    public static void print_flight_list(){// تابع چاپ لیست پرواز ها
        Methods.cls();
        System.out.println(ANSI_GREEN+"|FlightId|"+'\t'+'\t'+"|Origin|"+'\t'+"|Destination|"+'\t'+"|Date|"+'\t'+'\t'+'\t'+"|Time|"+'\t'+'\t'+"|Price|"+'\t'+'\t'+"|Seats|"+ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD+"................................................................................................"+ANSI_RESET);
        for (int i = 0; i < Admin.getW(); i++) {
            System.out.print(Colors.colors[i]+(i+1)+"-"+"|"+FlightIds[i]+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Origins[i]+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Destinations[i]+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Years[i]+"/"+Months[i]+"/"+Days[i]+"|"+ANSI_RESET+'\t');
            System.out.print(Colors.colors[i]+"|"+Hours[i]+":"+Minutes[i]+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Prices[i]+"|"+ANSI_RESET+'\t');
            System.out.println(Colors.colors[i]+"|"+Seats[i]+"|"+ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD+"................................................................................................"+ANSI_RESET);
        }
        Methods.wait(1);
    }
    public static void Buy_tickets(){//تابع برای خرید بلیط
        Scanner scanner = new Scanner(System.in);
        Methods.cls();
        int x;
        while (true) {
              Tickets.print_flight_list();//منوی چاپ مشخصات بلیط ها
//            Flies.print_list_fly();//تابع برای نشان دادن لیست پرواز ها
            System.out.print("desired number : ");
            x = scanner.nextInt();
            Methods.wait(1);
            if (Small_User.getValidity() > Prices[x - 1]) {
                if (Seats[x - 1] > 0) {
                    Small_User.setValidity(Small_User.getValidity()-Prices[x-1]);
                    Seats[x-1]--;
                    System.out.println(ANSI_WHITE_BOLD + "Your ticket purchase was successful" + ANSI_RESET);
                    Methods.wait(1);
                    //---------------------//
                    FlightId = FlightIds[x-1];
                    Origin = FlightIds[x-1];
                    Destination = FlightIds[x-1];
                    Year = Years[x-1];
                    Month = Months[x-1];
                    Day = Days[x-1];
                    Hour = Hours[x-1];
                    Minute = Minutes[x-1];
                    Price = Prices[x-1];
                    Seat = Seats[x-1];
                    Tickets ticket = new Tickets(FlightId,Origin,Destination,Year,Month,Day,Hour,Minute,Price,Seat);
                    Users.setTickets(ticket);
                    //------------------------//
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
    public static void Ticket_cancellation(){//تابع برای گنسل کردن بلیط
        Scanner scanner = new Scanner(System.in);
        Methods.cls();
        Booked_thickets();
        System.out.print(ANSI_PURPLE+"Please select the desired ticket number : "+ANSI_RESET);
        int x = scanner.nextInt();
        Users.tickets[x-1] = Users.tickets[x];
        Users.setK(Users.getK()-1);
        for (int i = x; i < Users.getK(); i++) {
            Users.tickets[i] = Users.tickets[i+1];
        }
        System.out.println(ANSI_GREEN+"Mission accomplished"+ANSI_RESET);
        Seats[x-1]++;
        Methods.wait(2);
    }
    public static void Booked_thickets(){//تابع برای مشاهده بلیط های خریداری شده
        Methods.cls();
        if (Users.getK() == 0){
            System.out.println(ANSI_RED+"* You do not have a purchased ticket *"+ANSI_RESET);
            Methods.wait(2);
            return;
        }
        for (int i = 0; i < Users.getK(); i++) {
            System.out.println(Colors.colors[i]+(i + 1)+"- "+Users.tickets[i].toString()+ANSI_RESET);
        }
        Methods.wait(1);
    }

    //--------------Constructors-------------//
    public Tickets(String flightId, String origin, String destination, int year, int month, int day, int hour, int minute, long price,int seats) {
        FlightId = flightId;
        Origin = origin;
        Destination = destination;
        Year = year;
        Month = month;
        Day = day;
        Hour = hour;
        Minute = minute;
        Price = price;
        Seat = seats;
    }
    //--------------SETS && GETS------------//

    public static String getOrigin() {
        return Origin;
    }
    public static void setOrigin(String origin) {
        Origin = origin;
    }
    public static String getDestination() {
        return Destination;
    }

    public static void setDestination(String destination) {
        Destination = destination;
    }

    public static String getFlightId() {
        return FlightId;
    }

    public static void setFlightId(String flightId) {
        FlightId = flightId;
    }

    public static long getPrice() {
        return Price;
    }

    public static void setPrice(long price) {
        Price = price;
    }

    public static int getHour() {
        return Hour;
    }

    public static void setHour(int hour) {
        Hour = hour;
    }

    public static int getMinute() {
        return Minute;
    }

    public static void setMinute(int minute) {
        Minute = minute;
    }

    public static int getYear() {
        return Year;
    }

    public static void setYear(int year) {
        Year = year;
    }

    public static int getMonth() {
        return Month;
    }

    public static void setMonth(int month) {
        Month = month;
    }

    public static int getDay() {
        return Day;
    }

    public static void setDay(int day) {
        Day = day;
    }

    public static int getSeat() {
        return Seat;
    }

    public static void setSeat(int seat) {
        Seat = seat;
    }
    //-----------------ToString-------------//

    @Override
    public  String toString() {
        return "Id : "+FlightId;
    }
}
