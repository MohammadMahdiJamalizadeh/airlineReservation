package Project3;
public class Users extends Colors{
    //--------------Variable----------------//
//    public static String[] users = new String[50];
//    public static String[] password = new String[50];
    public Small_User[] users = new Small_User[50];
    private static int i;
    private static int j;
//    private static Small_User small_user;
    //----------------Methods---------------//

    public void setUsers(Small_User small_user) {
        users[i] = small_user;
        i++;
    }

//    public static void setUserss(String users1){
//        Users.users[Users.i] = users1;
//        Users.i ++;
//    }
//    public static void setPassword(String password1){
//        Users.password[Users.j] = password1;
//        Users.j ++;
//    }
    //-------------Sets && Gets------------//


    public static int getI() {
        return i;
    }
    public static int getI1() {
        return i-1;
    }
    public static void setI(int i) {
        Users.i = i;
    }

}
