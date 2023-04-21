package Project3;

import java.util.Scanner;

public class Tickets extends Colors {

    //--------------Variable----------------//
    Scanner scanner = new Scanner(System.in);
    private static int p;
    //-----------------Methods--------------//
    public void setTicket(Small_User user,Ticket ticket1){ // Save purchased tickets
        user.ticket.ticket[user.ticket.getI()] = ticket1;
        user.ticket.setI(user.ticket.getI() + 1);
        p++;
    }
    public void Buy_tickets(Small_User users1) {
        Scanner scanner = new Scanner(System.in);
        Tickets tickets = new Tickets();
//        Methods.cls();
        int x;
        while (true) {
            try {
                tickets.print_flight_list();
                System.out.print("desired number : ");
                x = scanner.nextInt();
                Methods.wait(1);
                if (users1.getCharge() > Flies.fly[x - 1].getPrice()) {
                    if (Flies.fly[x - 1].getSeat() > 0) {
                        users1.setCharge(users1.getCharge() - Flies.fly[x - 1].getPrice());
                        Flies.fly[x - 1].setSeat(Flies.fly[x - 1].getSeat() - 1);
                        int ticketid = Methods.Random();
                        System.out.println(ANSI_WHITE_BOLD + "Your ticket purchase was successful" + ANSI_RESET);
                        Methods.wait(0 / 5);
                        Ticket ticket = new Ticket(Flies.fly[x - 1].getFlightId(), Flies.fly[x - 1].getOrigin(), Flies.fly[x - 1].getDestination(), Flies.fly[x - 1].getYear(),
                                Flies.fly[x - 1].getMonth(), Flies.fly[x - 1].getDay(), Flies.fly[x - 1].getTime(), Flies.fly[x - 1].getPrice(), Flies.fly[x - 1].getSeat(), ticketid);
                        tickets.setTicket(users1, ticket);
                        Methods.wait(1);
                        System.out.println(ANSI_RED + "Do you want to continue ?" + ANSI_RESET);
                        System.out.println(ANSI_CYAN + "1-YES            2-NO" + ANSI_RESET);
                        x = scanner.nextInt();
                        if (x == 2) {
                            Methods.wait(1);
                            break;
                        }
                    } else {
                        System.out.println(ANSI_BLACK_BOLD + "!Unfortunately, there is no empty capacity!" + ANSI_RESET);
                        Methods.wait(1);
                        break;
                    }
                } else {
                    System.out.println(ANSI_BLACK_BOLD + "!Your account balance is insufficient!" + ANSI_RESET);
                    Methods.wait(1);
                    break;
                }
            }catch (Exception a){
                Methods.wait(1);
                System.out.println(ANSI_BLACK_BOLD+"! Please try again !"+ANSI_RESET);
            }
        }
    }
    public void save_fly() {
        Flight flight = new Flight("WX-12", "Yazd", "Tehran", "1402", "12", "10", "12:30", 700000, 51);
        Flies.setFlies(flight);
        Flight flight1 = new Flight("WZ-15", "Mashhad", "Ahvaz", "1402", "10", "27", "13:50", 900000, 245);
        Flies.setFlies(flight1);
        Flight flight2 = new Flight("BG-22", "Shiraz", "Tabriz", "1402", "11", "12", "8:00", 1100000, 12);
        Flies.setFlies(flight2);
        Flight flight3 = new Flight("WA-64","Tehran","Zahedan","1402","03","30","00:20",1500000,20);
        Flies.setFlies(flight3);
        Flight flight4 = new Flight("QP-28","Kerman","Tehran","1402","12","10","18:00",2000000,5);
        Flies.setFlies(flight4);
    }
    public void print_flight_list() {
//        Methods.cls();
        System.out.printf("%-20s",ANSI_GREEN + "|FlightId|"+ANSI_RESET);
        System.out.printf("%-20s",ANSI_GREEN + "|Origin|"+ANSI_RESET);
        System.out.printf("%-25s",ANSI_GREEN + "|Destination|"+ANSI_RESET);
        System.out.printf("%-25s",ANSI_GREEN + "|Date|"+ANSI_RESET);
        System.out.printf("%-20s",ANSI_GREEN + "|Time|"+ANSI_RESET);
        System.out.printf("%-20s",ANSI_GREEN + "|Price|"+ANSI_RESET);
        System.out.printf("%-15s",ANSI_GREEN + "|Seat|"+ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_BLACK_BOLD + "...................................................................................." + ANSI_RESET);
        for (int i = 0; i < Flies.getI(); i++) {
            System.out.printf("%-20s",Colors.colors[i] + (i + 1) + "-" + "|" + Flies.fly[i].getFlightId() + "|" + ANSI_RESET);
            System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getOrigin() + "|" + ANSI_RESET);
            System.out.printf("%-25s",Colors.colors[i] + "|" + Flies.fly[i].getDestination() + "|" + ANSI_RESET);
            System.out.printf("%-25s",Colors.colors[i] + "|" + Flies.fly[i].getYear() + "/" + Flies.fly[i].getMonth() + "/" + Flies.fly[i].getDay() + "|" + ANSI_RESET);
            System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getTime() + "|" + ANSI_RESET);
            System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getPrice() + "|" + ANSI_RESET);
            System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getSeat() + "|" + ANSI_RESET);
            System.out.println();
            System.out.println(ANSI_BLACK_BOLD + "...................................................................................." + ANSI_RESET);
            Methods.wait(0/5);
        }
        System.out.println();
        Methods.pressEnterToContinue();
    }
    public void Booked_thickets(Small_User users1) {
//        Methods.cls();
        if (users1.ticket.getI() == 0) {
            System.out.println(ANSI_RED + "* You do not have a purchased ticket *" + ANSI_RESET);
            Methods.wait(1);
            Methods.pressEnterToContinue();
            return;
        }
        Methods.wait(1);
        System.out.printf("%-20s",ANSI_GREEN + "|FlightId|"+ANSI_RESET);
        System.out.printf("%-20s",ANSI_GREEN + "|Origin|"+ANSI_RESET);
        System.out.printf("%-25s",ANSI_GREEN + "|Destination|"+ANSI_RESET);
        System.out.printf("%-25s",ANSI_GREEN + "|Date|"+ANSI_RESET);
        System.out.printf("%-20s",ANSI_GREEN + "|Time|"+ANSI_RESET);
        System.out.printf("%-20s",ANSI_GREEN + "|Price|"+ANSI_RESET);
        System.out.printf("%-15s",ANSI_GREEN + "|TicketId|"+ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_BLACK_BOLD + "...................................................................................." + ANSI_RESET);
        for (int i = 0; i < users1.ticket.getI(); i++) {
            System.out.printf("%-20s",Colors.colors[i] + (i + 1) + "-" + "|" + users1.ticket.ticket[i].getFlightId() + "|" + ANSI_RESET);
            System.out.printf("%-20s",Colors.colors[i] + "|" + users1.ticket.ticket[i].getOrigin() + "|" + ANSI_RESET);
            System.out.printf("%-25s",Colors.colors[i] + "|" + users1.ticket.ticket[i].getDestination() + "|" + ANSI_RESET);
            System.out.printf("%-25s",Colors.colors[i] + "|" + users1.ticket.ticket[i].getYear() + "/" + users1.ticket.ticket[i].getMonth() + "/" + users1.ticket.ticket[i].getDay() + "|" + ANSI_RESET + '\t');
            System.out.printf("%-20s",Colors.colors[i] + "|" + users1.ticket.ticket[i].getTime() + "|" + ANSI_RESET);
            System.out.printf("%-20s",Colors.colors[i] + "|" + users1.ticket.ticket[i].getPrice() + "|" + ANSI_RESET);
            System.out.printf("%-20s",Colors.colors[i] +"|"+ users1.ticket.ticket[i].getTicketId() + "|" + ANSI_RESET);
            System.out.println();
            System.out.println(ANSI_BLACK_BOLD + "...................................................................................." + ANSI_RESET);
            Methods.wait(0/5);
        }
        System.out.println();
        Methods.pressEnterToContinue();
    }
    public void Search(){
        int sum = 0;
        int Flag = 1;
        int j = 1;
        Methods.wait(1);
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "                    Search" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "-----------------------------------------------" + ANSI_RESET);
        Methods.wait(1);
        System.out.println("Select the search type :");
        System.out.println(ANSI_BLUE+"1- Based on the city"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"2- Based on the Price"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"3- Based on the Date"+ANSI_RESET);
        int x = scanner.nextInt();
        if (x == 1){
            System.out.println(ANSI_PURPLE+"Please search for the desired city :"+ANSI_RESET);
            String str = scanner.next();
            Methods.wait(1);
            for (int i = 0; i < Flies.getI(); i++) {
                if (str.equals(Flies.fly[i].getDestination()) || str.equals(Flies.fly[i].getOrigin())) {
                    if (Flag == 1){
                        System.out.printf("%-20s",ANSI_GREEN + "|FlightId|"+ANSI_RESET);
                        System.out.printf("%-20s",ANSI_GREEN + "|Origin|"+ANSI_RESET);
                        System.out.printf("%-25s",ANSI_GREEN + "|Destination|"+ANSI_RESET);
                        System.out.printf("%-25s",ANSI_GREEN + "|Date|"+ANSI_RESET);
                        System.out.printf("%-20s",ANSI_GREEN + "|Time|"+ANSI_RESET);
                        System.out.printf("%-20s",ANSI_GREEN + "|Price|"+ANSI_RESET);
                        System.out.printf("%-15s",ANSI_GREEN + "|Seat|"+ANSI_RESET);
                        System.out.println();
                        System.out.println(ANSI_BLACK_BOLD + "...................................................................................." + ANSI_RESET);
                    }
                    System.out.printf("%-20s",Colors.colors[i] + (j) + "-" + "|" + Flies.fly[i].getFlightId() + "|" + ANSI_RESET);
                    System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getOrigin() + "|" + ANSI_RESET);
                    System.out.printf("%-25s",Colors.colors[i] + "|" + Flies.fly[i].getDestination() + "|" + ANSI_RESET);
                    System.out.printf("%-25s",Colors.colors[i] + "|" + Flies.fly[i].getYear() + "/" + Flies.fly[i].getMonth() + "/" + Flies.fly[i].getDay() + "|" + ANSI_RESET );
                    System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getTime() + "|" + ANSI_RESET);
                    System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getPrice() + "|" + ANSI_RESET);
                    System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getSeat() + "|" + ANSI_RESET);
                    System.out.println();
                    System.out.println(ANSI_BLACK_BOLD + "...................................................................................." + ANSI_RESET);
                    Methods.wait(0 / 5);
                    sum++;
                    j++;
                    Flag = 0;
                }
            }
            if (sum == 0){
                System.out.println(ANSI_BLACK_BOLD+"! No flights were found with this specification !"+ANSI_RESET);
            }
        }
        if (x == 2){
            sum = 0;
            Flag = 1;
            j = 1;
            System.out.println(ANSI_BLUE+"Please enter the minimum amount"+ANSI_RESET);
            int minimum = scanner.nextInt();
            System.out.println(ANSI_BLUE+"Please enter the maximum value"+ANSI_RESET);
            int maximum = scanner.nextInt();
            Methods.wait(1);
            for (int i = 0; i < Flies.getI(); i++) {
                if (minimum <= Flies.fly[i].getPrice() &&  Flies.fly[i].getPrice() <= maximum) {
                    if (Flag == 1){
                        System.out.printf("%-20s",ANSI_GREEN + "|FlightId|"+ANSI_RESET);
                        System.out.printf("%-20s",ANSI_GREEN + "|Origin|"+ANSI_RESET);
                        System.out.printf("%-25s",ANSI_GREEN + "|Destination|"+ANSI_RESET);
                        System.out.printf("%-25s",ANSI_GREEN + "|Date|"+ANSI_RESET);
                        System.out.printf("%-20s",ANSI_GREEN + "|Time|"+ANSI_RESET);
                        System.out.printf("%-20s",ANSI_GREEN + "|Price|"+ANSI_RESET);
                        System.out.printf("%-15s",ANSI_GREEN + "|Seat|"+ANSI_RESET);
                        System.out.println();
                        System.out.println(ANSI_BLACK_BOLD + "...................................................................................." + ANSI_RESET);
                    }
                    System.out.printf("%-20s",Colors.colors[i] + (j) + "-" + "|" + Flies.fly[i].getFlightId() + "|" + ANSI_RESET);
                    System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getOrigin() + "|" + ANSI_RESET);
                    System.out.printf("%-25s",Colors.colors[i] + "|" + Flies.fly[i].getDestination() + "|" + ANSI_RESET);
                    System.out.printf("%-25s",Colors.colors[i] + "|" + Flies.fly[i].getYear() + "/" + Flies.fly[i].getMonth() + "/" + Flies.fly[i].getDay() + "|" + ANSI_RESET );
                    System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getTime() + "|" + ANSI_RESET);
                    System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getPrice() + "|" + ANSI_RESET);
                    System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getSeat() + "|" + ANSI_RESET);
                    System.out.println();
                    System.out.println(ANSI_BLACK_BOLD + "...................................................................................." + ANSI_RESET);
                    Methods.wait(0 / 5);
                    sum++;
                    j++;
                    Flag = 0;
                }
            }
            if (sum == 0){
                System.out.println(ANSI_BLACK_BOLD+"! No flights were found with this specification !"+ANSI_RESET);
            }
        }
        if (x == 3){
            sum = 0;
            Flag = 1;
            j = 1;
            String year;
            String month;
            String day;
            System.out.print(ANSI_RED+"Please enter the Year : "+ANSI_RESET);
            year = scanner.next();
            System.out.print(ANSI_RED+"Please enter the Month : "+ANSI_RESET);
            month = scanner.next();
            System.out.print(ANSI_RED+"Please enter the Day : "+ANSI_RESET);
            day = scanner.next();
            Methods.wait(1);
            for (int i = 0; i < Flies.getI(); i++) {
                if ((year.equals(Flies.fly[i].getYear())) && (month.equals(Flies.fly[i].getMonth())) && (day.equals(Flies.fly[i].getDay()))) {
                    if (Flag == 1){
                        System.out.printf("%-20s",ANSI_GREEN + "|FlightId|"+ANSI_RESET);
                        System.out.printf("%-20s",ANSI_GREEN + "|Origin|"+ANSI_RESET);
                        System.out.printf("%-25s",ANSI_GREEN + "|Destination|"+ANSI_RESET);
                        System.out.printf("%-25s",ANSI_GREEN + "|Date|"+ANSI_RESET);
                        System.out.printf("%-20s",ANSI_GREEN + "|Time|"+ANSI_RESET);
                        System.out.printf("%-20s",ANSI_GREEN + "|Price|"+ANSI_RESET);
                        System.out.printf("%-15s",ANSI_GREEN + "|Seat|"+ANSI_RESET);
                        System.out.println();
                        System.out.println(ANSI_BLACK_BOLD + "...................................................................................." + ANSI_RESET);
                    }
                    System.out.printf("%-20s",Colors.colors[i] + (j) + "-" + "|" + Flies.fly[i].getFlightId() + "|" + ANSI_RESET);
                    System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getOrigin() + "|" + ANSI_RESET);
                    System.out.printf("%-25s",Colors.colors[i] + "|" + Flies.fly[i].getDestination() + "|" + ANSI_RESET);
                    System.out.printf("%-25s",Colors.colors[i] + "|" + Flies.fly[i].getYear() + "/" + Flies.fly[i].getMonth() + "/" + Flies.fly[i].getDay() + "|" + ANSI_RESET );
                    System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getTime() + "|" + ANSI_RESET);
                    System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getPrice() + "|" + ANSI_RESET);
                    System.out.printf("%-20s",Colors.colors[i] + "|" + Flies.fly[i].getSeat() + "|" + ANSI_RESET);
                    System.out.println();
                    System.out.println(ANSI_BLACK_BOLD + "...................................................................................." + ANSI_RESET);
                    Methods.wait(0 / 5);
                    sum++;
                    j++;
                    Flag = 0;
                }
            }
        }
        System.out.println();
        Methods.pressEnterToContinue();
    }
    //---------------Constructor---------------//

    public Tickets() {
    }
    //--------------Sets && Gets-------------//

    public static int getP() {
        return p;
    }

    public static void setP(int p) {
        Tickets.p = p;
    }
}
