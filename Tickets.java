package Project3;

import java.util.Scanner;

public class Tickets extends Colors{
    //--------------Variable----------------//
    private static int sum = 0;
    //-----------------Methods--------------//
    public static void Buy_tickets(Small_User users1){//تابع برای خرید بلیط
        Scanner scanner = new Scanner(System.in);
        Methods.cls();
        int x;
        while (true) {
            Tickets.print_flight_list();//منوی چاپ مشخصات بلیط ها
            System.out.print("desired number : ");
            x = scanner.nextInt();
            Methods.wait(1);
            if (users1.getCharge() > Flies.fly[x-1].getPrice()) {
                if (Flies.fly[x-1].getSeat() > 0) {
                    users1.setCharge(users1.getCharge()-Flies.fly[x-1].getPrice());
                    Flies.fly[x - 1].setSeat(Flies.fly[x-1].getSeat()- 1);
                    System.out.println(ANSI_WHITE_BOLD + "Your ticket purchase was successful" + ANSI_RESET);
                    Methods.wait(1);
                    //---------------------//
                    Ticket.setFlightId(Flies.fly[x-1].getFlightId());
                    Ticket.setOrigin(Flies.fly[x-1].getOrigin());
                    Ticket.setDestination(Flies.fly[x-1].getDestination());
                    Ticket.setYear(Flies.fly[x-1].getYear());
                    Ticket.setMonth(Flies.fly[x-1].getMonth());
                    Ticket.setDay(Flies.fly[x-1].getDay());
                    Ticket.setHour(Flies.fly[x-1].getHour());
                    Ticket.setMinute(Flies.fly[x-1].getMinute());
                    Ticket.setPrice(Flies.fly[x-1].getPrice());
                    Ticket.setSeat(Flies.fly[x-1].getSeat());
                    Ticket ticket = new Ticket(Ticket.getFlightId(),Ticket.getOrigin(),Ticket.getDestination(),Ticket.getYear(),Ticket.getMonth(),Ticket.getDay(),Ticket.getHour(),Ticket.getMinute(),Ticket.getPrice(),Ticket.getSeat());
                    Small_User.setTicket(ticket);
                    //------------------------//
                    System.out.println(ANSI_RED + "Do you want to continue?" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "1-YES     2-NO" + ANSI_RESET);
                    x = scanner.nextInt();
                    if(x == 2){
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
        }
    }
    public void save_fly(){
        Flight flight = new Flight("WX-12","Yazd","Tehran",1402,12,10,12,30,700000,51);
        Flies.setFlies(flight);
        Flight flight1 = new Flight("WZ-15","Mashhad","Ahvaz",1402,10,27,8,50,900000,245);
        Flies.setFlies(flight1);
        Flight flight2 = new Flight("BG-22","Shiraz","Tabriz",1402,11,12,12,00,1100000,12);
        Flies.setFlies(flight2);
    }
    public static void print_flight_list(){// تابع چاپ لیست پرواز ها
        Methods.cls();
        System.out.println(ANSI_GREEN+"|FlightId|"+'\t'+'\t'+"|Origin|"+'\t'+"|Destination|"+'\t'+"|Date|"+'\t'+'\t'+'\t'+"|Time|"+'\t'+'\t'+"|Price|"+'\t'+'\t'+"|Seats|"+ANSI_RESET);
        System.out.println(ANSI_BLACK_BOLD+"................................................................................................"+ANSI_RESET);
        for (int i = 0; i < Flies.getI(); i++) {
            System.out.print(Colors.colors[i]+(i+1)+"-"+"|"+Flies.fly[i].getFlightId()+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getOrigin()+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getDestination()+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getYear()+"/"+Flies.fly[i].getMonth()+"/"+Flies.fly[i].getDay()+"|"+ANSI_RESET+'\t');
            System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getHour()+":"+Flies.fly[i].getMinute()+"|"+ANSI_RESET+'\t'+'\t');
            System.out.print(Colors.colors[i]+"|"+Flies.fly[i].getPrice()+"|"+ANSI_RESET+'\t');
            System.out.println(Colors.colors[i]+"|"+Flies.fly[i].getSeat()+"|"+ANSI_RESET);
            System.out.println(ANSI_BLACK_BOLD+"................................................................................................"+ANSI_RESET);
        }
        Methods.wait(1);
    }

//    public static void Ticket_cancellation(Flies flies){//تابع برای گنسل کردن بلیط
//        Scanner scanner = new Scanner(System.in);
//        Methods.cls();
//        Booked_thickets();
//        System.out.print(ANSI_PURPLE+"Please select the desired ticket number : "+ANSI_RESET);
//        int x = scanner.nextInt();
//        flies.tickets[x-1] = flies.tickets[x];
//        Flies.setK(Flies.getK()-1);
//        for (int i = x; i < Flies.getK(); i++) {
//            flies.tickets[i] = flies.tickets[i+1];
//        }
//        System.out.println(ANSI_GREEN+"Mission accomplished"+ANSI_RESET);
//        Seats[x-1]++;
//        Methods.wait(2);
//    }
    public static void Booked_thickets(Small_User users1) {//تابع برای مشاهده بلیط های خریداری شده
        Methods.cls();

        if (users1.getI() == 0) {
            System.out.println(ANSI_RED + "* You do not have a purchased ticket *" + ANSI_RESET);
            Methods.wait(2);
            return;
        }
        for (int i = 0; i < Small_User.getI(); i++) {
            System.out.print(Colors.colors[i] + (i + 1) + "-" + "|" + users1.ticket[i].getFlightId()+ "|" + ANSI_RESET + '\t' + '\t');
            System.out.print(Colors.colors[i] + "|" + users1.ticket[i].getOrigin() + "|" + ANSI_RESET + '\t' + '\t');
            System.out.print(Colors.colors[i] + "|" + users1.ticket[i].getDestination() + "|" + ANSI_RESET + '\t' + '\t');
            System.out.print(Colors.colors[i] + "|" + users1.ticket[i].getYear() + "/" + users1.ticket[i].getMonth() + "/" + users1.ticket[i].getDay() + "|" + ANSI_RESET + '\t');
            System.out.print(Colors.colors[i] + "|" + users1.ticket[i].getHour() + ":" + users1.ticket[i].getMinute() + "|" + ANSI_RESET + '\t' + '\t');
            System.out.println(Colors.colors[i] + "|" + users1.ticket[i].getPrice() + "|" + ANSI_RESET + '\t');
            Methods.wait(1);
        }
    }


}
