package Project3;
public class Users extends Colors{
    //--------------Variable----------------//
    public static String[] users = new String[50];
    public static String[] password = new String[50];
    public static Tickets[] tickets = new Tickets[50];
    private static int i;
    private static int j;
    private static int k;
    private static Small_User small_user;
    //----------------Methods---------------//
    public static void setTickets(Tickets ticket){//ارایه برای بلیط های خریداری شده
        tickets[k] = ticket;
        System.out.println(tickets[k].toString());
        k++;
    }
    public static void setUserss(String users1){
        Users.users[Users.i] = users1;
        Users.i ++;
    }
    public static void setPassword(String password1){
        Users.password[Users.j] = password1;
        Users.j ++;
    }
    //-------------Sets && Gets------------//
    public static Small_User getSmall_user() {
        return small_user;
    }

    public static void setSmall_user(Small_User small_user) {
        Users.small_user = small_user;
    }

    public static int getI() {
        return i;
    }
    public static int getI1() {
        return i-1;
    }
    public static void setI(int i) {
        Users.i = i;
    }

    public static int getK() {
        return k;
    }

    public static void setK(int k) {
        Users.k = k;
    }
}
