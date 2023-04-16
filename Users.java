package Project3;
public class Users extends Colors{
    //--------------Variable----------------//
    public static Small_User[] users = new Small_User[50];
    private int j = 0;
    private int i = 0;
    //----------------Methods---------------//

    public void setUsers(Small_User small_user) {
        users[i] = small_user;
        i++;

    }
    //-------------Sets && Gets------------//
    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
