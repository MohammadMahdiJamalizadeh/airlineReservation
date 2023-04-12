package Project3;

public class Small_User extends Colors{
    //--------------Variable----------------//
    private String userName;
    private String userPassword;
    private long Charge;
    public  Tickets[] tickets = new Tickets[50];
    int i;
    //---------------Constructor--------------//


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
    public void setTickets(Tickets tickets){
        this.tickets[i] = tickets;
        i++;
    }

    //-------------Sets && Gets------------//


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

    public Tickets[] getTickets() {
        return tickets;
    }

    public void setTickets(Tickets[] tickets) {
        this.tickets = tickets;
    }
}
