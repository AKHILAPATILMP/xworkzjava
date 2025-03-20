package com.xworkz.ticket;

 public class Ticket {
    TicketType type;
    int cost;

    public Ticket(TicketType type, int cost) {
        this.type = type;
        this.cost = cost;
    }

     public void buy() {
        System.out.println("Bought a " + type + " ticket for Rs " + cost);
    }

     public void sell() {
        System.out.println("Sold a " + type + " ticket for Rs " + cost);
    }
}

