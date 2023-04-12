package Project3;
public class Flies extends Colors{
    public static Tickets[] fly = new Tickets[50];
    public Tickets[] Buy_tickets = new Tickets[50];
    private static int i;
    private static int k;
    //----------------Constructor---------------//
    public static void setFlies(Tickets flies1){//ارایه برای تمام بلیط هایی که وجود دارد
        fly[i] = flies1;
        i++;
    }
    //---------------Methods-------------//
    public  void setTickets(Tickets ticket){//ارایه برای بلیط های خریداری شده
        this.Buy_tickets[k] = ticket;
        k++;
    }
    //--------------SETS && GETS------------//

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Flies.i = i;
    }

    public static int getK() {
        return k;
    }

    public static void setK(int k) {
        Flies.k = k;
    }
}

