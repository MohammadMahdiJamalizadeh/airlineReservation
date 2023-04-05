package Project3;

public class Small_User {
    //--------------Variable----------------//
    private static String userName;
    private static String userPassword;
    private static String userTicket;
    //----------------Constructor---------------//

    //-------------Sets && Gets------------//


    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        Small_User.userName = userName;
    }

    public static String getUserPassword() {
        return userPassword;
    }

    public static void setUserPassword(String userPassword) {
        Small_User.userPassword = userPassword;
    }
}
