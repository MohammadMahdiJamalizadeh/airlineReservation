package Project3;
public class Users extends Colors{
    //--------------Variable----------------//
    public static Small_User[] users = new Small_User[50];
    private static int i;
    private static int j;
    //----------------Methods---------------//

    public void setUsers(Small_User small_user) {
        users[i] = small_user;
        i++;
    }
    //-------------Sets && Gets------------//


    public static int getI() {
        return i;
    }
    public static void setI(int i) {
        Users.i = i;
    }

    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        Users.j = j;
    }
}
