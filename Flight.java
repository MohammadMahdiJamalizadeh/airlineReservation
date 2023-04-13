package Project3;

public class Flight extends Colors{
    //--------------variable-----------//
    private  String FlightId;
    private  String Origin;
    private  String Destination;
    private  int Year;
    private  int Month;
    private  int Day;
    private  int Hour;
    private  int Minute;
    private  long Price;
    private  int Seat;
    //---------------Constructor------------//


    public Flight(String flightId, String origin, String destination, int year, int month, int day, int hour, int minute, long price, int seat) {
        FlightId = flightId;
        Origin = origin;
        Destination = destination;
        Year = year;
        Month = month;
        Day = day;
        Hour = hour;
        Minute = minute;
        Price = price;
        Seat = seat;
    }
    //----------------Sets && Gets-------------//

    public String getFlightId() {
        return FlightId;
    }

    public void setFlightId(String flightId) {
        FlightId = flightId;
    }

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

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getHour() {
        return Hour;
    }

    public void setHour(int hour) {
        Hour = hour;
    }

    public int getMinute() {
        return Minute;
    }

    public void setMinute(int minute) {
        Minute = minute;
    }

    public long getPrice() {
        return Price;
    }

    public void setPrice(long price) {
        Price = price;
    }

    public int getSeat() {
        return Seat;
    }

    public void setSeat(int seat) {
        Seat = seat;
    }

}
