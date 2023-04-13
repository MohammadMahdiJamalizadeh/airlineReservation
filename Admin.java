package Project3;

import java.util.Scanner;

public class Admin extends Colors{
    //-------------------//
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
    private static int w = 3;
    //------------Input----------//
    public static void Add_fly() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(ANSI_BLACK_BOLD + "Flight Id : " + ANSI_RESET);
            String Id = scanner.next();
            System.out.print(ANSI_BLACK_BOLD + "Origin : " + ANSI_RESET);
            String Origin = scanner.next();
            System.out.print(ANSI_BLACK_BOLD + "Destination : " + ANSI_RESET);
            String Destination = scanner.next();
            System.out.println(ANSI_BLACK_BOLD + "Date " + ANSI_RESET);
            System.out.println(ANSI_BLUE + "{" + ANSI_RESET);
            System.out.print(ANSI_WHITE_BOLD + " Year : " + ANSI_RESET);
            int Year = scanner.nextInt();
            System.out.print(ANSI_WHITE_BOLD + " Month : " + ANSI_RESET);
            int Month = scanner.nextInt();
            System.out.print(ANSI_WHITE_BOLD + " Day : " + ANSI_RESET);
            int Day = scanner.nextInt();
            System.out.println(ANSI_BLUE + "}" + ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD + "Time " + ANSI_RESET);
            System.out.println(ANSI_BLUE + "{" + ANSI_RESET);
            System.out.print(ANSI_WHITE_BOLD + " Hour : " + ANSI_RESET);
            int Hour = scanner.nextInt();
            System.out.print(ANSI_WHITE_BOLD + " Minutes : " + ANSI_RESET);
            int Minutes = scanner.nextInt();
            System.out.println(ANSI_BLUE + "}" + ANSI_RESET);
            System.out.print(ANSI_BLACK_BOLD + "Price : " + ANSI_RESET);
            Long Prince = scanner.nextLong();
            System.out.print(ANSI_BLACK_BOLD + "Seats : " + ANSI_RESET);
            int Seat = scanner.nextInt();
            Flight flight = new Flight(Id,Origin,Destination,Year,Month,Day,Hour,Minutes,Prince,Seat);
            Flies.setFlies(flight);
            w++;
            Methods.wait(1);
            Methods.cls();
            System.out.println(ANSI_CYAN + "Mission accomplished" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "Do you want to continue?" + ANSI_RESET);
            System.out.println("1-YES      2-NO");
            int x = scanner.nextInt();
            if (x == 2) {
                break;
            }
        }
    }
    public static void Remove_Ticket() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Tickets.print_flight_list();//منوی چاپ مشخصات بلیط ها
            Methods.wait(2);
            System.out.print("Please select the desired number : ");
            int x = scanner.nextInt();
            Flies.fly[x-1] = Flies.fly[x];
            Flies.setI(Flies.getI()-1);
            for (int i = x; i < Flies.getI(); i++) {
                Flies.fly[i] = Flies.fly[i + 1];
            }
            Methods.cls();
            System.out.println(ANSI_CYAN + "Mission accomplished" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "Do you want to continue?" + ANSI_RESET);
            System.out.println("1-YES      2-NO");
            x = scanner.nextInt();
            if (x == 2) {
                break;
            }
        }
    }
    public static void Update_fly(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Tickets.print_flight_list();//تابع برای نشان دادن لیست پرواز ها
            System.out.print(ANSI_BLUE+"Please select the desired ticket : "+ANSI_RESET);
            int x = scanner.nextInt();
            System.out.println(ANSI_GREEN+"|FlightId|"+'\t'+'\t'+"|Origin|"+'\t'+"|Destination|"+'\t'+"|Date|"+'\t'+'\t'+'\t'+"|Time|"+'\t'+'\t'+"|Price|"+'\t'+'\t'+"|Seats|"+ANSI_RESET);
            for (int i = x-1; i < x; i++) {
                System.out.println(ANSI_BLACK_BOLD+"................................................................................................"+ANSI_RESET);
                System.out.print(Colors.colors[i]+(i+1)+"-"+"|"+Flies.fly[i].getFlightId()+"|"+ANSI_RESET+'\t'+'\t');
                System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getOrigin()+"|"+ANSI_RESET+'\t'+'\t');
                System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getDestination()+"|"+ANSI_RESET+'\t'+'\t');
                System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getYear()+"/"+Flies.fly[i].getMonth()+"/"+Flies.fly[i].getDay()+"|"+ANSI_RESET+'\t');
                System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getHour()+":"+Flies.fly[i].getMinute()+"|"+ANSI_RESET+'\t'+'\t');
                System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getPrice()+"|"+ANSI_RESET+'\t');
                System.out.println(Colors.colors[i]+"|"+Flies.fly[i].getSeat()+"|"+ANSI_RESET);
                System.out.println(ANSI_BLACK_BOLD+"................................................................................................"+ANSI_RESET);

            }
            System.out.println(ANSI_BLUE+"please Enter the desired part"+ANSI_RESET);
            String a = scanner.next();
            if(a.equals("FlightId")){
                System.out.print(ANSI_RED+"NEW FlightId : "+ANSI_RESET);
                FlightId = scanner.next();
                Flies.fly[x-1].setFlightId(FlightId);
            }
            else if(a.equals("Origin")){
                System.out.print(ANSI_RED+"NEW Origin : "+ANSI_RESET);
                Origin = scanner.next();
                Flies.fly[x-1].setOrigin(Origin);
            }
            else if(a.equals("Destination")){
                System.out.print(ANSI_RED+"NEW Destination : "+ANSI_RESET);
                Destination = scanner.next();
                Flies.fly[x-1].setDestination(Destination);

            }
            else if(a.equals("Date")){
                System.out.println(ANSI_RED+"NEW Date"+ANSI_RESET);
                System.out.print(ANSI_BLACK_BOLD+"NEW YEAR : "+ANSI_RESET);
                Year = scanner.nextInt();
                Flies.fly[x-1].setYear(Year);
                System.out.println();
                System.out.print(ANSI_BLACK_BOLD+"NEW MONTH : "+ANSI_RESET);
                Month = scanner.nextInt();
                Flies.fly[x-1].setMonth(Month);
                System.out.print(ANSI_BLACK_BOLD+"NEW DAY : "+ANSI_RESET);
                Day = scanner.nextInt();
                Flies.fly[x-1].setDay(Day);
            }
            else if(a.equals("Time")){
                System.out.println(ANSI_RED+"NEW TIME"+ANSI_RESET);
                System.out.print(ANSI_BLACK_BOLD+"NEW HOUR : "+ANSI_RESET);
                Hour = scanner.nextInt();
                Flies.fly[x-1].setHour(Hour);
                System.out.println();
                System.out.print(ANSI_BLACK_BOLD+"NEW MINUTE : "+ANSI_RESET);
                Minute = scanner.nextInt();
                Flies.fly[x-1].setMinute(Minute);
            }
            else if(a.equals("Price")){
                System.out.print(ANSI_RED+"NEW Price : "+ANSI_RESET);
                Price = scanner.nextInt();
                Flies.fly[x-1].setPrice(Price);
            }
            else if (a.equals("Seats")){
                System.out.print(ANSI_RED+"NEW Seats : "+ANSI_RESET);
                Seat = scanner.nextInt();
                Flies.fly[x-1].setSeat(Seat);
            }
            System.out.println(ANSI_GREEN+"The operation was successful, do you want to continue?"+ANSI_RESET);
            System.out.println("1-YES         2-NO");
            int w = scanner.nextInt();
            if (w == 2){
                break;
            }
        }
    }
    //-----------GETS && SETS----------//

    public static int getW() {
        return w;
    }

    public static void setW(int w) {
        Admin.w = w;
    }

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
}
