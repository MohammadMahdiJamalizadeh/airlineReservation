package Project3;
public class Users extends Colors{
    //--------------Variable----------------//
    public static Small_User[] users = new Small_User[50];
    private static int j = 0;
    private static int q;
    private int i = 0;
    //----------------Methods---------------//

    public void setUsers(Small_User small_user) {//save Users
        users[i] = small_user;
        i++;
        q++;
    }
    //-------------Sets && Gets------------//
    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        Users.j = j;
    }

    public int getI() {
        return i;
    }

    public static int getQ() {
        return q;
    }

    public static void setQ(int q) {
        Users.q = q;
    }

    public void setI(int i) {
        this.i = i;
    }
}
