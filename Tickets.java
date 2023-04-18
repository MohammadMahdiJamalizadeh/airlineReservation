package Project3;

import java.util.Scanner;

public class Tickets extends Colors {

    //--------------Variable----------------//
    //-----------------Methods--------------//
    public void setTicket(Small_User user,Ticket ticket1){//تابع برای بلیط خریداری شده توسط مسافر
        user.ticket.ticket[user.ticket.getI()] = ticket1;
        user.ticket.setI(user.ticket.getI() + 1);
    }
    public void Buy_tickets(Small_User users1) {//تابع برای خرید بلیط
        Scanner scanner = new Scanner(System.in);
        Tickets tickets = new Tickets();
        Methods.cls();
        int x;
        while (true) {
            try {

                tickets.print_flight_list();//منوی چاپ مشخصات بلیط ها
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
                        System.out.println(ANSI_RED + "Do you want to continue?" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "1-YES     2-NO" + ANSI_RESET);
                        x = scanner.nextInt();
                        if (x == 2) {
                            Methods.wait(1);
                            break;
                        }
                    } else {
                        System.out.println(ANSI_BLACK_BOLD + "!Unfortunately, there is no empty capacity!" + ANSI_RESET);
                        Methods.wait(2);
                        break;
                    }
                } else {
                    System.out.println(ANSI_BLACK_BOLD + "!Your account balance is insufficient!" + ANSI_RESET);
                    Methods.wait(2);
                    break;
                }
            }catch (Exception a){
                System.out.println("Try Again");
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
    }
    public void print_flight_list() {// تابع چاپ لیست پرواز ها
        Methods.cls();
        System.out.println(ANSI_GREEN + "|FlightId|" + '\t' + '\t' + "|Origin|" + '\t' + "|Destination|" + '\t' + "|Date|" + '\t' + '\t' + '\t' + "|Time|" + '\t' + '\t' + "|Price|" + '\t' + '\t' + "|Seats|" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "................................................................................................" + ANSI_RESET);
        for (int i = 0; i < Flies.getI(); i++) {
            System.out.print(Colors.colors[i] + (i + 1) + "-" + "|" + Flies.fly[i].getFlightId() + "|" + ANSI_RESET + '\t' + '\t');
            System.out.print(Colors.colors[i] + "|" + Flies.fly[i].getOrigin() + "|" + ANSI_RESET + '\t' + '\t');
            System.out.print(Colors.colors[i] + "|" + Flies.fly[i].getDestination() + "|" + ANSI_RESET + '\t' + '\t');
            System.out.print(Colors.colors[i] + "|" + Flies.fly[i].getYear() + "/" + Flies.fly[i].getMonth() + "/" + Flies.fly[i].getDay() + "|" + ANSI_RESET + '\t');
            System.out.print(Colors.colors[i] + "|" + Flies.fly[i].getTime() + "|" + ANSI_RESET + '\t' + '\t');
            System.out.print(Colors.colors[i] + "|" + Flies.fly[i].getPrice() + "|" + ANSI_RESET + '\t');
            System.out.println(Colors.colors[i] + "|" + Flies.fly[i].getSeat() + "|" + ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD + "................................................................................................" + ANSI_RESET);
            Methods.wait(0/5);
        }

    }
    public void Booked_thickets(Small_User users1) {//تابع برای مشاهده بلیط های خریداری شده
        Methods.cls();
        if (users1.ticket.getI() == 0) {
            System.out.println(ANSI_RED + "* You do not have a purchased ticket *" + ANSI_RESET);
            Methods.wait(1);
            return;
        }
        Methods.wait(1);
        System.out.println(ANSI_GREEN + "|FlightId|" + '\t' + '\t' + "|Origin|" + '\t' + "|Destination|" + '\t' + "|Date|" + '\t' + '\t' + '\t' + "|Time|"
                + '\t' + '\t' + "|Price|" +'\t' + '\t' + "|TicketId|" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD + "................................................................................................" + ANSI_RESET);
        for (int i = 0; i < users1.ticket.getI(); i++) {
            System.out.print(Colors.colors[i] + (i + 1) + "-" + "|" + users1.ticket.ticket[i].getFlightId() + "|" + ANSI_RESET + '\t' + '\t');
            System.out.print(Colors.colors[i] + "|" + users1.ticket.ticket[i].getOrigin() + "|" + ANSI_RESET + '\t' + '\t');
            System.out.print(Colors.colors[i] + "|" + users1.ticket.ticket[i].getDestination() + "|" + ANSI_RESET + '\t' + '\t');
            System.out.print(Colors.colors[i] + "|" + users1.ticket.ticket[i].getYear() + "/" + users1.ticket.ticket[i].getMonth() + "/" + users1.ticket.ticket[i].getDay() + "|" + ANSI_RESET + '\t');
            System.out.print(Colors.colors[i] + "|" + users1.ticket.ticket[i].getTime() + "|" + ANSI_RESET + '\t' + '\t');
            System.out.print(Colors.colors[i] + "|" + users1.ticket.ticket[i].getPrice() + "|" + ANSI_RESET + '\t');
            System.out.println(Colors.colors[i] +"|"+ users1.ticket.ticket[i].getTicketId() + "|" + ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD + "................................................................................................" + ANSI_RESET);
            Methods.wait(0/5);
        }



    }
    //--------------Gets && Sets---------------//
    //---------------Constructor---------------//

    public Tickets() {
    }
}
