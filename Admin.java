package Project3;

import java.util.Scanner;

public class Admin extends Colors{
    //-------------------//
    private  String Origin;
    private  String Destination;
    private  String FlightId;
    private  long Price;
    private  String Time;
    private  String Year;
    private  String Month;
    private  String Day;
    private  int Seat;
    private  int w = 3;
    //------------Input----------//
    public  void Add_fly() {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
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
            String Year = scanner.next();
            System.out.print(ANSI_WHITE_BOLD + " Month : " + ANSI_RESET);
            String Month = scanner.next();
            System.out.print(ANSI_WHITE_BOLD + " Day : " + ANSI_RESET);
            String Day = scanner.next();
            System.out.println(ANSI_BLUE + "}" + ANSI_RESET);
            System.out.print(ANSI_BLACK_BOLD + "Time : " + ANSI_RESET);
            String Time = scanner.next();
            System.out.print(ANSI_BLACK_BOLD + "Price : " + ANSI_RESET);
            Long Prince = scanner.nextLong();
            System.out.print(ANSI_BLACK_BOLD + "Seats : " + ANSI_RESET);
            int Seat = scanner.nextInt();
            Flight flight = new Flight(Id,Origin,Destination,Year,Month,Day,Time,Prince,Seat);
            Flies.setFlies(flight);
            admin.setW(admin.getW()+1);
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
    public void Remove_Ticket() {
        Scanner scanner = new Scanner(System.in);
        Tickets tickets = new Tickets();
        while (true) {
            tickets.print_flight_list();//منوی چاپ مشخصات بلیط ها
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
    public void Update_fly(){
        Scanner scanner = new Scanner(System.in);
        Tickets tickets = new Tickets();
        while (true) {
            tickets.print_flight_list();//تابع برای نشان دادن لیست پرواز ها
            System.out.print(ANSI_BLUE+"Please select the desired ticket : "+ANSI_RESET);
            int x = scanner.nextInt();
            Methods.cls();
            Methods.wait(1);
            System.out.println(ANSI_GREEN+"|FlightId|"+'\t'+'\t'+"|Origin|"+'\t'+"|Destination|"+'\t'+"|Date|"+'\t'+'\t'+'\t'+"|Time|"+'\t'+'\t'+"|Price|"+'\t'+'\t'+"|Seats|"+ANSI_RESET);
            for (int i = x-1; i < x; i++) {
                System.out.println(ANSI_BLACK_BOLD+"................................................................................................"+ANSI_RESET);
                System.out.print(Colors.colors[i]+(i+1)+"-"+"|"+Flies.fly[i].getFlightId()+"|"+ANSI_RESET+'\t'+'\t');
                System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getOrigin()+"|"+ANSI_RESET+'\t'+'\t');
                System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getDestination()+"|"+ANSI_RESET+'\t'+'\t');
                System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getYear()+"/"+Flies.fly[i].getMonth()+"/"+Flies.fly[i].getDay()+"|"+ANSI_RESET+'\t');
                System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getTime()+"|"+ANSI_RESET+'\t'+'\t');
                System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getPrice()+"|"+ANSI_RESET+'\t');
                System.out.println(Colors.colors[i]+"|"+Flies.fly[i].getSeat()+"|"+ANSI_RESET);
                System.out.println(ANSI_BLACK_BOLD+"................................................................................................"+ANSI_RESET);

            }
            Methods.wait(1);
            System.out.print(ANSI_BLUE+"please Enter the desired part : "+ANSI_RESET);
            String a = scanner.next();
            if(a.equals("FlightId")){
                Methods.wait(1);
                System.out.print(ANSI_RED+"NEW FlightId : "+ANSI_RESET);
                FlightId = scanner.next();
                Flies.fly[x-1].setFlightId(FlightId);
            }
            else if(a.equals("Origin")){
                Methods.wait(1);
                System.out.print(ANSI_RED+"NEW Origin : "+ANSI_RESET);
                Origin = scanner.next();
                Flies.fly[x-1].setOrigin(Origin);
            }
            else if(a.equals("Destination")){
                Methods.wait(1);
                System.out.print(ANSI_RED+"NEW Destination : "+ANSI_RESET);
                Destination = scanner.next();
                Flies.fly[x-1].setDestination(Destination);

            }
            else if(a.equals("Date")){
                Methods.wait(1);
                System.out.println(ANSI_RED+"NEW Date"+ANSI_RESET);
                System.out.print(ANSI_BLACK_BOLD+"NEW YEAR : "+ANSI_RESET);
                Year = scanner.next();
                Flies.fly[x-1].setYear(Year);
                System.out.print(ANSI_BLACK_BOLD+"NEW MONTH : "+ANSI_RESET);
                Month = scanner.next();
                Flies.fly[x-1].setMonth(Month);
                System.out.print(ANSI_BLACK_BOLD+"NEW DAY : "+ANSI_RESET);
                Day = scanner.next();
                Flies.fly[x-1].setDay(Day);
            }
            else if(a.equals("Time")){
                Methods.wait(1);
                System.out.println(ANSI_RED+"NEW TIME : "+ANSI_RESET);
                Time = scanner.next();
                Flies.fly[x-1].setTime(Time);
            }
            else if(a.equals("Price")){
                Methods.wait(1);
                System.out.print(ANSI_RED+"NEW Price : "+ANSI_RESET);
                Price = scanner.nextInt();
                Flies.fly[x-1].setPrice(Price);
            }
            else if (a.equals("Seats")){
                Methods.wait(1);
                System.out.print(ANSI_RED+"NEW Seats : "+ANSI_RESET);
                Seat = scanner.nextInt();
                Flies.fly[x-1].setSeat(Seat);
            }
            Methods.wait(1);
            System.out.println(ANSI_GREEN+"The operation was successful, do you want to continue?"+ANSI_RESET);
            System.out.println("1-YES         2-NO");
            int w = scanner.nextInt();
            if (w == 2){
                break;
            }
        }
    }
    //-----------GETS && SETS----------//


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

    public long getPrice() {
        return Price;
    }

    public void setPrice(long price) {
        Price = price;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public int getSeat() {
        return Seat;
    }

    public void setSeat(int seat) {
        Seat = seat;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }
}
