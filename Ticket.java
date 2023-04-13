package Project3;

public class Ticket {
    //-----------variable------------//
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
    //----------constructor----------//
    public Ticket(String flightId, String origin, String destination, int year, int month, int day, int hour, int minute, long price,int seats) {
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
    //----------Sets && Gets---------//
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
