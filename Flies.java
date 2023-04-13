package Project3;
public class Flies extends Colors{
    public static Flight[] fly = new Flight[50];
    private static int i;
    private static int k;
    //----------------Constructor---------------//
    public static void setFlies(Flight flies1){//ارایه برای تمام بلیط هایی که وجود دارد
        fly[i] = flies1;
        i++;
    }
    //---------------Methods-------------//

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

