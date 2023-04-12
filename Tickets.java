package Project3;

import java.util.Scanner;

public class Tickets extends Colors{
    //----------------input-----------------//
    static Small_User small_user1 = new Small_User();
    static Flies flies = new Flies();
    //--------------Variable----------------//
//    public static String[] Origins = {"Yazd","Mashhad","Shiraz","","",""};
//    public static String[] Destinations = {"Tehran","Ahvaz","Tabriz","","",""};
//    public static String[] FlightIds = {"WX-12","WZ-15","BG-22","","",""};
//    public static long[] Prices = {700000,900000,1100000,0,0,0};
//    public static int[] Hours = {12,8,22,0,0,0};
//    public static int[] Minutes = {30,00,30,0,0,0};
//    public static int[] Years = {1402,1402,1402,0,0,0};
//    public static int[] Months = {12,10,11,0,0,0};
//    public static int[] Days = {10,27,12,0,0,0};
//    public static int[] Seats = {51,245,12,0,0,0};
//    public static void save_fly(){
//        for (int i = 0; i < 3; i++) {
//            if (Years[i] != 0){
//            Tickets ticket1 = new Tickets(FlightIds[i],Origins[i],Destinations[i],Years[i],Months[i],Days[i],Hours[i],Minutes[i],Prices[i],Seats[i]);
//            Flies.setFlies(ticket1);
//            }
//            else {
//                break;
//            }
//        }

    public void save_fly(){
        Tickets tickets = new Tickets("WX-12","Yazd","Tehran",1402,12,10,12,30,700000,51);
        small_user1.setTickets(tickets);
        Tickets tickets1 = new Tickets("WZ-15","Mashhad","Ahvaz",1402,10,27,8,50,900000,245);
        small_user1.setTickets(tickets1);
        Tickets tickets2 = new Tickets("BG-22","Shiraz","Tabriz",1402,11,12,122,00,1100000,12);
        small_user1.setTickets(tickets2);

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
            System.out.print(Colors.colors[i]+(i+1)+"-"+"|"+small_user1.tickets[i].getFlightId()+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+small_user1.tickets[i].getOrigin()+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+small_user1.tickets[i].getDestination()+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+small_user1.tickets[i].getYear()+"/"+small_user1.tickets[i].getMonth()+"/"+small_user1.tickets[i].getDay()+"|"+ANSI_RESET+'\t');
            System.out.print(Colors.colors[i]+"|"+small_user1.tickets[i].getHour()+":"+small_user1.tickets[i].getMinute()+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+small_user1.tickets[i].getPrice()+"|"+ANSI_RESET+'\t');
            System.out.println(Colors.colors[i]+"|"+small_user1.tickets[i].getSeat()+"|"+ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD+"................................................................................................"+ANSI_RESET);
        }
        Methods.wait(1);
    }
    public  static void Buy_tickets(){//تابع برای خرید بلیط
        Scanner scanner = new Scanner(System.in);
        Methods.cls();
        int x;
        while (true) {
              Tickets.print_flight_list();//منوی چاپ مشخصات بلیط ها
//            Flies.print_list_fly();//تابع برای نشان دادن لیست پرواز ها
            System.out.print("desired number : ");
            x = scanner.nextInt();
            Methods.wait(1);
            if (small_user1.getCharge() > small_user1.tickets[x-1].getPrice()) {
                if (small_user1.tickets[x - 1].getSeat() > 0) {
                    small_user1.setCharge(small_user1.getCharge()-small_user1.tickets[x-1].getPrice());
                    small_user1.tickets[x - 1].setSeat(small_user1.tickets[x - 1].getSeat()- 1);
                    System.out.println(ANSI_WHITE_BOLD + "Your ticket purchase was successful" + ANSI_RESET);
                    Methods.wait(1);
                    //---------------------//
                    FlightId = small_user1.tickets[x-1].getFlightId();
                    Origin = small_user1.tickets[x-1].getOrigin();
                    Destination = small_user1.tickets[x-1].getDestination();
                    Year = small_user1.tickets[x-1].getYear();
                    Month = small_user1.tickets[x-1].getMonth();
                    Day = small_user1.tickets[x-1].getDay();
                    Hour = small_user1.tickets[x-1].getHour();
                    Minute = small_user1.tickets[x-1].getMinute();
                    Price = small_user1.tickets[x-1].getPrice();
                    Seat = small_user1.tickets[x-1].getSeat();
                    Tickets ticket = new Tickets(FlightId,Origin,Destination,Year,Month,Day,Hour,Minute,Price,Seat);
                    flies.setTickets(ticket);
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
//    public static void Ticket_cancellation(Flies flies){//تابع برای گنسل کردن بلیط
//        Scanner scanner = new Scanner(System.in);
//        Methods.cls();
//        Booked_thickets();
//        System.out.print(ANSI_PURPLE+"Please select the desired ticket number : "+ANSI_RESET);
//        int x = scanner.nextInt();
//        flies.tickets[x-1] = flies.tickets[x];
//        Flies.setK(Flies.getK()-1);
//        for (int i = x; i < Flies.getK(); i++) {
//            flies.tickets[i] = flies.tickets[i+1];
//        }
//        System.out.println(ANSI_GREEN+"Mission accomplished"+ANSI_RESET);
//        Seats[x-1]++;
//        Methods.wait(2);
//    }
//    public static void Booked_thickets(){//تابع برای مشاهده بلیط های خریداری شده
//        Methods.cls();
//        if (Flies.getK() == 0){
//            System.out.println(ANSI_RED+"* You do not have a purchased ticket *"+ANSI_RESET);
//            Methods.wait(2);
//            return;
//        }
//        for (int i = 0; i < Users.getK(); i++) {
//            System.out.println(Colors.colors[i]+(i + 1)+"- "+Users.tickets[i].toString()+ANSI_RESET);
//        }
//        Methods.wait(1);
//    }

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
    public Tickets() {

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
