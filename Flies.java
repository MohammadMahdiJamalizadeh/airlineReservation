package Project3;
public class Flies extends Colors{
    public   static Tickets[] fly = new Tickets[50];
//    private  static String Origin_fly;
//    private  static String Destination_fly;
//    private  static String FlightId_fly;
//    private  static long Price_fly;
//    private  static int Hour_fly;
//    private  static int Minute_fly;
//    private  static int Year_fly;
//    private  static int Month_fly;
//    private  static int Day_fly;
//    private  static int Seat_fly;
    private static int i;
    //----------------Constructor---------------//
//    public  Flies(String Id,String Origin,String Destination,int Year,int Month,int Day,int Hour,int Minutes,Long Price,int Seats){
//        FlightId_fly = Id;
//        Origin_fly = Origin;
//        Destination_fly = Destination;
//        Year_fly = Year;
//        Month_fly = Month;
//        Day_fly = Day;
//        Hour_fly = Hour;
//        Minute_fly = Minutes;
//        Price_fly = Price;
//        Seat_fly = Seats;
//    }
    public static void setFlies(Tickets flies1){//ارایه برای تمام بلیط هایی که وجود دارد
        fly[i] = flies1;
        i++;
    }
    //---------------Methods-------------//
    public static void print_list_fly(){
        for (int j = 0; j < getI(); j++) {
            System.out.println(Colors.colors[j]+(j + 1)+"- "+fly[j]+ANSI_RESET);
        }
        Methods.wait(2);
    }
    //--------------SETS && GETS------------//

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Flies.i = i;
    }

}

