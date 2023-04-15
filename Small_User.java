package Project3;

public class Small_User extends Colors{
    //--------------Variable----------------//
    private String userName;
    private String userPassword;
    private long Charge;
    public  Ticket[] ticket = new Ticket[50];
    //---------------Constructor--------------//

    public Small_User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public Small_User(){

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

    public Ticket[] getTicket() {
        return ticket;
    }

}
