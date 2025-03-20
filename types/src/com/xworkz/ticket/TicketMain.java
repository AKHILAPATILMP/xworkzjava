package com.xworkz.ticket;

 class TicketMain {
    public static void main(String[] args) {
        Ticket myTicket = new Ticket(TicketType.VIP, 500);
        Cricket match = new Cricket(myTicket);

        match.watch();
        match.profit();
    }
}
