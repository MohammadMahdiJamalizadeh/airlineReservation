package Project3;

public class Small_User extends Colors{
    //--------------Variable----------------//
    private String userName;
    private String userPassword;
    private long Charge;
    public  static Ticket[] ticket = new Ticket[50];
    private static int i = 0;
    //---------------Constructor--------------//
    public static void setTicket(Ticket ticket){//تابع برای بلیط خریداری شده توسط مسافر
        Small_User.ticket[i] = ticket;
        i++;
    }
    public Small_User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public Small_User(){

    }

    //----------------Methods---------------//
//    public static void print_info(){//تابع برای نمایش اطلاعات کاربر
//        Methods.cls();
//        System.out.println(ANSI_CYAN+"YOUR USERNAME : "+ANSI_RESET+ANSI_CYAN+Small_User.getUserName()+ANSI_RESET);
//        System.out.println(ANSI_CYAN+"YOUR PASSWORD : "+ANSI_RESET+ANSI_CYAN+Small_User.getUserPassword()+ANSI_RESET);
//        System.out.print(ANSI_BLACK_BOLD+"Your current account balance : "+ANSI_RESET);
//        System.out.printf("%,d%n",Small_User.getCharge());
//        Methods.wait(3);
//    }


    //-------------Sets && Gets------------//
    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Small_User.i = i;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public long getCharge() {
        return Charge;
    }

    public void setCharge(long charge) {
        Charge = charge;
    }

    public Ticket[] getTicket() {
        return ticket;
    }

}
