package Project3;

public class Flight extends Colors{
    //--------------variable-----------//
    private  String FlightId;
    private  String Origin;
    private  String Destination;
    private  String Year;
    private  String Month;
    private  String Day;
    private  String Time;
    private  long Price;
    private  int Seat;
    //---------------Constructor------------//


    public Flight(String flightId, String origin, String destination, String year, String month, String day, String time, long price, int seat) {
        FlightId = flightId;
        Origin = origin;
        Destination = destination;
        Year = year;
        Month = month;
        Day = day;
        Time = time;
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

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
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
