package Project3;

import java.util.Scanner;

public class Admin extends Colors{
    public static void Add_fly() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(ANSI_BLACK_BOLD + "Flight Id : " + ANSI_RESET);
            String Id = scanner.next();
            System.out.print(ANSI_BLACK_BOLD + "Origin : " + ANSI_RESET);
            String Origin = scanner.next();
            System.out.print(ANSI_BLACK_BOLD + "Destination : " + ANSI_RESET);
            String Destination = scanner.next();
            System.out.println(ANSI_BLACK_BOLD + "Date " + ANSI_RESET);
            System.out.println(ANSI_BLUE + "{" + ANSI_RESET);
            System.out.print(ANSI_WHITE_BOLD + " Year : " + ANSI_RESET);
            int Year = scanner.nextInt();
            System.out.print(ANSI_WHITE_BOLD + " Month : " + ANSI_RESET);
            int Month = scanner.nextInt();
            System.out.print(ANSI_WHITE_BOLD + " Day : " + ANSI_RESET);
            int Day = scanner.nextInt();
            System.out.println(ANSI_BLUE + "}" + ANSI_RESET);
            //----------------------//
            System.out.println(ANSI_BLACK_BOLD + "Time " + ANSI_RESET);
            System.out.println(ANSI_BLUE + "{" + ANSI_RESET);
            System.out.print(ANSI_WHITE_BOLD + " Hour : " + ANSI_RESET);
            int Hour = scanner.nextInt();
            System.out.print(ANSI_WHITE_BOLD + " Minutes : " + ANSI_RESET);
            int Minutes = scanner.nextInt();
            System.out.println(ANSI_BLUE + "}" + ANSI_RESET);
            System.out.print(ANSI_BLACK_BOLD + "Price : " + ANSI_RESET);
            Long Prince = scanner.nextLong();
            System.out.print(ANSI_BLACK_BOLD + "Seats : " + ANSI_RESET);
            int Seat = scanner.nextInt();
            Methods.wait(1);
            Methods.cls();
            Tickets tickets = new Tickets(Id,Origin,Destination,Year,Month,Day,Hour,Minutes,Prince,Seat);
            Flies.setFlies(tickets);
            System.out.println(ANSI_CYAN + "Mission accomplished" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "Do you want to continue?" + ANSI_RESET);
            System.out.println("1-YES      2-NO");
            int x = scanner.nextInt();
            if (x == 2) {
                break;
            }
        }
    }
    public static void Remove_Ticket() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Flies.print_list_fly();//تابع برای نشان دادن لیست پرواز ها
            System.out.print("Please select the desired number : ");
            int x = scanner.nextInt();
            Flies.fly[x - 1] = Flies.fly[x];
            Flies.setI(Flies.getI()-1);
            for (int i = x; i < Flies.getI(); i++) {
                Flies.fly[i] = Flies.fly[i + 1];
            }
            Methods.cls();
            System.out.println(ANSI_CYAN + "Mission accomplished" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "Do you want to continue?" + ANSI_RESET);
            System.out.println("1-YES      2-NO");
            x = scanner.nextInt();
            if (x == 2) {
                break;
            }
        }
    }
}
